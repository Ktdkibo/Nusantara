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

public class KepulauanRiau extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20batam.jpg", "Kabupaten Batam"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bintan.jpg", "Kabupaten Bintan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20karimun.jpg", "Kabupaten Karimun"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20lingga.jpeg", "Kabupaten Lingga"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20natuna.jpg", "Kabupaten Natuna")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20batam.jpg", "Kabupaten Batam"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20bintan.jpg", "Kabupaten Bintan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20karimun.jpg", "Kabupaten Karimun"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20lingga.jpg", "Kabupaten Lingga"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20natuna.jpg", "Kabupaten Natuna")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20batam.jpg", "Kabupaten Batam"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bintan.jpg", "Kabupaten Bintan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20karimun.jpg", "Kabupaten Karimun"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20lingga.jpg", "Kabupaten Lingga"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20natuna.jpg", "Kabupaten Natuna")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20batam.jpg", "Kabupaten Batam"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20bintan.jpg", "Kabupaten Bintan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20karimun.jpg", "Kabupaten Karimun"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20lingga.jpg", "Kabupaten Lingga"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20natuna.jpg", "Kabupaten Natuna")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20batam.jpg", "Kabupaten Batam"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20bintan.jpg", "Kabupaten Bintan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20karimun.jpg", "Kabupaten Karimun"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20lingga.jpg", "Kabupaten Lingga"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20natuna.jpg", "Kabupaten Natuna")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20kepulauan%20riau.jpg", "Provinsi Kepulauan RIau")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20natuna.jpg", "Kabupaten Natuna")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20batam.jpg", "Kabupaten Batam"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20bintan.jpg", "Kabupaten Bintan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjatakarimun.jpg", "Kabupaten Karimun"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20lingga.jpg", "Kabupaten Lingga"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20natuna.jpg", "Kabupaten Natuna")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20batam.jpg", "Kabupaten Batam")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20batam.jpg", "Kabupaten Batam")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20batam.jpg", "Kabupaten Batam")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20batam.jpg", "Kabupaten Batam")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_kepulauan_riau);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_kepulauanriau.webp")
                .into(headerprovinsi);

        ImageView kepulauanriaupakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kepulauanriaupakaian.jpg")
                .into(kepulauanriaupakaian);

        ImageView kepulauanriaurumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_kepulauanriau.webp")
                .into(kepulauanriaurumah);

        ImageView kepulauanriaumakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kepulauanriaumakanan.jpeg")
                .into(kepulauanriaumakanan);

        ImageView kepulauanriautarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kepulauanriautarian.jpg")
                .into(kepulauanriautarian);

        ImageView kepulauanriauobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kepulauanriauobjekwisata.jpeg")
                .into(kepulauanriauobjekwisata);

        ImageView kepulauanriaualatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kepulauanriaualatmusik.jpeg")
                .into(kepulauanriaualatmusik);

        ImageView kepulauanriauupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kepulauanriauupacara.jpeg")
                .into(kepulauanriauupacara);

        ImageView kepulauanriausenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kepulauanriausenjata.jpeg")
                .into(kepulauanriausenjata);

        ImageView kepulauanriauproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kepulauanriauproduk.jpeg")
                .into(kepulauanriauproduk);

        ImageView kepulauanriaupermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kepulauanriaupermainan.jpeg")
                .into(kepulauanriaupermainan);

        ImageView kepulauanriauflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kepulauanriauflora.jpeg")
                .into(kepulauanriauflora);

        ImageView kepulauanriaufauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kepulauanriaufauna.jpg")
                .into(kepulauanriaufauna);

        kepulauanriaupakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        kepulauanriaurumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        kepulauanriaumakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        kepulauanriautarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        kepulauanriauobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        kepulauanriaualatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        kepulauanriauupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        kepulauanriausenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        kepulauanriauproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        kepulauanriaupermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        kepulauanriauflora.setOnClickListener(v -> showPopupSlider(this, flora));
        kepulauanriaufauna.setOnClickListener(v -> showPopupSlider(this, fauna));


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