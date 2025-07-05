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

public class SumateraSelatan extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20banyuasin.png", "Kabupaten Banyuasin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20komering%20ulu%20selatan.jpg", "Kabupaten Komering Ulu Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20lahat.webp", "Kabupaten Lahat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20ogan%20ilir.jpg", "Kabupaten Ogan Ilir"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20ogan%20komerng%20ilir.png", "Kabupaten Ogan Komering Ilir")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20banyuasin.jpeg", "Kabupaten Banyuasin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20lahat.jpg", "Kabupaten Lahat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20ogan%20ilir.jpg", "Kabupaten Ogan Ilir"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20ogan%20komering%20ilir.jpg", "Kabupaten Ogan Komering Ilir"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20komering%20ulu%20selatan.jpg", "Kabupaten Komering Ulu Selatan")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20banyuasin.jpg", "Kabupaten Banyuasin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20komering%20ulu%20selatan.jpg", "Kabupaten Komering Ulu Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20lahat.jpg", "Kabupaten Lahat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20ogan%20ilir.jpg", "Kabupaten Ogan Ilir"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20ogan%20komering%20ilir.jpg", "Kabupaten Ogan Komering Ilir")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20banyuasin.jpg", "Kabupaten Banyuasin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20komering%20ulu%20selatan.jpg", "Kabupaten Komering Ulu Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20lahat.jpg", "Kabupaten Lahat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20ogan%20ilir.jpg", "Kabupaten Ogan Ilir"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20ogan%20komering%20ilir.jpg", "Kabupaten Ogan Komering Ilir")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20banyuasin.jpg", "Kabupaten Banyuasin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20komering%20ulu%20selatan.jpg", "Kabupaten Komering Ulu Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20lahat.jpg", "Kabupaten Lahat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20ogan%20ilir.jpg", "Kabupaten Ogan Ilir"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20ogan%20komering%20ilir.jpg", "Kabupaten Ogan Komering Ilir")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20sumatera%20selatan.jpg", "Provinsi Sumatera Selatan")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20banyuasin.jpg", "Kabupaten Banyuasin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20ogan%20ilir.jpg", "Kabupaten Ogan Ilir")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20banyuasin.jpg", "Kabupaten Banyuasin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20lahat.jpg", "Kabupaten Lahat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20ogan%20ilir.jpg", "Kabupaten Ogan Ilir")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produl%20lahat.jpg", "Kabupaten Lahat")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20lahat.jpg", "Kabupaten Lahat")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20lahat.jpg", "Kabupaten Lahat")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20lahat.jpg", "Kabupaten Lahat")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_sumatera_selatan);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_sumateraselatan.webp")
                .into(headerprovinsi);

        ImageView sumateraselatanpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumateraselatanpakaian.jpg")
                .into(sumateraselatanpakaian);

        ImageView sumateraselatanrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_sumateraselatan.webp")
                .into(sumateraselatanrumah);

        ImageView sumateraselatanmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumateraselatanmakanan.jpg")
                .into(sumateraselatanmakanan);

        ImageView sumateraselatantarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumateraselatantarian.jpg")
                .into(sumateraselatantarian);

        ImageView sumateraselatanobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumateraselatanobjekwisata.jpg")
                .into(sumateraselatanobjekwisata);

        ImageView sumateraselatanalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumateraselatanalatmusik.jpg")
                .into(sumateraselatanalatmusik);

        ImageView sumateraselatanupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumateraselatanupacara.jpg")
                .into(sumateraselatanupacara);

        ImageView sumateraselatansenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumateraselatansenjata.jpg")
                .into(sumateraselatansenjata);

        ImageView sumateraselatanproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumateraselatanproduk.jpeg")
                .into(sumateraselatanproduk);

        ImageView sumateraselatanpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumateraselatanpermainan.jpg")
                .into(sumateraselatanpermainan);

        ImageView sumateraselatanflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumateraselatanflora.jpeg")
                .into(sumateraselatanflora);

        ImageView sumateraselatanfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumateraselatanfauna.jpg")
                .into(sumateraselatanfauna);

        sumateraselatanpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        sumateraselatanrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        sumateraselatanmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        sumateraselatantarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        sumateraselatanobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        sumateraselatanalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        sumateraselatanupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        sumateraselatansenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        sumateraselatanproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        sumateraselatanpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        sumateraselatanflora.setOnClickListener(v -> showPopupSlider(this, flora));
        sumateraselatanfauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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