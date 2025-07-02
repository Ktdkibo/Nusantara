package com.proyek.nusantara.MasukAplikasi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.firestore.FirebaseFirestore;
import com.proyek.nusantara.R;

public class ResetPassword extends AppCompatActivity {
    private EditText etEmail, etToken, etNewPassword;
    private Button btnReset;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reset_password);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etEmail = findViewById(R.id.etEmail);
        etToken = findViewById(R.id.etToken);
        etNewPassword = findViewById(R.id.etNewPassword);
        btnReset = findViewById(R.id.btnReset);
        db = FirebaseFirestore.getInstance();

        btnReset.setOnClickListener(v -> {
            String email = etEmail.getText().toString().trim();
            String token = etToken.getText().toString().trim();
            String newPassword = etNewPassword.getText().toString();

            if (email.isEmpty() || token.isEmpty() || newPassword.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi", Toast.LENGTH_SHORT).show();
                return;
            }

            db.collection("users")
                    .whereEqualTo("email", email)
                    .whereEqualTo("resetToken", token)
                    .get()
                    .addOnSuccessListener(query -> {
                        if (!query.isEmpty()) {
                            query.getDocuments().get(0).getReference()
                                    .update("password", newPassword, "resetToken", null)
                                    .addOnSuccessListener(aVoid -> {
                                        Toast.makeText(this, "Password berhasil direset", Toast.LENGTH_SHORT).show();
                                        finish();
                                    });
                        } else {
                            Toast.makeText(this, "Token atau email salah", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .addOnFailureListener(e -> {
                        Toast.makeText(this, "Terjadi kesalahan", Toast.LENGTH_SHORT).show();
                    });
        });
    }
}