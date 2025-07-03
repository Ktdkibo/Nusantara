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

public class JawaBarat extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bandung.jpg", "Kabupaten Bandung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bekasi.jpg", "Kabupaten Bekasi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bogor.jpeg", "Kabupaten Bogor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20ciamis.jpeg", "Kabupaten Ciamis"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20cirebon.jpg", "Kabupaten Cirebon")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20bandung.avif", "Kabupaten Bandung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20bekasi.jpg", "Kabupaten Bekasi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20ciamis.jpeg", "Kabupaten Ciamis"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20cireon.avif", "Kabupaten Cirebon")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bandung.jpg", "Kabupaten Bandung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bekasi.jpg", "Kabupaten Bekasi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bogor.jpg", "Kabupaten Bogor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20ciamis.jpg", "Kabupaten Ciamis"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20cirebon.jpg", "Kabupaten Cirebon")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20bandung.jpg", "Kabupaten Bandung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20bekasi.jpg", "Kabupaten Bekasi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20bogor.jpg", "Kabupaten Bogor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20ciamis.jpg", "Kabupaten Ciamis"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20cirebon.jpg", "Kabupaten Cirebon")
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
        setContentView(R.layout.activity_provinsi_jawa_barat);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_jawabarat.webp")
                .into(headerprovinsi);

        ImageView jawabaratpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawabaratpakaian.webp")
                .into(jawabaratpakaian);

        ImageView jawabaratrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_jawabarat.webp")
                .into(jawabaratrumah);

        ImageView jawabaratmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawabaratmakanan.webp")
                .into(jawabaratmakanan);

        ImageView jawabarattarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawabarattarian.webp")
                .into(jawabarattarian);

        ImageView jawabaratobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawabaratobjekwisata.webp")
                .into(jawabaratobjekwisata);

        ImageView jawabaratalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawabaratalatmusik.webp")
                .into(jawabaratalatmusik);

        ImageView jawabaratupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawabaratupacara.webp")
                .into(jawabaratupacara);

        ImageView jawabaratsenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawabaratsenjata.webp")
                .into(jawabaratsenjata);

        ImageView jawabaratproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawabaratproduk.webp")
                .into(jawabaratproduk);

        ImageView jawabaratpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawabaratpermainan.webp")
                .into(jawabaratpermainan);

        ImageView jawabaratflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawabaratflora.jpg")
                .into(jawabaratflora);

        ImageView jawabaratfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawabaratfauna.webp")
                .into(jawabaratfauna);

        jawabaratpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        jawabaratrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        jawabaratmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        jawabarattarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        jawabaratobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        jawabaratalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        jawabaratupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        jawabaratsenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        jawabaratproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        jawabaratpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        jawabaratflora.setOnClickListener(v -> showPopupSlider(this, flora));
        jawabaratfauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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