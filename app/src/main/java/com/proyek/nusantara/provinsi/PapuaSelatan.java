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

public class PapuaSelatan extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20asmat.jpg", "Kabupaten Asmat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20boven%20digoel.jpg", "Kabupaten Boven Digoel"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20mappi.jpg", "Kabupaten Mappi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20marauke.jpg", "Kabupaten Merauke")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20asmat.webp", "Kabupaten Asmat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20boven%20digoel.jpg", "Kabupaten Boven Digoel"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20mappi.jpg", "Kabupaten Mappi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20marauke.jpg", "Kabupaten Merauke")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20asmat.jpg", "Kabupaten Asmat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20boven%20digoel.jpg", "Kabupaten Boven Digoel"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20mappi.jpg", "Kabupaten Mappi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20marauke.jpg", "Kabupaten Merauke")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20asmat.jpg", "Kabupaten Asmat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20boven%20digoel.jpg", "Kabupaten Boven Digoel"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20mappi.jpg", "Kabupaten Mappi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20marauke.jpg", "Kabupaten Merauke")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20asmat.jpg", "Kabupaten Asmat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20boven%20digoel.jpg", "Kabupaten Boven Digoel"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20mappi.jpg", "Kabupaten Mappi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20marauke.jpg", "Kabupaten Merauke")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20papua%20selatan.jpg", "Provinsi Papua Selatan")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20asmat.jpg", "Kabupaten Asmat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20boven%20digoel.jpg", "Kabupaten Boven Digoel"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20mappi.jpg", "Kabupaten Mappi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20marauke.jpg", "Kabupaten Merauke")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20asmat.jpg", "Kabupaten Asmat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20boven%20digoel.jpg", "Kabupaten Boven Digoel"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20mappi.jpg", "Kabupaten Mappi")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20asmat.jpg", "Kabupaten Asmat")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20asmat.jpg", "Kabupaten Asmat")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20asmat.jpg", "Kabupaten Asmat")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20asmat.jpg", "Kabupaten Asmat")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_papua_selatan);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_papuaselatan.webp")
                .into(headerprovinsi);

        ImageView papuaselatanpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaselatanpakaian.jpeg")
                .into(papuaselatanpakaian);

        ImageView papuaselatanrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_papuaselatan.webp")
                .into(papuaselatanrumah);

        ImageView papuaselatanmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaselatanmakanan.jpeg")
                .into(papuaselatanmakanan);

        ImageView papuaselatantarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaselatantarian.jpeg")
                .into(papuaselatantarian);

        ImageView papuaselatanobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaselatanobjekwisata.jpg")
                .into(papuaselatanobjekwisata);

        ImageView papuaselatanalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaselatanalatmusik.jpg")
                .into(papuaselatanalatmusik);

        ImageView papuaselatanupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaselatanupacara.jpeg")
                .into(papuaselatanupacara);

        ImageView papuaselatansenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaselatansenjata.jpeg")
                .into(papuaselatansenjata);

        ImageView papuaselatanproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaselatanproduk.jpg")
                .into(papuaselatanproduk);

        ImageView papuaselatanpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaselatanpermainan.jpg")
                .into(papuaselatanpermainan);

        ImageView papuaselatanflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaselatanflora.jpeg")
                .into(papuaselatanflora);

        ImageView papuaselatanfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaselatanfauna.jpg")
                .into(papuaselatanfauna);

        papuaselatanpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        papuaselatanrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        papuaselatanmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        papuaselatantarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        papuaselatanobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        papuaselatanalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        papuaselatanupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        papuaselatansenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        papuaselatanproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        papuaselatanpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        papuaselatanflora.setOnClickListener(v -> showPopupSlider(this, flora));
        papuaselatanfauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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