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

public class Aceh extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/Pakaian%20Kabupaten%20Aceh%20Besar.jpg", "Kabupaten Aceh Besar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/Pakaian%20Kabupaten%20Aceh%20Barat.webp", "Kabupaten Aceh Barat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/Pakaian%20Kabupaten%20Aceh%20Selatan.jpg", "Kabupaten Aceh Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/Pakaian%20Kabupaten%20Aceh%20Singkil.jpeg", "Kabupaten Aceh Singkil"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/Pakaian%20Kabupaten%20Aceh%20Tenggara.jpg", "Kabupaten Aceh Tenggara")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20aceh%20jaya.jpg", "Kabupaten Aceh Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20aceh%20singkil.jpg", "Kabupaten Aceh Singkil"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20aceh%20tamiang.webp", "Kabupaten Aceh Tamiang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20gayo%20lues.jpg", "Kabupaten Gayo Lues"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20pidie.jpeg", "Kabupaten Pidie")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20aceh%20jaya.jpg", "Kabupaten Aceh Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20aceh%20singkil.jpg", "Kabupaten Aceh Singkil"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20aceh%20tamiang.jpg", "Kabupaten Aceh Tamiang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20gayo%20lues.jpg", "Kabupaten Gayo Lues"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20pidie.jpg", "Kabupaten Pidie")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20aceh%20jaya.jpg", "Kabupaten Aceh Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20aceh%20singkil.jpg", "Kabupaten Aceh Singkil"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20aceh%20tamiang.jpg", "Kabupaten Aceh Tamiang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20gayo%20lues.jpg", "Kabupaten Gayo Lues"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20pidie.jpg", "Kabupaten Pidie")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/objekwisata%20aceh%20jaya.jpg", "Kabupaten Aceh Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/objekwisata%20aceh%20singkil.jpg", "Kabupaten Aceh Singkil"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/objekwisata%20aceh%20tamiang.jpg", "Kabupaten Aceh Tamiang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/objekwisata%20gayo%20lues.jpg", "Kabupaten Gayo Lues"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/objekwisata%20pidie.jpg", "Kabupaten Pidie")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alatmusik%20aceh%20jaya.jpg", "Kabupaten Aceh Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alatmusik%20aceh%20singkil.jpg", "Kabupaten Aceh Singkil"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alatmusik%20aceh%20tamiang.jpg", "Kabupaten Aceh Tamiang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alatmusik%20gayo%20lues.jpg", "Kabupaten Gayo Lues"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alatmusik%20pidie.jpg", "Kabupaten Pidie")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20aceh%20jaya.jpg", "Kabupaten Aceh Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20aceh%20singkil.jpg", "Kabupaten Aceh Singkil"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20aceh%20tamiang.jpg", "Kabupaten Aceh Tamiang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20gayo%20lues.jpg", "Kabupaten Gayo Lues"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20pidie.jpg", "Kabupaten Pidie")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20aceh%20jaya.jpg", "Kabupaten Aceh Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20aceh%20singkil.jpg", "Kabupaten Aceh Singkil"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20aceh%20tamiang.jpg", "Kabupaten Aceh Tamiang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20gayo%20lues.jpg", "Kabupaten Gayo Lues"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20pidie.jpg", "Kabupaten Pidie")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20aceh%20jaya.jpg", "Kabupaten Aceh Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20aceh%20singkil.jpg", "Kabupaten Aceh Singkil"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20aceh%20tamiang.jpg", "Kabupaten Aceh Tamiang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20gayo%20lues.jpg", "Kabupaten Gayo Lues"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20pidie.jpg", "Kabupaten Pidie")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20aceh%20jaya.jpg", "Kabupaten Aceh Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20aceh%20singkil.jpg", "Kabupaten Aceh Singkil"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20aceh%20tamiang.jpg", "Kabupaten Aceh Tamiang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20gayo%20lues.jpg", "Kabupaten Gayo Lues"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20pidie.jpg", "Kabupaten Pidie")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20aceh%20jaya.jpg", "Kabupaten Aceh Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20aceh%20singkil.jpg", "Kabupaten Aceh Singkil"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20aceh%20tamiang.jpg", "Kabupaten Aceh Tamiang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20gayo%20lues.jpg", "Kabupaten Gayo Lues"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20pidie.jpg", "Kabupaten Pidie")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20aceh%20jaya.jpg", "Kabupaten Aceh Jaya"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20aceh%20singkil.jpg", "Kabupaten Aceh Singkil"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20aceh%20tamiang.jpg", "Kabupaten Aceh Tamiang"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20gayo%20lues.jpg", "Kabupaten Gayo Lues"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20pidie.jpg", "Kabupaten Pidie")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_aceh);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_aceh.webp")
                .into(headerprovinsi);

        ImageView acehpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/acehpakaian.webp")
                .into(acehpakaian);

        ImageView acehrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_aceh.webp")
                .into(acehrumah);

        ImageView acehmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/acehmakanan.webp")
                .into(acehmakanan);

        ImageView acehtarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/acehtari.webp")
                .into(acehtarian);

        ImageView acehobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/acehobjekwisata.webp")
                .into(acehobjekwisata);

        ImageView acehalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/acehalatmusik.webp")
                .into(acehalatmusik);

        ImageView acehupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/acehupacara.webp")
                .into(acehupacara);

        ImageView acehsenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/acehsenjata.webp")
                .into(acehsenjata);

        ImageView acehproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/acehproduk.webp")
                .into(acehproduk);

        ImageView acehpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/acehpermainan.webp")
                .into(acehpermainan);

        ImageView acehflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/acehflora.webp")
                .into(acehflora);

        ImageView acehfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/acehfauna.webp")
                .into(acehfauna);

        acehpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        acehrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        acehmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        acehtarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        acehobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        acehalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        acehupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        acehsenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        acehproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        acehpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        acehflora.setOnClickListener(v -> showPopupSlider(this, flora));
        acehfauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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