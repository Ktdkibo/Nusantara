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

public class SulawesiBarat extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20majene.webp", "Kabupaten Majene"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20mamasa.jpeg", "Kabupaten Mamasa"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20mamuju%20tengah.webp", "Kabupaten Mamuju Tengah"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20mamuju.jpg", "Kabupaten Mamuju"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20pasangkayu.jpg", "Kabupaten Pasangkayu")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20majene.jpg", "Kabupaten Majene"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20mamasa.jpg", "Kabupaten Mamasa"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20mamuju%20tengah.jpg", "Kabupaten Mamuju Tengah"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20mamuju.jpg", "Kabupaten Mamuju"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20pasang%20kayu.jpg", "Kabupaten Pasangkayu")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20majene.jpg", "Kabupaten Majene"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20mamasa.jpg", "Kabupaten Mamasa"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20mamuju%20tengah.jpg", "Kabupaten Mamuju Tengah"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20mamuju.jpg", "Kabupaten Mamuju"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20pasangkayu.jpg", "Kabupaten Pasangkayu")
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
        setContentView(R.layout.activity_provinsi_sulawesi_barat);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_sulawesibarat.webp")
                .into(headerprovinsi);

        ImageView sulawesibaratpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesibaratpakaian.jpg")
                .into(sulawesibaratpakaian);

        ImageView sulawesibaratrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_sulawesibarat.webp")
                .into(sulawesibaratrumah);

        ImageView sulawesibaratmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesibaratmakanan.jpg")
                .into(sulawesibaratmakanan);

        ImageView sulawesibarattarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesibarattarian.jpg")
                .into(sulawesibarattarian);

        ImageView sulawesibaratobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesibaratobjekwisata.jpg")
                .into(sulawesibaratobjekwisata);

        ImageView sulawesibaratalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesibaratalatmusik.jpeg")
                .into(sulawesibaratalatmusik);

        ImageView sulawesibaratupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesibaratupacara.png")
                .into(sulawesibaratupacara);

        ImageView sulawesibaratsenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesibaratsenjata.jpg")
                .into(sulawesibaratsenjata);

        ImageView sulawesibaratproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesibaratproduk.jpeg")
                .into(sulawesibaratproduk);

        ImageView sulawesibaratpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesibaratpermainan.jpg")
                .into(sulawesibaratpermainan);

        ImageView sulawesibaratflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesibaratflora.jpeg")
                .into(sulawesibaratflora);

        ImageView sulawesibaratfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/sulawesibaratfauna.jpg")
                .into(sulawesibaratfauna);

        sulawesibaratpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        sulawesibaratrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        sulawesibaratmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        sulawesibarattarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        sulawesibaratobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        sulawesibaratalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        sulawesibaratupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        sulawesibaratsenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        sulawesibaratproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        sulawesibaratpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        sulawesibaratflora.setOnClickListener(v -> showPopupSlider(this, flora));
        sulawesibaratfauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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