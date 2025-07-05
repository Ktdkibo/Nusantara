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

public class Maluku extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20ambon.jpg", "Kabupaten Ambon"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20buru.png", "Kabupaten Buru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20kepulauan%20aru.jpg", "Kabupaten Kepulauan Aru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20seram%20bagian%20barat.jpeg", "Kabupaten Seram Bagian Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20tual.jpg", "Kabupaten Tual")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20ambon.jpg", "Kabupaten Ambon"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20buru.jpg", "Kabupaten Buru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20kepulauan%20aru.jpg", "Kabupaten Kepulauan Aru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20seram%20bagian%20barat.jpg", "Kabupaten Seram Bagian Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20tual.jpg", "Kabupaten Tual")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20ambon.jpg", "Kabupaten Ambon"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20buru.jpg", "Kabupaten Buru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20kepulauan%20aru.jpg", "Kabupaten Kepulauan Aru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20seram%20bagian%20barat.jpg", "Kabupaten Seram Bagian Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20tual.jpg", "Kabupaten Tual")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/taria%20ambon.jpg", "Kabupaten Ambon"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20buru.jpg", "Kabupaten Buru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20kepulauan%20aru.jpg", "Kabupaten Kepulauan Aru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20seram%20bagian%20barat.jpg", "Kabupaten Seram Bagian Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20tual.jpg", "Kabupaten Tual")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20ambon.jpg", "Kabupaten Ambon"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20buru.jpg", "Kabupaten Buru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20kepulauan%20aru.jpg", "Kabupaten Kepulauan Aru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20seram%20bagian%20barat.jpg", "Kabupaten Seram Bagian Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20tual.jpg", "Kabupaten Tual")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20ambon.jpg", "Kabupaten Ambon"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20buru.jpg", "Kabupaten Buru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20seram%20bagian%20barat.jpg", "Kabupaten Seram Bagian Barat")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20seram%20bagian%20barat.jpg", "Kabupaten Seram Bagian Barat")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20ambon.jpg", "Kabupaten Ambon"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20buru.jpg", "Kabupaten Buru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20kepulauan%20aru.jpg", "Kabupaten Kepulauan Aru"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20seram%20bagian%20barat.jpg", "Kabupaten Seram Bagian Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20tual.jpg", "Kabupaten Tual")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20ambon.jpg", "Kabupaten Ambon")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20seram%20bagian%20barat.jpg", "Kabupaten Seram Bagian Barat")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20seram%20bagian%20barat.jpg", "Kabupaten Seram Bagian Barat")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20ambon.jpg", "Kabupaten Ambon")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_maluku);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_maluku.webp")
                .into(headerprovinsi);

        ImageView malukupakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukupakaian.jpg")
                .into(malukupakaian);

        ImageView malukurumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_maluku.webp")
                .into(malukurumah);

        ImageView malukumakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukumakanan.jpg")
                .into(malukumakanan);

        ImageView malukutarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukutarian.jpg")
                .into(malukutarian);

        ImageView malukuobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuobjekwisata.jpg")
                .into(malukuobjekwisata);

        ImageView malukualatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukualatmusik.jpg")
                .into(malukualatmusik);

        ImageView malukuupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuupacara.jpg")
                .into(malukuupacara);

        ImageView malukusenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukusenjata.jpeg")
                .into(malukusenjata);

        ImageView malukuproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuproduk.jpeg")
                .into(malukuproduk);

        ImageView malukupermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukupermainan.jpg")
                .into(malukupermainan);

        ImageView malukuflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukuflora.jpg")
                .into(malukuflora);

        ImageView malukufauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/malukufauna.jpg")
                .into(malukufauna);

        malukupakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        malukurumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        malukumakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        malukutarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        malukuobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        malukualatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        malukuupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        malukusenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        malukuproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        malukupermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        malukuflora.setOnClickListener(v -> showPopupSlider(this, flora));
        malukufauna.setOnClickListener(v -> showPopupSlider(this, fauna));


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