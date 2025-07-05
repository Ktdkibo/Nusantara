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

public class Jambi extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20batanghari.avif", "Kabupaten Batanghari"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bungo.webp", "Kabupaten Bungo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20kerinci.jpg", "Kabupaten Kerinci"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20meramgin.jpg", "Kabupaten Merangin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20sarolangun.jpg", "Kabupaten Sarolangun")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20batanghari.jpg", "Kabupaten Batanghari"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20kerinci.jfif", "Kabupaten Kerinci"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20merangin.jpg", "Kabupaten Merangin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20sarolangun.webp", "Kabupaten Sarolangun"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20dat%20bungo.webp", "Kabupaten Bungo")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20batanghari.jpg", "Kabupaten Batanghari"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bungo.jpg", "Kabupaten Bungo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20kerinci.jpg", "Kabupaten Kerinci"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20merangin.jpg", "Kabupaten Merangin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20sarolangun.jpeg", "Kabupaten Sarolangun")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20batang%20ari.jpg", "Kabupaten Batanghari"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20bungo.jpg", "Kabupaten Bungo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20kerinci.jpg", "Kabupaten Kerinci"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20merangin.jpg", "Kabupaten Merangin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20sarolangun.jpg", "Kabupaten Sarolangun")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20batanghari.jpg", "Kabupaten Batanghari"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20bungo.jpg", "Kabupaten Bungo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20kerinci.jpg", "Kabupaten Kerinci"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20merangin.jpg", "Kabupaten Merangin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20sarolangun.jpg", "Kabupaten Sarolangun")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20jambi.jpg", "Provinsi Jambi")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20merangin.jpg", "Kabupaten Merangin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20sarolangun.jpg", "Kabupaten Sarolangun")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20batanghari.jpg", "Kabupaten Batanghari"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20bungo.jpg", "Kabupaten Bungo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20kerinci.jpg", "Kabupaten Kerinci"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20merangin.jpg", "Kabupaten Merangin"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20sarolangun.jpg", "Kabupaten Sarolangun")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20merangin.jpg", "Kabupaten Merangin")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20batanghari.jpg", "Kabupaten Batanghari")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20batanghari.jpg", "Kabupaten Batanghari")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20batang%20hari.jpg", "Kabupaten Batanghari")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_jambi);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_jambi.webp")
                .into(headerprovinsi);

        ImageView jambipakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jambipakaian.webp")
                .into(jambipakaian);

        ImageView jambirumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_jambi.webp")
                .into(jambirumah);

        ImageView jambimakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jambimakanan.webp")
                .into(jambimakanan);

        ImageView jambitarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jambitarian.webp")
                .into(jambitarian);

        ImageView jambiobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jambiobjekwisata.webp")
                .into(jambiobjekwisata);

        ImageView jambialatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jambialatmusik.webp")
                .into(jambialatmusik);

        ImageView jambiupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jambiupacara.webp")
                .into(jambiupacara);

        ImageView jambisenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jambisenjata.webp")
                .into(jambisenjata);

        ImageView jambiproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jambiproduk.webp")
                .into(jambiproduk);

        ImageView jambipermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jambipermainan.webp")
                .into(jambipermainan);

        ImageView jambiflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jambiflora.webp")
                .into(jambiflora);

        ImageView jambifauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jambifauna.webp")
                .into(jambifauna);

        jambipakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        jambirumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        jambimakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        jambitarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        jambiobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        jambialatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        jambiupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        jambisenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        jambiproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        jambipermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        jambiflora.setOnClickListener(v -> showPopupSlider(this, flora));
        jambifauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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