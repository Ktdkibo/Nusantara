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

public class Bali extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20badung.jpeg", "Kabupaten Badung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bangle.jpeg", "Kabupaten Bangle"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20buleleng.jpg", "Kabupaten Buleleng"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20denpasar.jpg", "Kabupaten Denpasar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20gianyar.jpg", "Kabupaten Gianyar")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20badung.jpeg", "Kabupaten Badung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20bangle.jpg", "Kabupaten Bangle"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20buleleng.jpeg", "Kabupaten Buleleng"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20denpasar.jpg", "Kabupaten Denpasar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20gianyar.webp", "Kabupaten Gianyar")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20badung.jpg", "Kabupaten Badung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bangle.jpg", "Kabupaten Bangle"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20buleleng.jpg", "Kabupaten Buleleng"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20denpasar.jpg", "Kabupaten Denpasar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20gianyar.jpg", "Kabupaten Gianyar")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20badung.jpg", "Kabupaten Badung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20bangle.jpg", "Kabupaten Bangle"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20buleleng.jpg", "Kabupaten Buleleng"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20denpasar.jpg", "Kabupaten Denpasar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20gianyar.jpg", "Kabupaten Gianyar")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20badung.jpg", "Kabupaten Badung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20bangle.jpg", "Kabupaten Bangle"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20buleleng.jpg", "Kabupaten Buleleng"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisat%20denpasar.jpg", "Kabupaten Denpasar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20gianyar.jpg", "Kabupaten Gianyar")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20bali.jpg", "Provinsi Bali")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20badung.jpg", "Kabupaten Badung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20buleleng.jpg", "Kabupaten Buleleng")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20badung.jpg", "Kabupaten Badung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20bangle.jpg", "Kabupaten Bangle"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20buleleng.jpg", "Kabupaten Buleleng"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20denpasar.jpg", "Kabupaten Denpasar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20gianyar.jpg", "Kabupaten Gianyar")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20buleleng.jpg", "Kabupaten Buleleng")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20badung.jpg", "Kabupaten Badung")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20buleleng.jpg", "Kabupaten Buleleng")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20buleleng.jpg", "Kabupaten Buleleng")
    );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_bali);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_bali.webp")
                .into(headerprovinsi);

        ImageView balipakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/balipakaian.webp")
                .into(balipakaian);

        ImageView balirumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_bali.webp")
                .into(balirumah);

        ImageView balimakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/balimakanan.webp")
                .into(balimakanan);

        ImageView balitarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/balitarian.webp")
                .into(balitarian);

        ImageView baliobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/baliobjekwisata.webp")
                .into(baliobjekwisata);

        ImageView balialatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/balialatmusik.webp")
                .into(balialatmusik);

        ImageView baliupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/baliupacara.webp")
                .into(baliupacara);

        ImageView balisenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/balisenjata.webp")
                .into(balisenjata);

        ImageView baliproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/baliproduk.webp")
                .into(baliproduk);

        ImageView balipermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/balipermainan.webp")
                .into(balipermainan);

        ImageView baliflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/baliflora.webp")
                .into(baliflora);

        ImageView balifauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/balifauna.webp")
                .into(balifauna);

        balipakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        balirumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        balimakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        balitarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        baliobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        balialatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        baliupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        balisenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        baliproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        balipermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        baliflora.setOnClickListener(v -> showPopupSlider(this, flora));
        balifauna.setOnClickListener(v -> showPopupSlider(this, fauna));


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