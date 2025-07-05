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

public class KalimantanTimur extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20balikpapan.png", "Kabupaten Balikpapan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20berau.avif", "Kabupaten Berau"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20kutai%20barat.jpg", "Kabupaten Kutai Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20mahakam%20ulu.jpg", "Kabupaten Kutai Mahakam Ulu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20paser.jpg", "Kabupaten Paser")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20balikpapan.jpg", "Kabupaten Balikpapan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20berau.png", "Kabupaten Berau"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20kutai%20barat.jpg", "Kabupaten Kutai Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20mahakam%20ulu.jpg", "Kabupaten Kutai Mahakam Ulu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20paser.jpg", "Kabupaten Paser")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20balikpapan.jpg", "Kabupaten Balikpapan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20berau.webp", "Kabupaten Berau"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20kutai%20barat.webp", "Kabupaten Kutai Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20mahakam%20ulu.jpg", "Kabupaten Kutai Mahakam Ulu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20paser.jpg", "Kabupaten Paser")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20balikpapan.jpg", "Kabupaten Balikpapan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20berau.jpg", "Kabupaten Berau"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20kutai%20barat.jpg", "Kabupaten Kutai Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20mahakam%20ulu.jpg", "Kabupaten Kutai Mahakam Ulu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20paser.jpg", "Kabupaten Paser")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20balikpapan.jpg", "Kabupaten Balikpapan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20berau.jpg", "Kabupaten Berau"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20kutai%20barat.jpg", "Kabupaten Kutai Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20mahakam%20ulu.jpg", "Kabupaten Kutai Mahakam Ulu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20paser.jpg", "Kabupaten Paser")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20berau.jpg", "Kabupaten Berau"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20mahakam%20ulu.jpg", "Kabupaten Kutai Mahakam Ulu")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20berau.jpg", "Kabupaten Berau"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20mahakam%20ulu.jpg", "Kabupaten Kutai Mahakam Ulu")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20balikpapan.jpg", "Kabupaten Balikpapan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20berau.jpg", "Kabupaten Berau"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20kutai%20barat.jpg", "Kabupaten Kutai Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20mahakam%20ulu.jpg", "Kabupaten Kutai Mahakam Ulu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/sejata%20paser.jpg", "Kabupaten Paser")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20paser.jpg", "Kabupaten Paser")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20mahakam%20ulu.jpg", "Kabupaten Kutai Mahakam Ulu")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20berau.jpg", "Kabupaten Berau")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20berau.jpg", "Kabupaten Berau")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_kalimantan_timur);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_kalimantantimur.webp")
                .into(headerprovinsi);

        ImageView kalimantantimurpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantimurpakaian.png")
                .into(kalimantantimurpakaian);

        ImageView kalimantantimurrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_kalimantantimur.webp")
                .into(kalimantantimurrumah);

        ImageView kalimantantimurmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantimurmakanan.jpg")
                .into(kalimantantimurmakanan);

        ImageView kalimantantimurtarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantimurtarian.jpg")
                .into(kalimantantimurtarian);

        ImageView kalimantantimurobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantimurobjekwisata.jpg")
                .into(kalimantantimurobjekwisata);

        ImageView kalimantantimuralatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantimuralatmusik.jpg")
                .into(kalimantantimuralatmusik);

        ImageView kalimantantimurupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantimurupacara.jpg")
                .into(kalimantantimurupacara);

        ImageView kalimantantimursenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantimursenjata.jpg")
                .into(kalimantantimursenjata);

        ImageView kalimantantimurproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantimurproduk.webp")
                .into(kalimantantimurproduk);

        ImageView kalimantantimurpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantimurpermainan.jpg")
                .into(kalimantantimurpermainan);

        ImageView kalimantantimurflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantimurflora.jpg")
                .into(kalimantantimurflora);

        ImageView kalimantantimurfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantantimurfauna.jpg")
                .into(kalimantantimurfauna);

        kalimantantimurpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        kalimantantimurrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        kalimantantimurmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        kalimantantimurtarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        kalimantantimurobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        kalimantantimuralatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        kalimantantimurupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        kalimantantimursenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        kalimantantimurproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        kalimantantimurpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        kalimantantimurflora.setOnClickListener(v -> showPopupSlider(this, flora));
        kalimantantimurfauna.setOnClickListener(v -> showPopupSlider(this, fauna));


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