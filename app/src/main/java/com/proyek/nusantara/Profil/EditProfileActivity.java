package com.proyek.nusantara.Profil;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;
import com.proyek.nusantara.R;
import com.proyek.nusantara.MasukAplikasi.SessionManager;
import com.proyek.nusantara.Postingan.Util;

import java.io.InputStream;

public class EditProfileActivity extends AppCompatActivity {

    private static final int MAX_IMAGE_SIZE = 1024 * 1024; // 1MB in bytes
    private EditText etNama;
    private Button btnUpdate, btnBack;
    private ImageView avatar;
    private ProgressBar loadingProgress;
    private Uri selectedImageUri;
    private String currentUid;
    private SessionManager session;

    private final ActivityResultLauncher<String> pickImage = registerForActivityResult(
            new ActivityResultContracts.GetContent(),
            uri -> {
                if (uri != null) {
                    if (isImageSizeValid(uri)) {
                        selectedImageUri = uri;
                        avatar.setImageURI(uri);
                    } else {
                        Toast.makeText(this, "Ukuran gambar maksimal 1MB", Toast.LENGTH_SHORT).show();
                    }
                }
            }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        session = new SessionManager(this);
        currentUid = session.getUserId();

        // Initialize views
        etNama = findViewById(R.id.etNama);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnBack = findViewById(R.id.btnBack);
        avatar = findViewById(R.id.avatar);
        loadingProgress = findViewById(R.id.loadingProgress);

        // Load current profile data
        loadProfileData();

        // Set up click listeners
        avatar.setOnClickListener(v -> pickImage.launch("image/*"));
        btnBack.setOnClickListener(v -> finish());

        btnUpdate.setOnClickListener(v -> {
            loadingProgress.setVisibility(View.VISIBLE);
            String newName = etNama.getText().toString().trim();

            if (newName.isEmpty()) {
                etNama.setError("Nama tidak boleh kosong");
                loadingProgress.setVisibility(View.GONE);
                return;
            }

            // Update name in Firestore
            FirebaseFirestore.getInstance()
                    .collection("users")
                    .document(currentUid)
                    .update("nama", newName)
                    .addOnSuccessListener(aVoid -> {
                        if (selectedImageUri != null) {
                            String base64Image = uriToBase64(selectedImageUri);
                            FirebaseFirestore.getInstance()
                                    .collection("users")
                                    .document(currentUid)
                                    .update("profileImage", base64Image)
                                    .addOnSuccessListener(aVoid2 -> {
                                        loadingProgress.setVisibility(View.GONE);
                                        Toast.makeText(EditProfileActivity.this, "Profil berhasil diperbarui", Toast.LENGTH_SHORT).show();
                                        finish();
                                    })
                                    .addOnFailureListener(e -> {
                                        loadingProgress.setVisibility(View.GONE);
                                        Toast.makeText(EditProfileActivity.this, "Gagal mengupload foto: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                                    });
                        } else {
                            loadingProgress.setVisibility(View.GONE);
                            Toast.makeText(EditProfileActivity.this, "Profil berhasil diperbarui", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    })
                    .addOnFailureListener(e -> {
                        loadingProgress.setVisibility(View.GONE);
                        Toast.makeText(EditProfileActivity.this, "Gagal memperbarui profil: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    });
        });
    }

    private void loadProfileData() {
        loadingProgress.setVisibility(View.VISIBLE);
        FirebaseFirestore.getInstance()
                .collection("users")
                .document(currentUid)
                .get()
                .addOnSuccessListener(documentSnapshot -> {
                    if (documentSnapshot.exists()) {
                        String nama = documentSnapshot.getString("nama");
                        String base64Image = documentSnapshot.getString("profileImage");

                        etNama.setText(nama);
                        if (base64Image != null && !base64Image.isEmpty()) {
                            Bitmap bitmap = Util.base64ToBitmap(base64Image);
                            avatar.setImageBitmap(bitmap);
                        } else {
                            avatar.setImageResource(R.drawable.ic_launcher_foreground);
                        }
                    }
                    loadingProgress.setVisibility(View.GONE);
                })
                .addOnFailureListener(e -> {
                    loadingProgress.setVisibility(View.GONE);
                    Toast.makeText(this, "Gagal memuat data: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                });
    }

    private String uriToBase64(Uri uri) {
        try {
            InputStream inputStream = getContentResolver().openInputStream(uri);
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            inputStream.close();
            return Base64.encodeToString(bytes, Base64.DEFAULT);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private boolean isImageSizeValid(Uri uri) {
        try {
            InputStream inputStream = getContentResolver().openInputStream(uri);
            int size = inputStream.available();
            inputStream.close();
            return size <= MAX_IMAGE_SIZE;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
} 