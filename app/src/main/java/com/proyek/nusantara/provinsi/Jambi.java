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
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> objekwisata = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> alatmusik = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> upacara = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> senjata = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> produk = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> permainan = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> flora = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
    );

    private final List<PopupItem> fauna = Arrays.asList(
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten"),
            new PopupItem("link", "kabupaten")
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