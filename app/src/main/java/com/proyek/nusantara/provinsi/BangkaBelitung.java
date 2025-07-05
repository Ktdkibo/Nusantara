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

public class BangkaBelitung extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bangka.webp", "Kabupaten Bangka"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20belitung%20selatan.webp", "Kabupaten Belitung Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20belitung%20timur.webp", "Kabupaten Belitung Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20belitung.jpg", "Kabupaten Belitung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20pangkal%20pinang.jpg", "Kabupaten Pangkal Pinang")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20bangka.jpeg", "Kabupaten Bangka"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20belitung selatan.webp", "Kabupaten Belitung Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20belitung timur.jpg", "Kabupaten Belitung Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20belitung.jpg", "Kabupaten Belitung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20pangkalpinang.avif", "Kabupaten Pangkal Pinang")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bangka.jpg", "Kabupaten Bangka"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20belitung%20selatan.jpg", "Kabupaten Belitung Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20belitung%20timur.jpg", "Kabupaten Belitung Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20belitung.jpg", "Kabupaten Belitung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20pangkalpinang.jpg", "Kabupaten Pangkal Pinang")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20bangka.jpg", "Kabupaten Bangka"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20pangkal%20pinang.jpg", "Kabupaten Pangkal Pinang")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20banka.jpg", "Kabupaten Bangka"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20belitung.jpg", "Kabupaten Belitung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20pangkal%20pinang.jpg", "Kabupaten Pangkal Pinang")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20bangka%20beliung.jpg", "Provinsi Bangka Belitung")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20bangka.jpg", "Kabupaten Bangka"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20pangkalpinang.jpg", "Kabupaten Pangkal Pinang")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20bangka.jpg", "Kabupaten Bangka"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20belitung%20seltan.jpg", "Kabupaten Belitung Selatan")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20bangka.jpg", "Kabupaten Bangka")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20bangka.jpg", "Kabupaten Bangka")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/Flora%20Bangka%20Belitung.jpg", "Provinsi Bangka Belitung")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20bangka.jpg", "Kabupaten Bangka")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_bangka_belitung);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_bangkabelitung.webp")
                .into(headerprovinsi);

        ImageView bangkabelitungpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bangkabelitungpakaian.webp")
                .into(bangkabelitungpakaian);

        ImageView bangkabelitungrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_bangkabelitung.webp")
                .into(bangkabelitungrumah);

        ImageView bangkabelitungmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bangkabelitungmakanan.webp")
                .into(bangkabelitungmakanan);

        ImageView bangkabelitungtarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bangkabelitungtarian.webp")
                .into(bangkabelitungtarian);

        ImageView bangkabelitungobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bangkabelitungobjekwisata.webp")
                .into(bangkabelitungobjekwisata);

        ImageView bangkabelitungalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bangkabelitungalatmusik.webp")
                .into(bangkabelitungalatmusik);

        ImageView bangkabelitungupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bangkabelitungupacara.webp")
                .into(bangkabelitungupacara);

        ImageView bangkabelitungsenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bangkabelitungsenjata.webp")
                .into(bangkabelitungsenjata);

        ImageView bangkabelitungproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bangkabelitungproduk.jpeg")
                .into(bangkabelitungproduk);

        ImageView bangkabelitungpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bangkabelitungpermainan.webp")
                .into(bangkabelitungpermainan);

        ImageView bangkabelitungflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bangkabelitungflora.webp")
                .into(bangkabelitungflora);

        ImageView bangkabelitungfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bangkabelitungfauna.webp")
                .into(bangkabelitungfauna);

        bangkabelitungpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        bangkabelitungrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        bangkabelitungmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        bangkabelitungtarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        bangkabelitungobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        bangkabelitungalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        bangkabelitungupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        bangkabelitungsenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        bangkabelitungproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        bangkabelitungpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        bangkabelitungflora.setOnClickListener(v -> showPopupSlider(this, flora));
        bangkabelitungfauna.setOnClickListener(v -> showPopupSlider(this, fauna));


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