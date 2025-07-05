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

public class SulawesiTengah extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20banggai.jpg", "Kabupaten Banggai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20buol.webp", "Kabupaten Buol"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20donggala.jpg", "Kabupaten Donggala"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20morowali.jpg", "Kabupaten Morowali"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/Pakaian%20poso.jpg", "Kabupaten Poso")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20banggai.jpg", "Kabupaten Banggai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20buol.webp", "Kabupaten Banggai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20donggala.png", "Kabupaten Donggala"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20morowali.jpg", "Kabupaten Morowali"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20poso.jpg", "Kabupaten Poso")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bnggai.jpg", "Kabupaten Banggai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20buol.jpg", "Kabupaten Buol"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20donggala.jpg", "Kabupaten Donggala"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20morowali.jpg", "Kabupaten Morowali"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20poso.jpg", "Kabupaten Poso")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20banggai.jpg", "Kabupaten Banggai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20buol.jpg", "Kabupaten Buol"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20donggala.jpg", "Kabupaten Donggala"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20morowali.jpg", "Kabupaten Morowali"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20poso.jpg", "Kabupaten Poso")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20banggai.jpg", "Kabupaten Banggai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20buol.jpg", "Kabupaten Buol"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20donggala.jpg", "Kabupaten Donggala"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20morowali.jpg", "Kabupaten Morowali"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20poso.jpg", "Kabupaten Poso")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20sulawesi%20tengah.jpg", "Provinsi Sulawesi Tengah")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/Sulawesi%20Tengah.jpg", "Provinsi Sulawesi Tengah")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20banggai.jpg", "Kabupaten Banggai"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20buol.jpg", "Kabupaten Buol"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20donggala.jpg", "Kabupaten Donggala"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20morowali.jpg", "Kabupaten Morowali"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20poso.jpg", "Kabupaten Poso")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20donggala.jpg", "Kabupaten Donggala")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20donggala.jpg", "Kabupaten Donggala")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20banggai.jpg", "Kabupaten Banggai")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/Fauna%20Sulawesi%20Tengah.jpg", "Provinsi Sulawesi Tengah")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_sulawesi_tengah);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_sulawesitengah.webp")
                .into(headerprovinsi);

        ImageView sulawesitengahpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitengahpakaian.jpg")
                .into(sulawesitengahpakaian);

        ImageView sulawesitengahrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_sulawesitengah.webp")
                .into(sulawesitengahrumah);

        ImageView sulawesitengahmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitengahmakanan.jpg")
                .into(sulawesitengahmakanan);

        ImageView sulawesitengahtarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitengahtarian.jpg")
                .into(sulawesitengahtarian);

        ImageView sulawesitengahobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitengahobjekwisata.jpg")
                .into(sulawesitengahobjekwisata);

        ImageView sulawesitengahalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitengahalatmusik.jpg")
                .into(sulawesitengahalatmusik);

        ImageView sulawesitengahupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitengahupacara.jpg")
                .into(sulawesitengahupacara);

        ImageView sulawesitengahsenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitengahsenjata.jpg")
                .into(sulawesitengahsenjata);

        ImageView sulawesitengahproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitengahproduk.jpg")
                .into(sulawesitengahproduk);

        ImageView sulawesitengahpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitengahpermainan.jpg")
                .into(sulawesitengahpermainan);

        ImageView sulawesitengahflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitengahflora.jpg")
                .into(sulawesitengahflora);

        ImageView sulawesitengahfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitengahfauna.jpg")
                .into(sulawesitengahfauna);

        sulawesitengahpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        sulawesitengahrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        sulawesitengahmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        sulawesitengahtarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        sulawesitengahobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        sulawesitengahalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        sulawesitengahupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        sulawesitengahsenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        sulawesitengahproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        sulawesitengahpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        sulawesitengahflora.setOnClickListener(v -> showPopupSlider(this, flora));
        sulawesitengahfauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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