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

public class Yogyakarta extends AppCompatActivity {

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
        setContentView(R.layout.activity_provinsi_yogyakarta);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_yogyakarta.webp")
                .into(headerprovinsi);

        ImageView yogyakartapakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/yogyakartapakaian.jpg")
                .into(yogyakartapakaian);

        ImageView yogyakartarumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_yogyakarta.webp")
                .into(yogyakartarumah);

        ImageView yogyakartamakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/yogyakartamakanan.jpg")
                .into(yogyakartamakanan);

        ImageView yogyakartatarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/yogyakartatarian.jpg")
                .into(yogyakartatarian);

        ImageView yogyakartaobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/yogyakartaobjekwisata.jpg")
                .into(yogyakartaobjekwisata);

        ImageView yogyakartaalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/yogyakartaalatmusik.jpeg")
                .into(yogyakartaalatmusik);

        ImageView yogyakartaupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/yogyakartaupacara.webp")
                .into(yogyakartaupacara);

        ImageView yogyakartasenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/yogyakartasenjata.jpg")
                .into(yogyakartasenjata);

        ImageView yogyakartaproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/yogyakartaproduk.jpeg")
                .into(yogyakartaproduk);

        ImageView yogyakartapermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/yogyakartapermainan.jpg")
                .into(yogyakartapermainan);

        ImageView yogyakartaflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/yogyakartaflora.jpg")
                .into(yogyakartaflora);

        ImageView yogyakartafauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/yogyakartafauna.jpg")
                .into(yogyakartafauna);

        yogyakartapakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        yogyakartarumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        yogyakartamakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        yogyakartatarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        yogyakartaobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        yogyakartaalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        yogyakartaupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        yogyakartasenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        yogyakartaproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        yogyakartapermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        yogyakartaflora.setOnClickListener(v -> showPopupSlider(this, flora));
        yogyakartafauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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