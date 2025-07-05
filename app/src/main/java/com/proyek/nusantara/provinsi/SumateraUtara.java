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

public class SumateraUtara extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20asahan.jpg", "Kabupaten Asahan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20batu%20bara.png", "Kabupaten Batu Bara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20daeli%20serdang.jpg", "Kabupaten Deli Serdang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20dairi.jpg", "Kabupaten Dairi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20karo.jpg", "Kabupaten Karo")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20asahan.jpeg", "Kabupaten Asahan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20batu%20bara.jpeg", "Kabupaten Batu Bara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20daeli%20serdang.jpeg", "Kabupaten Deli Serdang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20dairi.jpg", "Kabupaten Dairi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20karo.jpg", "Kabupaten Karo")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20asahan.jpg", "Kabupaten Asahan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20batu%20bara.jpg", "Kabupaten Batu Bara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20dairi.jpg", "Kabupaten Dairi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20deli%20serdang.jpg", "Kabupaten Deli Serdang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20karo.jpg", "Kabupaten Karo")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20asahan.jpg", "Kabupaten Asahan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20batu%20bara.jpg", "Kabupaten Batu Bara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20daili.jpg", "Kabupaten Daili"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20daeli%20serdang.jpg", "Kabupaten Dseli Serdang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20karo.jpg", "Kabupaten Karo")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20asahan.jpg", "Kabupaten Asahan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20batu%20bara.jpg", "Kabupaten Batu Bara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20dairi.jpg", "Kabupaten Daili"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20deli%20serdang.jpg", "Kabupaten Dseli Serdang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20karo.jpg", "Kabupaten Karo")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20sumatera%20utara.jpg", "Provinsi Sumatera Utara")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/uapacara%20asahan.jpg", "Kabupaten Asahan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20karo.jpg", "Kabupaten Karo")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20asahan.jpg", "Kabupaten Asahan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20batu%20bara.jpg", "Kabupaten Batu Bara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20dairi.jpg", "Kabupaten Daili"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20daei%20serdang.jpg", "Kabupaten Dseli Serdang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20karo.jpg", "Kabupaten Karo")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20karo.jpg", "Kabupaten Karo")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20asahan.jpg", "Kabupaten Asahan")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20asahan.jpg", "Kabupaten Asahan")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20asahan.jpg", "Kabupaten Asahan")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_sumatera_utara);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_sumaterautara.webp")
                .into(headerprovinsi);

        ImageView sumaterautarapakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumaterautarapakaian.jpg")
                .into(sumaterautarapakaian);

        ImageView sumaterautararumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_sumaterautara.webp")
                .into(sumaterautararumah);

        ImageView sumaterautaramakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumaterautaramakanan.jpg")
                .into(sumaterautaramakanan);

        ImageView sumaterautaratarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumaterautaratari.jpg")
                .into(sumaterautaratarian);

        ImageView sumaterautaraobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumaterautaraobjekwisata.jpg")
                .into(sumaterautaraobjekwisata);

        ImageView sumaterautaraalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumaterautaraalatmusik.jpg")
                .into(sumaterautaraalatmusik);

        ImageView sumaterautaraupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumaterautaraupacara.png")
                .into(sumaterautaraupacara);

        ImageView sumaterautarasenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumaterautarasenjata.jpg")
                .into(sumaterautarasenjata);

        ImageView sumaterautaraproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumaterautaraproduk.jpg")
                .into(sumaterautaraproduk);

        ImageView sumaterautarapermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumaterautarapermainan.jpg")
                .into(sumaterautarapermainan);

        ImageView sumaterautaraflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumaterautaraflora.jpg")
                .into(sumaterautaraflora);

        ImageView sumaterautarafauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sumaterautarafauna.jpg")
                .into(sumaterautarafauna);

        sumaterautarapakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        sumaterautararumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        sumaterautaramakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        sumaterautaratarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        sumaterautaraobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        sumaterautaraalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        sumaterautaraupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        sumaterautarasenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        sumaterautaraproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        sumaterautarapermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        sumaterautaraflora.setOnClickListener(v -> showPopupSlider(this, flora));
        sumaterautarafauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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