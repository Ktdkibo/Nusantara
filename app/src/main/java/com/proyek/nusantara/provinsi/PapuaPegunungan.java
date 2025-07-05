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

public class PapuaPegunungan extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20jayawijaya.jpg", "Kabupaten Jayawijaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20lanny%20jaya.jpg", "Kabupaten Lanny Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20nduga.jpg", "Kabupaten Nduga"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20yahukimo.jpg", "Kabupaten Yahukimo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20yalimo.jpeg", "Kabupaten Yalimo")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20jayawijaya.jpg", "Kabupaten Jayawijaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20lanny%20jaya.jpg", "Kabupaten Lanny Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20nduga.jpg", "Kabupaten Nduga"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20yahukimo.jpg", "Kabupaten Yahukimo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20yalimo.jpg", "Kabupaten Yalimo")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20jayawijaya.jpg", "Kabupaten Jayawijaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20nduga.jpg", "Kabupaten Nduga"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20yalimo.jpg", "Kabupaten Yalimo")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20jayawijaya.jpg", "Kabupaten Jayawijaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20lanny%20jaya.jpg", "Kabupaten Lanny Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20nduga.jpg", "Kabupaten Nduga"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20yahukimo.jpg", "Kabupaten Yahukimo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20yalimo.jpg", "Kabupaten Yalimo")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20jayawijaya.jpg", "Kabupaten Jayawijaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20lanny%20jaya.jpg", "Kabupaten Lanny Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20nduga.jpg", "Kabupaten Nduga"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20yahukimo.jpg", "Kabupaten Yahukimo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20yalimo.jpg", "Kabupaten Yalimo")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20pegunungan%20papua.jpg", "Provinsi Papua Pegunungan")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20nduga.jpg", "Kabupaten Nduga"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20yalimo.jpg", "Kabupaten Yalimo")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20jayawijaya.jpg", "Kabupaten Jayawijaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20lanny%20jaya.jpg", "Kabupaten Lanny Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20nduga.jpg", "Kabupaten Nduga"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20yahukimo.jpg", "Kabupaten Yahukimo")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20yalimo.jpg", "Kabupaten Yalimo")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20jayawijaya.jpg", "Kabupaten Jayawijaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20yalimo.jpg", "Kabupaten Yalimo")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20nduga.jpg", "Kabupaten Nduga")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20yalimo.jpg", "Kabupaten Yalimo")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_papua_pegunungan);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_papuapegunungan.webp")
                .into(headerprovinsi);

        ImageView papuapegununganpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuapegununganpakaian.jpeg")
                .into(papuapegununganpakaian);

        ImageView papuapegununganrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_papuapegunungan.webp")
                .into(papuapegununganrumah);

        ImageView papuapegununganmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuapegununganmakanan.jpeg")
                .into(papuapegununganmakanan);

        ImageView papuapegunungantarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuapegunungantarian.jpeg")
                .into(papuapegunungantarian);

        ImageView papuapegununganobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuapegununganobjekwisata.jpg")
                .into(papuapegununganobjekwisata);

        ImageView papuapegununganalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuapegununganalatmusik.jpeg")
                .into(papuapegununganalatmusik);

        ImageView papuapegununganupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuapegununganupacara.jpg")
                .into(papuapegununganupacara);

        ImageView papuapegunungansenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuapegunungansenjata.jpeg")
                .into(papuapegunungansenjata);

        ImageView papuapegununganproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuapegununganproduk.jpg")
                .into(papuapegununganproduk);

        ImageView papuapegununganpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuapegununganpermainan.jpeg")
                .into(papuapegununganpermainan);

        ImageView papuapegununganflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuapegununganflora.jpeg")
                .into(papuapegununganflora);

        ImageView papuapegununganfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuapegununganfauna.webp")
                .into(papuapegununganfauna);

        papuapegununganpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        papuapegununganrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        papuapegununganmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        papuapegunungantarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        papuapegununganobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        papuapegununganalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        papuapegununganupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        papuapegunungansenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        papuapegununganproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        papuapegununganpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        papuapegununganflora.setOnClickListener(v -> showPopupSlider(this, flora));
        papuapegununganfauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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