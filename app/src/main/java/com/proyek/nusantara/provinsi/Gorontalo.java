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

public class Gorontalo extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20boalemo.jpg", "Kabupaten Boalemo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bone%20bolango.webp", "Kabupaten Bone Bolango"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20gorontalo%20utara.jpg", "Kabupaten Gorontalo Utara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20gorontalo.jpg", "Kabupaten Gorontalo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20pohuwato.jpg", "Kabupaten Pohuwato")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20boalemo.webp", "Kabupaten Boalemo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20bone%20bolango.jpeg", "Kabupaten Bone Bolango"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20gorontalo utara.jpg", "Kabupaten Gorontalo Utara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20gorontalo.jpg", "Kabupaten Gorontalo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20pohuwato.jpg", "Kabupaten Pohuwato")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20boalemo.jpg", "Kabupaten Boalemo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bone%20bolango.jpg", "Kabupaten Bone Bolango"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20gorontalo%20utara.jpg", "Kabupaten Gorontalo Utara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20gorontalo.jpg", "Kabupaten Gorontalo"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20pohuwato.jpg", "Kabupaten Pohuwato")
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
        setContentView(R.layout.activity_provinsi_gorontalo);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_gorontalo.webp")
                .into(headerprovinsi);

        ImageView gorontalopakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/gorontalopakaian.webp")
                .into(gorontalopakaian);

        ImageView gorontalorumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_gorontalo.webp")
                .into(gorontalorumah);

        ImageView gorontalomakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/gorontalomakanan.webp")
                .into(gorontalomakanan);

        ImageView gorontalotarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/gorontalotarian.webp")
                .into(gorontalotarian);

        ImageView gorontaloobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/gorontaloobjekwisata.webp")
                .into(gorontaloobjekwisata);

        ImageView gorontaloalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/gorontaloalatmusik.webp")
                .into(gorontaloalatmusik);

        ImageView gorontaloupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/gorontaloupacara.webp")
                .into(gorontaloupacara);

        ImageView gorontalosenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/gorontalosenjata.webp")
                .into(gorontalosenjata);

        ImageView gorontaloproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/gorontaloproduk.webp")
                .into(gorontaloproduk);

        ImageView gorontalopermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/gorontalopermainan.webp")
                .into(gorontalopermainan);

        ImageView gorontaloflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/gorontaloflora.jpg")
                .into(gorontaloflora);

        ImageView gorontalofauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/gorontalofauna.webp")
                .into(gorontalofauna);

        gorontalopakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        gorontalorumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        gorontalomakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        gorontalotarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        gorontaloobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        gorontaloalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        gorontaloupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        gorontalosenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        gorontaloproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        gorontalopermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        gorontaloflora.setOnClickListener(v -> showPopupSlider(this, flora));
        gorontalofauna.setOnClickListener(v -> showPopupSlider(this, fauna));


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