package com.proyek.nusantara.Profil;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.proyek.nusantara.Postingan.DetailActivity;
import com.proyek.nusantara.Postingan.EditKegiatanActivity;
import com.proyek.nusantara.Postingan.Kegiatan;
import com.proyek.nusantara.MasukAplikasi.LoginActivity;
import com.proyek.nusantara.R;
import com.proyek.nusantara.MasukAplikasi.SessionManager;
import com.proyek.nusantara.Postingan.Util;
import com.proyek.nusantara.adapters.ProfileKegiatanAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvNama, tvEmail;
    private EditText etSearch;
    private Button btnLogout, btnUpdate;
    private FloatingActionButton fabback;
    private RecyclerView rvKegiatan;
    private ProfileKegiatanAdapter adapter;
    private FirebaseAuth mAuth;
    private SessionManager session;
    private String currentUid;
    private ImageView avatar;
    private ProgressBar loadingProgress;
    private List<Kegiatan> allKegiatan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ProfileActivity", "onCreate dijalankan");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        session = new SessionManager(this);
        mAuth = FirebaseAuth.getInstance();

        // Cek session
        if (!session.isLoggedIn()) {
            startActivity(new Intent(this, LoginActivity.class)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
            finish();
            return;
        }

        // Ambil currentUid dari session
        currentUid = session.getUserId();

        // Inisialisasi komponen UI
        tvNama = findViewById(R.id.tvNama);
        tvEmail = findViewById(R.id.tvEmail);
        btnLogout = findViewById(R.id.btnLogout);
        btnUpdate = findViewById(R.id.btnUpdate);
        fabback = findViewById(R.id.fabback);
        rvKegiatan = findViewById(R.id.rvKegiatanProfil);
        avatar = findViewById(R.id.avatar);
        loadingProgress = findViewById(R.id.loadingProgress);
        etSearch = findViewById(R.id.etSearch);

        loadingProgress.setVisibility(View.VISIBLE);

        // Set up RecyclerView
        rvKegiatan.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ProfileKegiatanAdapter(this, new ProfileKegiatanAdapter.OnProfileActionListener() {
            @Override
            public void onViewDetail(Kegiatan item) {
                Intent i = new Intent(ProfileActivity.this, DetailActivity.class);
                i.putExtra("postId", item.getId());
                startActivity(i);
            }

            @Override
            public void onEdit(Kegiatan item) {
                Intent i = new Intent(ProfileActivity.this, EditKegiatanActivity.class);
                i.putExtra("postId", item.getId());
                startActivity(i);
            }

            @Override
            public void onDelete(Kegiatan item) {
                new AlertDialog.Builder(ProfileActivity.this)
                        .setTitle("Hapus Postingan")
                        .setMessage("Yakin ingin menghapus “" + item.getJudul() + "”?")
                        .setPositiveButton("Hapus", (d, w) -> deletePost(item.getId()))
                        .setNegativeButton("Batal", null)
                        .show();
            }
        });
        rvKegiatan.setAdapter(adapter);

        // Load user posts
        loadUserPosts();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(bars.left, bars.top, bars.right, bars.bottom);
            return insets;
        });

        // Back FAB
        fabback.setOnClickListener(v -> finish());

        // Logout button
        btnLogout.setOnClickListener(v -> confirmLogout());

        // Edit profile button
        btnUpdate.setOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, EditProfileActivity.class);
            startActivity(intent);
        });

        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String query = s.toString().toLowerCase();
                if (query.isEmpty()) {
                    adapter.submitList(new ArrayList<>(allKegiatan));
                    return;
                }

                List<Kegiatan> filteredList = new ArrayList<>();
                for (Kegiatan kegiatan : allKegiatan) {
                    if (kegiatan.getJudul().toLowerCase().contains(query) ||
                            kegiatan.getIsiCerita().toLowerCase().contains(query)) {
                        filteredList.add(kegiatan);
                    }
                }
                adapter.submitList(filteredList);
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    private void confirmLogout() {
        new AlertDialog.Builder(this)
                .setTitle("Konfirmasi Logout")
                .setMessage("Apakah Anda yakin ingin logout?")
                .setPositiveButton("Ya", (d, w) -> {
                    session.logout(); // Clear session
                    mAuth.signOut(); // Sign out from Firebase
                    Intent intent = new Intent(this, LoginActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                })
                .setNegativeButton("Tidak", null)
                .setCancelable(false)
                .show();
    }

    private void loadUserPosts() {
        Log.d("ProfileActivity", "Loading posts for userId: " + currentUid);
        loadingProgress.setVisibility(View.VISIBLE);

        FirebaseFirestore.getInstance()
                .collection("kegiatan")
                .whereEqualTo("userId", currentUid)
                .orderBy("tanggal", Query.Direction.DESCENDING)
                .get()
                .addOnSuccessListener(querySnapshot -> {
                    allKegiatan.clear();
                    for (QueryDocumentSnapshot doc : querySnapshot) {
                        Log.d("ProfileActivity", "Doc found: " + doc.getId());
                        Kegiatan kegiatan = doc.toObject(Kegiatan.class);
                        kegiatan.setId(doc.getId());
                        allKegiatan.add(kegiatan);
                    }
                    adapter.submitList(new ArrayList<>(allKegiatan));
                    loadingProgress.setVisibility(View.GONE);
                })
                .addOnFailureListener(e -> {
                    loadingProgress.setVisibility(View.GONE);
                    Toast.makeText(this, "Gagal memuat kegiatan: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                });
    }

    private void deletePost(String postId) {
        loadingProgress.setVisibility(View.VISIBLE);

        FirebaseFirestore.getInstance()
                .collection("kegiatan")
                .document(postId)
                .delete()
                .addOnSuccessListener(aVoid -> {
                    loadingProgress.setVisibility(View.GONE);
                    Toast.makeText(this, "Kegiatan dihapus", Toast.LENGTH_SHORT).show();
                    loadUserPosts();
                })
                .addOnFailureListener(e -> {
                    loadingProgress.setVisibility(View.GONE);
                    Toast.makeText(this, "Gagal menghapus: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                });
    }

    // Akan mengambil ulang data dari Firestore
    @Override
    protected void onResume() {
        super.onResume();
        loadUserPosts();
        // Ambil data pengguna dari Firestore
        FirebaseFirestore.getInstance()
                .collection("users")
                .document(currentUid)
                .get()
                .addOnSuccessListener(documentSnapshot -> {
                    if (documentSnapshot.exists()) {
                        String nama = documentSnapshot.getString("nama");
                        String email = documentSnapshot.getString("email");
                        String base64Image = documentSnapshot.getString("profileImage");

                        tvNama.setText(nama);
                        tvEmail.setText("Email: " + (email != null ? email : "Tidak tersedia"));
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
}