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

public class SulawesiTenggara extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bombana.webp", "Kabupaten Bombana"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20butn.jpg", "Kabupaten Buton"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20kolaka%20timur.webp", "Kabupaten Kolaka Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20kolaka.webp", "Kabupaten Kolaka"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20konawe.jpg", "Kabupaten Konawe")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20bombana.jpg", "Kabupaten Bombana"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20buton.jpg", "Kabupaten Buton"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20kolaka%20timur.png", "Kabupaten Kolaka Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20kolaka.jpeg", "Kabupaten Kolaka"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20konawe.jpeg", "Kabupaten Konawe")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bombana.jpg", "Kabupaten Bombana"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20buton.jpeg", "Kabupaten Buton"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20konawe.jpg", "Kabupaten Konawe")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20bombana.jpg", "Kabupaten Bombana"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20buton.jpg", "Kabupaten Buton"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20kolaka.jpg", "Kabupaten Kolaka"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20konawe.jpg", "Kabupaten Konawe")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20bombana.jpg", "Kabupaten Bombana"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20buton.jpg", "Kabupaten Buton"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20kolaka.jpg", "Kabupaten Kolaka"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20konawe.jpg", "Kabupaten Konawe")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20sulawesi%20tenggara.jpg", "Provinsi Sulawesi Tenggara")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20kolaka.jpg", "Kabupaten Kolaka"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20konawe.jpg", "Kabupaten Konawe"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/Sulawesi%20Tenggara.jpg", "Provinsi Sulawesi Tenggara")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20bombana.jpg", "Kabupaten Bombana"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20buton.jpg", "Kabupaten Buton"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senajata%20kolaka.jpg", "Kabupaten Kolaka"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senajata%20konawe.jpg", "Kabupaten Konawe")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20konawe.jpg", "Kabupaten Konawe")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20bombana.jpg", "Kabupaten Bombana")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20bombana.jpg", "Kabupaten Bombana")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20bombana.jpg", "Kabupaten Bombana")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_sulawesi_tenggara);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_sulawesitenggara.webp")
                .into(headerprovinsi);

        ImageView sulawesitenggarapakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitenggarapakaian.jpg")
                .into(sulawesitenggarapakaian);

        ImageView sulawesitenggararumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_sulawesitenggara.webp")
                .into(sulawesitenggararumah);

        ImageView sulawesitenggaramakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitenggaramakanan.jpg")
                .into(sulawesitenggaramakanan);

        ImageView sulawesitenggaratarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitenggaratarian.jpg")
                .into(sulawesitenggaratarian);

        ImageView sulawesitenggaraobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitenggaraobjekwisata.jpg")
                .into(sulawesitenggaraobjekwisata);

        ImageView sulawesitenggaraalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitenggaraalatmusik.webp")
                .into(sulawesitenggaraalatmusik);

        ImageView sulawesitenggaraupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitenggaraupacara.jpg")
                .into(sulawesitenggaraupacara);

        ImageView sulawesitenggarasenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitenggarasenjata.jpg")
                .into(sulawesitenggarasenjata);

        ImageView sulawesitenggaraproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitenggaraproduk.webp")
                .into(sulawesitenggaraproduk);

        ImageView sulawesitenggarapermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitenggarapermainan.jpg")
                .into(sulawesitenggarapermainan);

        ImageView sulawesitenggaraflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitenggaraflora.jpg")
                .into(sulawesitenggaraflora);

        ImageView sulawesitenggarafauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesitenggarafauna.jpg")
                .into(sulawesitenggarafauna);

        sulawesitenggarapakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        sulawesitenggararumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        sulawesitenggaramakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        sulawesitenggaratarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        sulawesitenggaraobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        sulawesitenggaraalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        sulawesitenggaraupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        sulawesitenggarasenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        sulawesitenggaraproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        sulawesitenggarapermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        sulawesitenggaraflora.setOnClickListener(v -> showPopupSlider(this, flora));
        sulawesitenggarafauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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