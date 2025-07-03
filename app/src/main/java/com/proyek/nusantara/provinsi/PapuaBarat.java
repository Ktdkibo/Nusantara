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

public class PapuaBarat extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20fakfak.jpg", "Kabupaten Fakfak"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20kaimana.jpg", "Kabupaten Kaimana"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20manokwari.jpg", "Kabupaten Manokwari"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20teluk%20bintuni.jpeg", "Kabupaten Teluk Bintuni"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20teluk%20wondama.jpeg", "Kabupaten Teluk Wondama")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20fakfak.jpeg", "Kabupaten Fakfak"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20kaimana.jpeg", "Kabupaten Kaimana"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20manokwari.jpg", "Kabupaten Manokwari"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20teluk%20bintuni.webp", "Kabupaten Teluk Bintuni"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20wondama.jpg", "Kabupaten Wondama")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20fakfak.jpg", "Kabupaten Fakfak"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20kaimana.jpg", "Kabupaten Kaimana"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20manokwari.jpg", "Kabupaten Manokwari"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20teluk%20bintuni.jpg", "Kabupaten Teluk Bintuni"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20teluk%20wondama.jpg", "Kabupaten Teluk Wondama")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20fakfak.jpg", "Kabupaten Fakfak"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20kaimana.jpg", "Kabupaten Kaimana"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20manokwari.jpg", "Kabupaten Manokwari"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20teluk%20bintuni.jpg", "Kabupaten Teluk Bintuni"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20teluk%20wondama.jpg", "Kabupaten Teluk Wondama")
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
        setContentView(R.layout.activity_provinsi_papua_barat);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_papuabarat.webp")
                .into(headerprovinsi);

        ImageView papuabaratpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratpakaian.jpg")
                .into(papuabaratpakaian);

        ImageView papuabaratrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_papuabarat.webp")
                .into(papuabaratrumah);

        ImageView papuabaratmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratmakanan.jpg")
                .into(papuabaratmakanan);

        ImageView papuabarattarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabarattarian.jpg")
                .into(papuabarattarian);

        ImageView papuabaratobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratobjekwisata.jpg")
                .into(papuabaratobjekwisata);

        ImageView papuabaratalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratalatmusik.jpg")
                .into(papuabaratalatmusik);

        ImageView papuabaratupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratupacara.jpg")
                .into(papuabaratupacara);

        ImageView papuabaratsenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratsenjata.jpg")
                .into(papuabaratsenjata);

        ImageView papuabaratproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratproduk.jpeg")
                .into(papuabaratproduk);

        ImageView papuabaratpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratpermainan.jpg")
                .into(papuabaratpermainan);

        ImageView papuabaratflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratflora.jpg")
                .into(papuabaratflora);

        ImageView papuabaratfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuabaratfauna.jpg")
                .into(papuabaratfauna);

        papuabaratpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        papuabaratrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        papuabaratmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        papuabarattarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        papuabaratobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        papuabaratalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        papuabaratupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        papuabaratsenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        papuabaratproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        papuabaratpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        papuabaratflora.setOnClickListener(v -> showPopupSlider(this, flora));
        papuabaratfauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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