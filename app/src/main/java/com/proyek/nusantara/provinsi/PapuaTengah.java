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

public class PapuaTengah extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20deiyai.jpg", "Kabupaten Deiyai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20intan%20jaya.jpg", "Kabupaten Intan Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20nabire.jpg", "Kabupaten Nabire"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20paniai.jpg", "Kabupaten Paniai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20puncak%20jaya.jpg", "Kabupaten Puncak Jaya")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20deiyai.jpg", "Kabupaten Deiyai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20intan%20jaya.jpg", "Kabupaten Intan Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20nabire.jpg", "Kabupaten Nabire"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20paniai.jpg", "Kabupaten Paniai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20puncak%20jaya.jpeg", "Kabupaten Puncak Jaya")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20deiyai.jpg", "Kabupaten Deiyai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20nabire.jpg", "Kabupaten Nabire"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20paniai.jpg", "Kabupaten Paniai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20puncak%20jaya.jpg", "Kabupaten Puncak Jaya")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/.jpg", "Kabupaten")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_papua_tengah);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_papuatengah.webp")
                .into(headerprovinsi);

        ImageView papuatengahpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuatengahpakaian.jpeg")
                .into(papuatengahpakaian);

        ImageView papuatengahrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_papuatengah.webp")
                .into(papuatengahrumah);

        ImageView papuatengahmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuatengahmakanan.jpeg")
                .into(papuatengahmakanan);

        ImageView papuatengahtarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuatengahtarian.jpeg")
                .into(papuatengahtarian);

        ImageView papuatengahobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuatengahobjekwisata.jpg")
                .into(papuatengahobjekwisata);

        ImageView papuatengahalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuatengahalatmusik.jpg")
                .into(papuatengahalatmusik);

        ImageView papuatengahupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuatengahupacara.webp")
                .into(papuatengahupacara);

        ImageView papuatengahsenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuatengahsenjata.jpeg")
                .into(papuatengahsenjata);

        ImageView papuatengahproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuatengahproduk.JPG")
                .into(papuatengahproduk);

        ImageView papuatengahpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuatengahpermainan.jpg")
                .into(papuatengahpermainan);

        ImageView papuatengahflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuatengahflora.jpg")
                .into(papuatengahflora);

        ImageView papuatengahfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuatengahfauna.webp")
                .into(papuatengahfauna);

        papuatengahpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        papuatengahrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        papuatengahmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        papuatengahtarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        papuatengahobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        papuatengahalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        papuatengahupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        papuatengahsenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        papuatengahproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        papuatengahpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        papuatengahflora.setOnClickListener(v -> showPopupSlider(this, flora));
        papuatengahfauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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