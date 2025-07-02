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

public class SulawesiUtara extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/Pakaian%20bolang%20Mongondow%20selatan.jpg", "Kabupaten Bolaang Mongondow Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bolang%20mongondow%20timur.jpg", "Kabupaten Bolaang Mongondow Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bolang%20mongondow%20utara.webp", "Kabupaten Bolaang Mongondow Utara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bolang%20mongondow.jpg", "Kabupaten Bolaang Mongondow"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20minahasa.webp", "Kabupaten Minahasa")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20minahasa.jpg", "Kabupaten Minahasa"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20mongondow%20selatan.jpg", "Kabupaten Bolaang Mongondow Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20mongondow%20timur.jpg", "Kabupaten Bolaang Mongondow Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20mongondow%20utara.webp", "Kabupaten Bolaang Mongondow Utara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20mongondow.webp", "Kabupaten Bolaang Mongondow")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20minahasa.jpg", "Kabupaten Minahasa"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20mongondow.jpg", "Kabupaten Bolaang Mongondow")
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
        setContentView(R.layout.activity_provinsi_sulawesi_utara);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_sulawesiutara.webp")
                .into(headerprovinsi);

        ImageView sulawesiutarapakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesiutarapakaian.jpg")
                .into(sulawesiutarapakaian);

        ImageView sulawesiutararumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_sulawesiutara.webp")
                .into(sulawesiutararumah);

        ImageView sulawesiutaramakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesiutaramakanan.jpg")
                .into(sulawesiutaramakanan);

        ImageView sulawesiutaratarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesiutaratarian.jpg")
                .into(sulawesiutaratarian);

        ImageView sulawesiutaraobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesiutaraobjekwisata.jpg")
                .into(sulawesiutaraobjekwisata);

        ImageView sulawesiutaraalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesiutaraalatmusik.jpg")
                .into(sulawesiutaraalatmusik);

        ImageView sulawesiutaraupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesiutaraupacara.jpg")
                .into(sulawesiutaraupacara);

        ImageView sulawesiutarasenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesiutarasenjata.png")
                .into(sulawesiutarasenjata);

        ImageView sulawesiutaraproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesiutaraproduk.jpg")
                .into(sulawesiutaraproduk);

        ImageView sulawesiutarapermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesiutarapermainan.jpg")
                .into(sulawesiutarapermainan);

        ImageView sulawesiutaraflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesiutaraflora.jpg")
                .into(sulawesiutaraflora);

        ImageView sulawesiutarafauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesiutarafauna.jpg")
                .into(sulawesiutarafauna);

        sulawesiutarapakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        sulawesiutararumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        sulawesiutaramakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        sulawesiutaratarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        sulawesiutaraobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        sulawesiutaraalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        sulawesiutaraupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        sulawesiutarasenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        sulawesiutaraproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        sulawesiutarapermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        sulawesiutaraflora.setOnClickListener(v -> showPopupSlider(this, flora));
        sulawesiutarafauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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