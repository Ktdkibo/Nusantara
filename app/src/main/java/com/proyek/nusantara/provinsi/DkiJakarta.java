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

public class DkiJakarta extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20jakarta%20pusat.webp", "Kabupaten Pusat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20jakarta%20selatan.webp", "Kabupaten Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20jakarta%20timur.webp", "Kabupaten Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20jakarta%20utara.png", "Kabupaten Utara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20jakarta%20kepulauan%20seribu.jpg", "Kabupaten Kepulauan Seribu")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20jakarta%20pusat.jpeg", "Kabupaten Jakarta Pusat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20jakarta%20selatan.jpg", "Kabupaten Jakarta Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20jakarta%20timur.jpg", "Kabupaten Jakarta Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20jakarta%20utara.jpg", "Kabupaten Jakarta Utara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20kepulauan%20seribu.jpg", "Kabupaten Kepulauan Seribu")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20jakarta%20pusat.jpg", "Kabupaten Jakarta Pusat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20jakarta%20selatan.jpg", "Kabupaten Jakarta Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20jakarta%20timur.jpg", "Kabupaten Jakarta Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20jakarta%20utara.jpg", "Kabupaten Jakarta Utara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20kepulauan%20seribu.jpg", "Kabupaten Kepulauan Seribu")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20jakarta.jpg", "Kabupaten Jakarta"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20kepulauan%20seribu.jpg", "Kabupaten Kepulauan Seribu")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20jakarta%20pusat.jpg", "Kabupaten Jakarta Pusat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20jakarta%20selatan.jpg", "Kabupaten Jakarta Selatan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20jakarta%20timur.jpg", "Kabupaten Jakarta Timur"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20jakarta%20utara.jpg", "Kabupaten Jakarta Utara"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/wisata%20kepulauan%20seribu.jpg", "Kabupaten Kepulauan Seribu")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/alat%20musik%20dki%20jakarta.jpg", "Provinsi Jakarta")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20jakarta%20pusat.jpg", "Kabupaten Jakarta Pusat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/upacara%20kepulauan%20seribu.jpg", "Kabupaten Kepulauan Seribu")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/senjata%20jakarta%20pusat.jpg", "Kabupaten Jakarta Pusat"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/kepulauan%20seribu.jpg", "Kabupaten Kepulauan Seribu")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/produk%20jakarta%20pusat.jpg", "Kabupaten Jakarta Pusat")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/permainan%20jakarta%20pusat.jpg", "Kabupaten Jakarta Pusat")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/flora%20kepulauan%20seribu.jpg", "Kabupaten Kepulauan Seribu")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/fauna%20jakarta%20pusat.jpg", "Kabupaten Jakarta Pusat")
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_provinsi_dki_jakarta);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_dkijakarta.webp")
                .into(headerprovinsi);

        ImageView dkijakartapakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/dkijakartapakaian.webp")
                .into(dkijakartapakaian);

        ImageView dkijakartarumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_dkijakarta.jpg")
                .into(dkijakartarumah);

        ImageView dkijakartamakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/dkijakartamakanan.webp")
                .into(dkijakartamakanan);

        ImageView dkijakartatarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/dkijakartatarian.webp")
                .into(dkijakartatarian);

        ImageView dkijakartaobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/dkijakartaobjekwisata.webp")
                .into(dkijakartaobjekwisata);

        ImageView dkijakartaalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/dkijakartaalatmusik.webp")
                .into(dkijakartaalatmusik);

        ImageView dkijakartaupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/dkijakartaupacara.webp")
                .into(dkijakartaupacara);

        ImageView dkijakartasenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/dkijakartasenjata.webp")
                .into(dkijakartasenjata);

        ImageView dkijakartaproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/dkijakartaproduk.webp")
                .into(dkijakartaproduk);

        ImageView dkijakartapermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/dkijakartapermainan.webp")
                .into(dkijakartapermainan);

        ImageView dkijakartaflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/dkijakartaflora.webp")
                .into(dkijakartaflora);

        ImageView dkijakartafauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/dkijakartafauna.webp")
                .into(dkijakartafauna);

        dkijakartapakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        dkijakartarumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        dkijakartamakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        dkijakartatarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        dkijakartaobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        dkijakartaalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        dkijakartaupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        dkijakartasenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        dkijakartaproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        dkijakartapermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        dkijakartaflora.setOnClickListener(v -> showPopupSlider(this, flora));
        dkijakartafauna.setOnClickListener(v -> showPopupSlider(this, fauna));


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