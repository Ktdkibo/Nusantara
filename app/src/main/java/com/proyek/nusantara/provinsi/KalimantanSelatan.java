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

public class KalimantanSelatan extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20balangan.jpg", "Kabupaten Balangan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20barito%20kuala.png", "Kabupaten Barito Kuala"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bnjar.jpg", "Kabupaten Banjar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20kotabaru.webp", "Kabupaten Kotabaru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20tabalong.jpg", "Kabupaten Tabalong")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20balangan.jpg", "Kabupaten Balangan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20banjar.jpg", "Kabupaten Banjar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20barito kuala.webp", "Kabupaten Barito Kuala"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20kotabaru.jpg", "Kabupaten Kotabaru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20tabalong.jpg", "Kabupaten Tabalong")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20balangan.jpg", "Kabupaten Balangan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20banjar.jpg", "Kabupaten Banjar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20barito%20kuala.jpg", "Kabupaten Barito Kuala"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20kotabaru.jpg", "Kabupaten Kotabaru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20tabalong.jpg", "Kabupaten Tabalong")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20balangan.jpg", "Kabupaten Balangan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20banjar.jpg", "Kabupaten Banjar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20barito%20kuala.jpg", "Kabupaten Barito Kuala"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20kotabaru.jpg", "Kabupaten Kotabaru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20kotabalong.jpg", "Kabupaten Kota Balong")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20balangan.jpg", "Kabupaten Balangan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20banjar.jpg", "Kabupaten Banjar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20barito%20kuala.jpg", "Kabupaten Barito Kuala"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20kotabaru.jpg", "Kabupaten Kotabaru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20tabalong.jpg", "Kabupaten Kota Balong")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20kalimantan%20selatan.jpg", "Provinsi Kalimantan Selatan")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20tabalong.jpg", "Kabupaten Kota Balong")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20balangan.jpg", "Kabupaten Balangan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20banjar.jpg", "Kabupaten Banjar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20barit%20kuala.jpg", "Kabupaten Barito Kuala"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20kotabaru.jpg", "Kabupaten Kotabaru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20tabalong.jpg", "Kabupaten Kota Balong")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20balangan.jpg", "Kabupaten Balangan")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20balangan.jpg", "Kabupaten Balangan")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20balangan.jpg", "Kabupaten Balangan")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20balangan.jpg", "Kabupaten Balangan")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_kalimantan_selatan);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_kalimantanselatan.webp")
                .into(headerprovinsi);

        ImageView kalimantanselatanpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanselatanpakaian.webp")
                .into(kalimantanselatanpakaian);

        ImageView kalimantanselatanrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_kalimantanselatan.webp")
                .into(kalimantanselatanrumah);

        ImageView kalimantanselatanmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanselatanmakanan.webp")
                .into(kalimantanselatanmakanan);

        ImageView kalimantanselatantarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanselatantarian.jpg")
                .into(kalimantanselatantarian);

        ImageView kalimantanselatanobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanselatanobjekwisata.webp")
                .into(kalimantanselatanobjekwisata);

        ImageView kalimantanselatanalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanselatanalatmusik.webp")
                .into(kalimantanselatanalatmusik);

        ImageView kalimantanselatanupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanselatanupacara.webp")
                .into(kalimantanselatanupacara);

        ImageView kalimantanselatansenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanselatansenjata.webp")
                .into(kalimantanselatansenjata);

        ImageView kalimantanselatanproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanselatanproduk.webp")
                .into(kalimantanselatanproduk);

        ImageView kalimantanselatanpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanselatanpermainan.webp")
                .into(kalimantanselatanpermainan);

        ImageView kalimantanselatanflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanselatanflora.webp")
                .into(kalimantanselatanflora);

        ImageView kalimantanselatanfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanselatanfauna.webp")
                .into(kalimantanselatanfauna);

        kalimantanselatanpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        kalimantanselatanrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        kalimantanselatanmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        kalimantanselatantarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        kalimantanselatanobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        kalimantanselatanalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        kalimantanselatanupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        kalimantanselatansenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        kalimantanselatanproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        kalimantanselatanpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        kalimantanselatanflora.setOnClickListener(v -> showPopupSlider(this, flora));
        kalimantanselatanfauna.setOnClickListener(v -> showPopupSlider(this, fauna));


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