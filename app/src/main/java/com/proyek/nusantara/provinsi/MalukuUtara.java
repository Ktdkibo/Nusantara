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

public class MalukuUtara extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20halmahera%20barat.jpg", "Kabupaten Halmahera Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20halmahera%20selatan.jpg", "Kabupaten Halmahera Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20morotai.jpg", "Kabupaten Morotai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20sula.jpg", "Kabupaten Sula"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20taliabu.jpg", "Kabupaten Taliabu")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20halmahera%20barat.jpg", "Kabupaten Halmahera Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20halmahera%20selatan.jpg", "Kabupaten Halmahera Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20morotai.jpg", "Kabupaten Morotai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20sula.png", "Kabupaten Sula"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20taliabu.jpg", "Kabupaten Taliabu")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20halmahera%20barat.jpeg", "Kabupaten Halmahera Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20halmahera%20selatan.webp", "Kabupaten Halmahera Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20morotai.jpg", "Kabupaten Morotai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20sula.webp", "Kabupaten Sula"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20taliabu.jpg", "Kabupaten Taliabu")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20adat%20halmahera%20barat.jpg", "Kabupaten Halmahera Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20adat%20halmahera%20selatan.jpg", "Kabupaten Halmahera Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20adat%20morotai.jpg", "Kabupaten Morotai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20adat%20sula.jpg", "Kabupaten Sula"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20adat%20taliabu.jpg", "Kabupaten Taliabu")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20halmahera%20barat.webp", "Kabupaten Halmahera Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20halmahera%20selatan.jpg", "Kabupaten Halmahera Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20morotai.jpg", "Kabupaten Morotai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20sula.jpg", "Kabupaten Sula"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20taliabu.jpg", "Kabupaten Taliabu")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20halmahera%20barat.JPG", "Kabupaten Halmahera Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20halmahera%20selatan.JPG", "Kabupaten Halmahera Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20morotai.jpg", "Kabupaten Morotai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20sula.jpg", "Kabupaten Sula"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20taliabu.jpeg", "Kabupaten Taliabu")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20adat%20halmahera%20barat.jpg", "Kabupaten Halmahera Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20adat%20halmahera%20selatan.jpg", "Kabupaten Halmahera Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20sula.jpg", "Kabupaten Sula"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20adat%20taliabu.jpg", "Kabupaten Taliabu")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20halmahera%20barat.png", "Kabupaten Halmahera Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20halmahera%20selatan.webp", "Kabupaten Halmahera Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20sula.jpg", "Kabupaten Sula"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20taliabu.jpg", "Kabupaten Taliabu")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20morotai.jpg", "Kabupaten Morotai")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20halmahera%20barat.webp", "Kabupaten Halmahera Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20halmahera%20selatan.jpg", "Kabupaten Halmahera Selatan")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20sulaa.jpg", "Kabupaten Sula")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20sula.jpg", "Kabupaten Sula")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_maluku_utara);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_malukuutara.webp")
                .into(headerprovinsi);

        ImageView malukuutarapakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuutarapakaian.png")
                .into(malukuutarapakaian);

        ImageView malukuutararumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_malukuutara.webp")
                .into(malukuutararumah);

        ImageView malukuutaramakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuutaramakanan.jpg")
                .into(malukuutaramakanan);

        ImageView malukuutaratarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuutaratarian.jpg")
                .into(malukuutaratarian);

        ImageView malukuutaraobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuutaraobjekwisata.jpg")
                .into(malukuutaraobjekwisata);

        ImageView malukuutaraalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuutaraalatmusik.jpg")
                .into(malukuutaraalatmusik);

        ImageView malukuutaraupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuutaraupacara.jpg")
                .into(malukuutaraupacara);

        ImageView malukuutarasenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuutarasenjata.png")
                .into(malukuutarasenjata);

        ImageView malukuutaraproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuutaraproduk.jpeg")
                .into(malukuutaraproduk);

        ImageView malukuutarapermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuutarapermainan.webp")
                .into(malukuutarapermainan);

        ImageView malukuutaraflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuutaraflora.jpg")
                .into(malukuutaraflora);

        ImageView malukuutarafauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuutarafauna.jpg")
                .into(malukuutarafauna);

        malukuutarapakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        malukuutararumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        malukuutaramakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        malukuutaratarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        malukuutaraobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        malukuutaraalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        malukuutaraupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        malukuutarasenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        malukuutaraproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        malukuutarapermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        malukuutaraflora.setOnClickListener(v -> showPopupSlider(this, flora));
        malukuutarafauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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