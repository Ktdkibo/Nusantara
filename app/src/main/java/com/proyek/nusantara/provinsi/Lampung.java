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

public class Lampung extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20mesuji.jpg", "Kabupaten Mesuji"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20pesawaran.jpg", "Kabupaten Pesawaran"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20pesisir%20barat.jpeg", "Kabupaten Pesisir Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20pringsewu.jpg", "Kabupaten Pringsewu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20tanggamus.jpg", "Kabupaten Tanggamus")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20mesuji.jpg", "Kabupaten Mesuji"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20pesawaran.jpg", "Kabupaten Pesawaran"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20pesisir barat.jpg", "Kabupaten Pesisir Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20pringsewu.jpg", "Kabupaten Pringsewu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20tanggamus.jpg", "Kabupaten Tanggamus")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20mesuji.jpg", "Kabupaten Mesuji"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20pesawaran.jpg", "Kabupaten Pesawaran"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20pesisir%20barat.jpg", "Kabupaten Pesisir Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20pring%20sewu.jpg", "Kabupaten Pringsewu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20tanggamus.jpg", "Kabupaten Tanggamus")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20mesuji.jpg", "Kabupaten Mesuji"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20pesawan.jpg", "Kabupaten Pesawaran"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20pesisir%20barat.jpg", "Kabupaten Pesisir Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20pringsewu.jpg", "Kabupaten Pringsewu"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20tanggamus.jpg", "Kabupaten Tanggamus")
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
        setContentView(R.layout.activity_provinsi_lampung);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_lampung.webp")
                .into(headerprovinsi);

        ImageView lampungpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/lampungpakaian.jpg")
                .into(lampungpakaian);

        ImageView lampungrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_lampung.webp")
                .into(lampungrumah);

        ImageView lampungmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/lampungmakanan.jpg")
                .into(lampungmakanan);

        ImageView lampungtarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/lampungtarian.jpg")
                .into(lampungtarian);

        ImageView lampungobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/lampungobjekwisata.jpg")
                .into(lampungobjekwisata);

        ImageView lampungalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/lampungalatmusik.jpeg")
                .into(lampungalatmusik);

        ImageView lampungupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/lampungupacara.jpg")
                .into(lampungupacara);

        ImageView lampungsenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/lampungsenjata.jpg")
                .into(lampungsenjata);

        ImageView lampungproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/lampungproduk.webp")
                .into(lampungproduk);

        ImageView lampungpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/lampungpermainan.jpg")
                .into(lampungpermainan);

        ImageView lampungflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/lampungflora.jpg")
                .into(lampungflora);

        ImageView lampungfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/lampungfauna.jpg")
                .into(lampungfauna);

        lampungpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        lampungrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        lampungmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        lampungtarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        lampungobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        lampungalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        lampungupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        lampungsenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        lampungproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        lampungpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        lampungflora.setOnClickListener(v -> showPopupSlider(this, flora));
        lampungfauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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