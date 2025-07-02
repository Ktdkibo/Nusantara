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

public class Banten extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20lebak.jpg", "Kabupaten Lebak"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20pandeglang.jpeg", "Kabupaten Pandeglang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20serang.jpg", "Kabupaten Serang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20tanggerang.jpg", "Kabupaten Tangerang")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20lebak.jpg", "Kabupaten Lebak"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20pandeglang.webp", "Kabupaten Pandeglang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20serang.jpg", "Kabupaten Serang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20serang.webp", "Kabupaten Serang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20tanggerang.jpg", "Kabupaten Tangerang")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20lebak.jpg", "Kabupaten Lebak"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20pandeglang.jpg", "Kabupaten Pandeglang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20serang.jpg", "Kabupaten Serang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20tanggerang.jpg", "Kabupaten Tangerang")
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
        setContentView(R.layout.activity_provinsi_banten);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_banten.webp")
                .into(headerprovinsi);

        ImageView bantenpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bantenpakaian.webp")
                .into(bantenpakaian);

        ImageView bantenrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_banten.webp")
                .into(bantenrumah);

        ImageView bantenmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bantenmakanan.webp")
                .into(bantenmakanan);

        ImageView bantentarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bantentarian.webp")
                .into(bantentarian);

        ImageView bantenobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bantenobjekwisata.webp")
                .into(bantenobjekwisata);

        ImageView bantenalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bantenalatmusik.webp")
                .into(bantenalatmusik);

        ImageView bantenupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bantenupacara.webp")
                .into(bantenupacara);

        ImageView bantensenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bantensenjata.webp")
                .into(bantensenjata);

        ImageView bantenproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bantenproduk.webp")
                .into(bantenproduk);

        ImageView bantenpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bantenpermainan.webp")
                .into(bantenpermainan);

        ImageView bantenflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bantenflora.webp")
                .into(bantenflora);

        ImageView bantenfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/bantenfauna.webp")
                .into(bantenfauna);

        bantenpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        bantenrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        bantenmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        bantentarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        bantenobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        bantenalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        bantenupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        bantensenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        bantenproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        bantenpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        bantenflora.setOnClickListener(v -> showPopupSlider(this, flora));
        bantenfauna.setOnClickListener(v -> showPopupSlider(this, fauna));


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