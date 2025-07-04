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

public class PapuaBaratDaya extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20maybrat.jpg", "Kabupaten Maybrat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20raja%20ampat.webp", "Kabupaten Raja Ampat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20sorong%20selatan.jpg", "Kabupaten Sorong Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20sorong.jpg", "Kabupaten Sorong"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20tambrauw.jpg", "Kabupaten Tambrauw")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20maybrat.jpg", "Kabupaten Maybrat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20raja%20ampat.jpg", "Kabupaten Raja Ampat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20sorong%20selatan.jpg", "Kabupaten Sorong Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20sorong.jpeg", "Kabupaten Sorong"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20tambrauw.jpg", "Kabupaten Tambrauw")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20raja%20ampat.jpg", "Kabupaten Raja Ampat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20sorong.jpg", "Kabupaten Sorong"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20tambrauw.jpg", "Kabupaten Tambrauw")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20maybrat.jpg", "Kabupaten Maybrat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20raja%20ampat.jpg", "Kabupaten Raja Ampat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20sorong.jpg", "Kabupaten Sorong"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20tambrauw.jpg", "Kabupaten Tambrauw")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20maybrat.jpg", "Kabupaten Maybrat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20raja%20ampat.jpg", "Kabupaten Raja Ampat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20sorong%20selatan.jpg", "Kabupaten Sorong Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20sorong.jpg", "Kabupaten Sorong"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20tambrauw.jpg", "Kabupaten Tambrauw")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20papua%20barat%20daya.jpg", "Provinsi Papua Barat Daya")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20maybrat.jpg", "Kabupaten Maybrat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20raja%20ampat.jpg", "Kabupaten Raja Ampat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20sorong.jpg", "Kabupaten Sorong")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20maybrat.jpg", "Kabupaten Maybrat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20raja%20ampat.jpg", "Kabupaten Raja Ampat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senajata%20sorong.jpg", "Kabupaten Sorong")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20maybrat.jpg", "Kabupaten Maybrat")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20maybat.jpg", "Kabupaten Maybrat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20sorong.jpg", "Kabupaten Sorong")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20sorong.jpg", "Kabupaten Sorong")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20raja%20ampat.jpg", "Kabupaten Raja Ampat")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_papua_barat_daya);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_papuabaratdaya.webp")
                .into(headerprovinsi);

        ImageView papuabaratdayapakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratdayapakaian.jpeg")
                .into(papuabaratdayapakaian);

        ImageView papuabaratdayarumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_papuabaratdaya.webp")
                .into(papuabaratdayarumah);

        ImageView papuabaratdayamakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratdayamakanan.jpg")
                .into(papuabaratdayamakanan);

        ImageView papuabaratdayatarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratdayatarian.jpeg")
                .into(papuabaratdayatarian);

        ImageView papuabaratdayaobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratdayaobjekwisata.jpg")
                .into(papuabaratdayaobjekwisata);

        ImageView papuabaratdayaalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratdayaalatmusik.jpeg")
                .into(papuabaratdayaalatmusik);

        ImageView papuabaratdayaupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratdayaupacara.jpg")
                .into(papuabaratdayaupacara);

        ImageView papuabaratdayasenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratdayasenjata.jpeg")
                .into(papuabaratdayasenjata);

        ImageView papuabaratdayaproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratdayaproduk.jpeg")
                .into(papuabaratdayaproduk);

        ImageView papuabaratdayapermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratdayapermainan.jpg")
                .into(papuabaratdayapermainan);

        ImageView papuabaratdayaflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratdayaflora.jpg")
                .into(papuabaratdayaflora);

        ImageView papuabaratdayafauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratdayafauna.jpeg")
                .into(papuabaratdayafauna);

        papuabaratdayapakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        papuabaratdayarumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        papuabaratdayamakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        papuabaratdayatarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        papuabaratdayaobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        papuabaratdayaalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        papuabaratdayaupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        papuabaratdayasenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        papuabaratdayaproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        papuabaratdayapermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        papuabaratdayaflora.setOnClickListener(v -> showPopupSlider(this, flora));
        papuabaratdayafauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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