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

public class Papua extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20biak%20numfor.jpg", "Kabupaten Biak Numfor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20jayapura.jpg", "Kabupaten Jayapura"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20keerom.jpeg", "Kabupaten Keerom"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/Pakaian%20kepulauan%20yapen.jpg", "Kabupaten Kepulauan Yapen"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20sarmi.jpg", "Kabupaten Sarmi")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20biak%20numfor.jpg", "Kabupaten Biak Numfor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20jayapura.png", "Kabupaten Jayapura"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20keerom.jpg", "Kabupaten Keerom"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20sarmi.jpg", "Kabupaten Sarmi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20yapen.jpg", "Kabupaten Kepulauan Yapen")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20biak%20numfor.jpg", "Kabupaten Biak Numfor"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20jayapura.jpg", "Kabupaten Jayapura"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20keerom.jpg", "Kabupaten Keerom"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20kepulauan%20yapen.jpg", "Kabupaten Kepulauan Yapen"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20sarmi.jpg", "Kabupaten Sarmi")
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
        setContentView(R.layout.activity_provinsi_papua);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_papua.webp")
                .into(headerprovinsi);

        ImageView papuapakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuapakaian.png")
                .into(papuapakaian);

        ImageView papuarumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_papua.webp")
                .into(papuarumah);

        ImageView papuamakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuamakanan.jpg")
                .into(papuamakanan);

        ImageView papuatarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuatarian.jpg")
                .into(papuatarian);

        ImageView papuaobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaobjekwisata.jpg")
                .into(papuaobjekwisata);

        ImageView papuaalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaalatmusik.jpeg")
                .into(papuaalatmusik);

        ImageView papuaupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaupacara.png")
                .into(papuaupacara);

        ImageView papuasenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuasenjata.jpg")
                .into(papuasenjata);

        ImageView papuaproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaproduk.jpg")
                .into(papuaproduk);

        ImageView papuapermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuapermainan.jpg")
                .into(papuapermainan);

        ImageView papuaflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuaflora.webp")
                .into(papuaflora);

        ImageView papuafauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/papuafauna.webp")
                .into(papuafauna);

        papuapakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        papuarumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        papuamakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        papuatarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        papuaobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        papuaalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        papuaupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        papuasenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        papuaproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        papuapermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        papuaflora.setOnClickListener(v -> showPopupSlider(this, flora));
        papuafauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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