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

public class Riau extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bengkalis.jpg", "Kabupaten Bengkalis"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/Pakaian%20Indragiri%20hilir.jpg", "Kabupaten Indragiri Hilir"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20kampar.jpg", "Kabupaten Kampar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20pelalawan.jpg", "Kabupaten Pelalawan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20siak.jpg", "Kabupaten Siak")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20bengkalis.jpg", "Kabupaten Bengkalis"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20indragiri%20hilir.jpg", "Kabupaten Indragiri Hilir"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20kampar.jpg", "Kabupaten Kampar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20pelalawan.jpg", "Kabupaten Pelalawan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20siak.jpg", "Kabupaten Siak")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bengkalis.jpg", "Kabupaten Bengkalis"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20indragiri%20hilir.jpg", "Kabupaten Indragiri Hilir"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20kampar.jpg", "Kabupaten Kampar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20pelalawan.jpg", "Kabupaten Pelalawan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20siak.jpg", "Kabupaten Siak")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20bengkalis.jpg", "Kabupaten Bengkalis"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20indragiri%20hilir.jpg", "Kabupaten Indragiri Hilir"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20kampar.jpg", "Kabupaten Kampar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20pelalawan.jpg", "Kabupaten Pelalawan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20siak.jpg", "Kabupaten Siak")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20bengkalis.jpg", "Kabupaten Bengkalis"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20indragiri%20hilir.jpg", "Kabupaten Indragiri Hilir"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20kampar.jpg", "Kabupaten Kampar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20pelalawan.jpg", "Kabupaten Pelalawan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20siak.jpg", "Kabupaten Siak")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20riau.jpg", "Provinsi Riau")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20bengkalis.jpg", "Kabupaten Bengkalis")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20bengkalis.jpg", "Kabupaten Bengkalis"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20kampar.jpg", "Kabupaten Kampar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20pelalawan.jpg", "Kabupaten Pelalawan")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20siak.jpg", "Kabupaten Siak")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20kampar.jpg", "Kabupaten Kampar")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20siak.jpg", "Kabupaten Siak")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20siak.jpg", "Kabupaten Siak")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_riau);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_riau.webp")
                .into(headerprovinsi);

        ImageView riaupakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/riaupakaian.jpg")
                .into(riaupakaian);

        ImageView riaurumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_riau.webp")
                .into(riaurumah);

        ImageView riaumakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/riaumakanan.jpg")
                .into(riaumakanan);

        ImageView riautarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/riautarian.jpeg")
                .into(riautarian);

        ImageView riauobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/riauobjekwisata.jpeg")
                .into(riauobjekwisata);

        ImageView riaualatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/riaualatmusik.jpeg")
                .into(riaualatmusik);

        ImageView riauupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/riauupacara.jpeg")
                .into(riauupacara);

        ImageView riausenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/riausenjata.jpeg")
                .into(riausenjata);

        ImageView riauproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/riauproduk.jpeg")
                .into(riauproduk);

        ImageView riaupermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/riaupermainan.webp")
                .into(riaupermainan);

        ImageView riauflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/riauflora.jpeg")
                .into(riauflora);

        ImageView riaufauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/riaufauna.jpg")
                .into(riaufauna);

        riaupakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        riaurumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        riaumakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        riautarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        riauobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        riaualatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        riauupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        riausenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        riauproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        riaupermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        riauflora.setOnClickListener(v -> showPopupSlider(this, flora));
        riaufauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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