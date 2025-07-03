package com.proyek.nusantara.MasukAplikasi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.proyek.nusantara.R;
import com.proyek.nusantara.databinding.ActivityRegisterBinding;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding binding;
    private FirebaseFirestore db;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        db = FirebaseFirestore.getInstance();
        mAuth = FirebaseAuth.getInstance();

        setupAction();
    }

    private void setupAction() {
        binding.tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = binding.etEmail.getText().toString();
                String nama = binding.etNama.getText().toString();
                String password = binding.etPassword.getText().toString();

                if (email.isEmpty() || nama.isEmpty() || password.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Lengkapi data", Toast.LENGTH_SHORT).show();
                } else if (!email.endsWith("@gmail.com")) {
                    Toast.makeText(RegisterActivity.this, "Gunakan @gmail.com", Toast.LENGTH_SHORT).show();
                } else if (password.length() < 6) {
                    Toast.makeText(RegisterActivity.this, "Password minimal 6 karakter", Toast.LENGTH_SHORT).show();
                }else {
                    buatAkun(email, nama, password);
                }
            }
        });
    }

    private void buatAkun(String email, String nama, String password) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        FirebaseUser firebaseUser = mAuth.getCurrentUser();
                        String userId = firebaseUser.getUid();

                        // Simpan data tambahan ke Firestore
                        Map<String, Object> user = new HashMap<>();
                        user.put("email", email);
                        user.put("nama", nama);

                        db.collection("users").document(userId)
                                .set(user)
                                .addOnSuccessListener(aVoid -> {
                                    Toast.makeText(RegisterActivity.this, "Berhasil Membuat Akun", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                                    finish();
                                })
                                .addOnFailureListener(e -> {
                                    Toast.makeText(RegisterActivity.this, "Gagal Menyimpan Data", Toast.LENGTH_SHORT).show();
                                });
                    } else {
                        Toast.makeText(RegisterActivity.this, "Gagal Membuat Akun: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }
}