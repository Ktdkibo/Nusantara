package com.proyek.nusantara.MasukAplikasi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.proyek.nusantara.MainActivity;
import com.proyek.nusantara.R;
import com.proyek.nusantara.databinding.ActivityLoginBinding;

import java.util.UUID;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    private FirebaseFirestore db;
    private SessionManager session;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        db = FirebaseFirestore.getInstance();
        session = new SessionManager(this);

        setupAction();

        TextView tvLupaPassword = findViewById(R.id.tvLupaPassword);
        tvLupaPassword.setOnClickListener(v -> {
            EditText input = new EditText(this);
            input.setHint("Masukkan email Anda");
            new AlertDialog.Builder(this)
                    .setTitle("Reset Password")
                    .setMessage("Masukkan email yang terdaftar:")
                    .setView(input)
                    .setPositiveButton("Kirim", (dialog, which) -> {
                        String email = input.getText().toString().trim();
                        if (email.isEmpty()) {
                            Toast.makeText(this, "Email tidak boleh kosong", Toast.LENGTH_SHORT).show();
                        } else {
                            kirimTokenResetPassword(email);
                        }
                    })
                    .setNegativeButton("Batal", null)
                    .show();
        });
    }

    private void kirimTokenResetPassword(String emailPengguna) {
        String token = UUID.randomUUID().toString();
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("users")
                .whereEqualTo("email", emailPengguna)
                .get()
                .addOnSuccessListener(query -> {
                    if (!query.isEmpty()) {
                        DocumentReference userRef = query.getDocuments().get(0).getReference();
                        userRef.update("resetToken", token)
                                .addOnSuccessListener(aVoid -> {
                                    // Simulasi: tampilkan pesan sukses
                                    Toast.makeText(this, "Token reset telah dikirim ke email", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(this, ResetPassword.class);
                                    intent.putExtra("email", emailPengguna); // opsional, untuk mengisi otomatis field email
                                    startActivity(intent);
                                });
                    } else {
                        Toast.makeText(this, "Email tidak ditemukan.", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(e -> {
                    Toast.makeText(this, "Terjadi kesalahan.", Toast.LENGTH_SHORT).show();
                });
    }

    private void setupAction() {
        binding.tvRegister.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        });

        binding.btnLogin.setOnClickListener(v -> {
            String email = binding.etEmail.getText().toString().trim();
            String password = binding.etPassword.getText().toString();

            if (email.isEmpty() || password.isEmpty()){
                Toast.makeText(LoginActivity.this, "Email atau Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
            } else {
                checkAkun(email, password);
            }
        });
    }

    private void checkAkun(String email, String password) {
        db.collection("users")
                .whereEqualTo("email", email)
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful() && !task.getResult().isEmpty()) {
                        boolean isPasswordCorrect = false;
                        String userId = null, userName = null, userToken = null;

                        for (QueryDocumentSnapshot doc : task.getResult()) {
                            String storedPassword = doc.getString("password");
                            if (storedPassword != null && storedPassword.equals(password)) {
                                isPasswordCorrect = true;
                                userId    = doc.getId();
                                userName  = doc.getString("name");   // asumsikan ada field "name"
                                userToken = doc.getString("token");  // atau token jika ada
                                break;
                            }
                        }

                        if (isPasswordCorrect) {
                            // Simpan session
                            session.createSession(userId, userName, userToken);

                            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                            finish(); // agar user tidak bisa kembali ke Login
                        } else {
                            Toast.makeText(this, "Password Salah", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(this, "Akun Tidak Ditemukan", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(e ->
                        Toast.makeText(this, "Gagal Login: " + e.getMessage(), Toast.LENGTH_SHORT).show()
                );
    }
}