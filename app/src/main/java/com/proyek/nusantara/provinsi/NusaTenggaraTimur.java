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

public class NusaTenggaraTimur extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20alor.jpg", "Kabupaten Alor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20belu.jpeg", "Kabupaten Belu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20ende.jpg", "Kabupaten Ende"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20flores%20timur.jpg", "Kabupaten Flores Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20kupang.jpg", "Kabupaten Kupang")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20alor.jpg", "Kabupaten Alor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20belu.jpg", "Kabupaten Belu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20ende.webp", "Kabupaten Ende"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20flores%20timur.jpg", "Kabupaten Flores Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20kupang.png", "Kabupaten Kupang")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20alor.jpg", "Kabupaten Alor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20belu.webp", "Kabupaten Belu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20ende.jpg", "Kabupaten Ende"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20flores%20timur.png", "Kabupaten Flores Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20kupang.avif", "Kabupaten Kupang")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20alor.jpg", "Kabupaten Alor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20belu.jpg", "Kabupaten Belu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20ende.jpg", "Kabupaten Ende"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20flores%20timur.jpg", "Kabupaten Flores Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20kupang.jpeg", "Kabupaten Kupang")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20alor.jpg", "Kabupaten Alor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20belu.jpg", "Kabupaten Belu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20ende.jpeg", "Kabupaten Ende"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20flores%20timur.webp", "Kabupaten Flores Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20kupang.webp", "Kabupaten Kupang")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20alor.jpg", "Kabupaten Alor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20belu.jpg", "Kabupaten Belu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20ende.jpg", "Kabupaten Ende"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20flores%20timur.jpg", "Kabupaten Flores Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20kupang.jpg", "Kabupaten Kupang")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20alor.jpg", "Kabupaten Alor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20belu.jpeg", "Kabupaten Belu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20flores%20timur.jpeg", "Kabupaten Flores Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20kupang.jpg", "Kabupaten Kupang")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20alor.png", "Kabupaten Alor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20belu.jpg", "Kabupaten Belu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20flores%20timur.jpg", "Kabupaten Flores Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20kupang.jpg", "Kabupaten Kupang")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produ%20alor.jpg", "Kabupaten Alor")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20alor.jpg", "Kabupaten Alor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20belu.jpg", "Kabupaten Belu")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20alor.jpg", "Kabupaten Alor")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20alor.jpg", "Kabupaten Alor")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_nusa_tenggara_timur);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_ntt.webp")
                .into(headerprovinsi);

        ImageView nusatenggaratimurpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/nttpakaian.webp")
                .into(nusatenggaratimurpakaian);

        ImageView nusatenggaratimurrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_nusatenggaratimur.webp")
                .into(nusatenggaratimurrumah);

        ImageView nusatenggaratimurmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/nttmakanan.jpg")
                .into(nusatenggaratimurmakanan);

        ImageView nusatenggaratimurtarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/ntttarian.webp")
                .into(nusatenggaratimurtarian);

        ImageView nusatenggaratimurobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/nttobjekwisata.jpg")
                .into(nusatenggaratimurobjekwisata);

        ImageView nusatenggaratimuralatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/nttalatmusik.webp")
                .into(nusatenggaratimuralatmusik);

        ImageView nusatenggaratimurupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/nttupacara.jpg")
                .into(nusatenggaratimurupacara);

        ImageView nusatenggaratimursenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/nttsenjata.webp")
                .into(nusatenggaratimursenjata);

        ImageView nusatenggaratimurproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/nttproduk.webp")
                .into(nusatenggaratimurproduk);

        ImageView nusatenggaratimurpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/nttpermainan.jpg")
                .into(nusatenggaratimurpermainan);

        ImageView nusatenggaratimurflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/nttflora.jpg")
                .into(nusatenggaratimurflora);

        ImageView nusatenggaratimurfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/nttfauna.jpg")
                .into(nusatenggaratimurfauna);

        nusatenggaratimurpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        nusatenggaratimurrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        nusatenggaratimurmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        nusatenggaratimurtarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        nusatenggaratimurobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        nusatenggaratimuralatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        nusatenggaratimurupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        nusatenggaratimursenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        nusatenggaratimurproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        nusatenggaratimurpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        nusatenggaratimurflora.setOnClickListener(v -> showPopupSlider(this, flora));
        nusatenggaratimurfauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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