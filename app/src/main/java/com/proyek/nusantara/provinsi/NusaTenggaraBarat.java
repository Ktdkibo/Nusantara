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

public class NusaTenggaraBarat extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bima.jpg", "Kabupaten Bima"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20dompu.jpeg", "Kabupaten Dompu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20lombok%20barat.jpg", "Kabupaten Lombok Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20lombok%20timur.jpeg", "Kabupaten Lombok Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20sumbawa.jpg", "Kabupaten Sumbawa")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20bima.jpg", "Kabupaten Bima"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20dompu.jpg", "Kabupaten Dompu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20lombok%20barat.jpg", "Kabupaten Lombok Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20lombok%20timur.jpg", "Kabupaten Lombok Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20sumbawa.jpg", "Kabupaten Sumbawa")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bima.webp", "Kabupaten Bima"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20dompu.jpeg", "Kabupaten Dompu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20lombok%20barat.jpg", "Kabupaten Lombok Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20lombok%20timur.jpeg", "Kabupaten Lombok Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20sumbawa.jpg", "Kabupaten Sumbawa")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20bima.jpg", "Kabupaten Bima"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20dompu.jpeg", "Kabupaten Dompu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20lombok%20barat.jpg", "Kabupaten Lombok Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20lombok%20timur.jpg", "Kabupaten Lombok Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20adat%20sumbawa.avif", "Kabupaten Sumbawa")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20bima.jpg", "Kabupaten Bima"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20dompu.avif", "Kabupaten Dompu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20lombok%20barat.webp", "Kabupaten Lombok Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20lombok%20timur.webp", "Kabupaten Lombok Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20sumbawa.jpg", "Kabupaten Sumbawa")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20bima.jpg", "Kabupaten Bima"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20dompu.jpg", "Kabupaten Dompu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20lombok%20barat.jpg", "Kabupaten Lombok Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20lombok%20timur.jpg", "Kabupaten Lombok Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20sumbawa.png", "Kabupaten Sumbawa")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20bima.jpg", "Kabupaten Bima"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20dompu.jpg", "Kabupaten Dompu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20lombok%20barat.jpg", "Kabupaten Lombok Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20lombok%20timur.jpeg", "Kabupaten Lombok Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20sumbawa.png", "Kabupaten Sumbawa")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20bima.jpg", "Kabupaten Bima"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20dompu.jpg", "Kabupaten Dompu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20lombok%20barat.jpg", "Kabupaten Lombok Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20lombok%20timur.webp", "Kabupaten Lombok Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20sumbawa.jpg", "Kabupaten Sumbawa")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20dompu.jpg", "Kabupaten Dompu")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20lombok%20barat.jpg", "Kabupaten Lombok Barat")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20bima.jpg", "Kabupaten Bima")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20bima.jpg", "Kabupaten Bima")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_nusa_tenggara_barat);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_ntb.webp")
                .into(headerprovinsi);

        ImageView nusatenggarabaratpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/ntbpakaian.jpg")
                .into(nusatenggarabaratpakaian);

        ImageView nusatenggarabaratrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_nusatenggarabarat.webp")
                .into(nusatenggarabaratrumah);

        ImageView nusatenggarabaratmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/ntbmakanan.jpg")
                .into(nusatenggarabaratmakanan);

        ImageView nusatenggarabarattarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/ntbtarian.jpg")
                .into(nusatenggarabarattarian);

        ImageView nusatenggarabaratobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/ntbobjekwisata.jpg")
                .into(nusatenggarabaratobjekwisata);

        ImageView nusatenggarabaratalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/ntbalatmusik.jpg")
                .into(nusatenggarabaratalatmusik);

        ImageView nusatenggarabaratupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/ntbupacara.jpg")
                .into(nusatenggarabaratupacara);

        ImageView nusatenggarabaratsenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/ntbsenjata.jpg")
                .into(nusatenggarabaratsenjata);

        ImageView nusatenggarabaratproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/ntbproduk.webp")
                .into(nusatenggarabaratproduk);

        ImageView nusatenggarabaratpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/ntbpermainan.jpg")
                .into(nusatenggarabaratpermainan);

        ImageView nusatenggarabaratflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/ntbflora.gif")
                .into(nusatenggarabaratflora);

        ImageView nusatenggarabaratfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/ntbfauna.jpg")
                .into(nusatenggarabaratfauna);

        nusatenggarabaratpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        nusatenggarabaratrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        nusatenggarabaratmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        nusatenggarabarattarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        nusatenggarabaratobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        nusatenggarabaratalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        nusatenggarabaratupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        nusatenggarabaratsenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        nusatenggarabaratproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        nusatenggarabaratpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        nusatenggarabaratflora.setOnClickListener(v -> showPopupSlider(this, flora));
        nusatenggarabaratfauna.setOnClickListener(v -> showPopupSlider(this, fauna));


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