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

public class KalimantanTengah extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20barito%20selatan.png", "Kabupaten Barito Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20gunung%20mas.jpg", "Kabupaten Gunung Mas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20kapuas.jpg", "Kabupaten Kapuas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20katingan.webp", "Kabupaten Katingan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20lamandau.jpg", "Kabupaten Lamandau")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20barito%20selatan.jpg", "Kabupaten Barito Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20gunung%20mas.jpg", "Kabupaten Gunung Mas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20kapuas.jpg", "Kabupaten Kapuas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20katingan.jpeg", "Kabupaten Katingan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20lamandau.webp", "Kabupaten Lamandau")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20barito%20selatan.jpg", "Kabupaten Barito Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20gunung%20mas.jpg", "Kabupaten Gunung Mas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20kapuas.jpg", "Kabupaten Kapuas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20katingan.jpg", "Kabupaten Katingan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20lamandau.jpg", "Kabupaten Lamandau")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20bario%20selatan.jpg", "Kabupaten Barito Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20gunung%20mas.jpg", "Kabupaten Gunung Mas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20kapuas.jpg", "Kabupaten Kapuas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20katingan.jpg", "Kabupaten Katingan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20lamandau.jpg", "Kabupaten Lamandau")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20barito%20selatan.jpg", "Kabupaten Barito Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20gunung%20mas.jpg", "Kabupaten Gunung Mas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20kapuas.jpg", "Kabupaten Kapuas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20katingan.jpg", "Kabupaten Katingan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20lamandau.jpg", "Kabupaten Lamandau")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20gunung%20mas.jpg", "Kabupaten Gunung Mas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20lamandau.jpg", "Kabupaten Lamandau")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20gunung%20mas.jpg", "Kabupaten Gunung Mas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20lamandau.jpg", "Kabupaten Lamandau")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20barito%20selatan.jpg", "Kabupaten Barito Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20gunung%20mas.jpg", "Kabupaten Gunung Mas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20kapuas.jpg", "Kabupaten Kapuas"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20katingan].jpg", "Kabupaten Katingan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20lamandau.jpg", "Kabupaten Lamandau")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20kapuas.jpg", "Kabupaten Kapuas")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20gunungmas.jpg", "Kabupaten Gunung Mas")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20lamandau.jpg", "Kabupaten Lamandau")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20lamandau.jpg", "Kabupaten Lamandau")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_kalimantan_tengah);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_kalimantantengah.webp")
                .into(headerprovinsi);

        ImageView kalimantantengahpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantengahpakaian.webp")
                .into(kalimantantengahpakaian);

        ImageView kalimantantengahrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_kalimantantengah.webp")
                .into(kalimantantengahrumah);

        ImageView kalimantantengahmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantengahmakanan.webp")
                .into(kalimantantengahmakanan);

        ImageView kalimantantengahtarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantengahtarian.jpg")
                .into(kalimantantengahtarian);

        ImageView kalimantantengahobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantengahobjekwisata.webp")
                .into(kalimantantengahobjekwisata);

        ImageView kalimantantengahalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantengahalatmusik.webp")
                .into(kalimantantengahalatmusik);

        ImageView kalimantantengahupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantengahupacara.jpg")
                .into(kalimantantengahupacara);

        ImageView kalimantantengahsenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantengahsenjata.webp")
                .into(kalimantantengahsenjata);

        ImageView kalimantantengahproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantengahproduk.webp")
                .into(kalimantantengahproduk);

        ImageView kalimantantengahpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantengahpermainan.webp")
                .into(kalimantantengahpermainan);

        ImageView kalimantantengahflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantengahflora.webp")
                .into(kalimantantengahflora);

        ImageView kalimantantengahfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantengahfauna.webp")
                .into(kalimantantengahfauna);

        kalimantantengahpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        kalimantantengahrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        kalimantantengahmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        kalimantantengahtarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        kalimantantengahobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        kalimantantengahalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        kalimantantengahupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        kalimantantengahsenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        kalimantantengahproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        kalimantantengahpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        kalimantantengahflora.setOnClickListener(v -> showPopupSlider(this, flora));
        kalimantantengahfauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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