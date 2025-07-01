package com.proyek.nusantara.provinsi;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.proyek.nusantara.PopupItem;
import com.proyek.nusantara.R;
import com.proyek.nusantara.adapters.PopupPagerAdapter;

import java.util.Arrays;
import java.util.List;

public class JawaTengah extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_jawa_tengah);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView header = findViewById(R.id.imgHeader);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/headerumum.webp")
                .into(header);

        ImageView headerprovinsi = findViewById(R.id.imgheaderprovinsi);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/header_jawatengah.webp")
                .into(headerprovinsi);

        ImageView jawatengahpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatengahpakaian.webp")
                .into(jawatengahpakaian);

        ImageView jawatengahrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_jawatengah.webp")
                .into(jawatengahrumah);

        ImageView jawatengahmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatengahmakanan.webp")
                .into(jawatengahmakanan);

        ImageView jawatengahtarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatengahtarian.webp")
                .into(jawatengahtarian);

        ImageView jawatengahobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatengahobjekwisata.webp")
                .into(jawatengahobjekwisata);

        ImageView jawatengahalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatengahalatmusik.webp")
                .into(jawatengahalatmusik);

        ImageView jawatengahupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatengahupacara.webp")
                .into(jawatengahupacara);

        ImageView jawatengahsenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatengahsenjata.webp")
                .into(jawatengahsenjata);

        ImageView jawatengahproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatengahproduk.webp")
                .into(jawatengahproduk);

        ImageView jawatengahpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatengahpermainan.webp")
                .into(jawatengahpermainan);

        ImageView jawatengahflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatengahflora.webp")
                .into(jawatengahflora);

        ImageView jawatengahfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatengahfauna.webp")
                .into(jawatengahfauna);

        jawatengahpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        jawatengahrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        jawatengahmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        jawatengahtarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        jawatengahobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        jawatengahalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        jawatengahupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        jawatengahsenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        jawatengahproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        jawatengahpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        jawatengahflora.setOnClickListener(v -> showPopupSlider(this, flora));
        jawatengahfauna.setOnClickListener(v -> showPopupSlider(this, fauna));

        // tombol kembali
        FloatingActionButton fabback = findViewById(R.id.fabback);
        fabback.setOnClickListener(v -> {
            // Menutup aktivitas dan kembali ke sebelumnya
            finish();
        });
    }

    public void showPopupSlider(Context context, List<PopupItem> items) {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_popup_slider);
        ViewPager2 viewPager = dialog.findViewById(R.id.viewPagerPopup);
        viewPager.setAdapter(new PopupPagerAdapter(context, items));

        // Atur dialog fullscreen
        if (dialog.getWindow() != null) {
            dialog.getWindow()
                    .setLayout(
                            WindowManager.LayoutParams.MATCH_PARENT,
                            WindowManager.LayoutParams.MATCH_PARENT
                    );
        }
        dialog.show();
    }
}