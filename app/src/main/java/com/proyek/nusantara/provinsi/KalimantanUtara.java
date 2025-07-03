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

public class KalimantanUtara extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bulungan.jpg", "Kabupaten Bulungan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20malinau.webp", "Kabupaten Malinau"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20nunukan.jpg", "Kabupaten Nunukan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20tana%20tidung.jpeg", "Kabupaten Tana Tidung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20tarakan.jpeg", "Kabupaten Tarakan")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20bulungan.jpg", "Kabupaten Bulungan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20malinau.jpg", "Kabupaten Malinau"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20nunukan.jpg", "Kabupaten Nunukan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20tana%20tidung.jpg", "Kabupaten Tana Tidung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20tarakan.jpg", "Kabupaten Tarakan")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bulungan.jpg", "Kabupaten Bulungan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20malinau.jpg", "Kabupaten Malinau"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20nunukan.jpg", "Kabupaten Nunukan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20tana%20tidung.jpg", "Kabupaten Tana Tidung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20tarakan.jpg", "Kabupaten Tarakan")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20bulungan.jpg", "Kabupaten Bulungan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20malinau.jpg", "Kabupaten Malinau"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20nunukan.jpg", "Kabupaten Nunukan"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20tana%20tidung.jpg", "Kabupaten Tana Tidung"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20tarakan.jpg", "Kabupaten Tarakan")
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
        setContentView(R.layout.activity_provinsi_kalimantan_utara);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_kalimantanutara.webp")
                .into(headerprovinsi);

        ImageView kalimantanutarapakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanutarapakaian.webp")
                .into(kalimantanutarapakaian);

        ImageView kalimantanutararumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_kalimantanutara.webp")
                .into(kalimantanutararumah);

        ImageView kalimantanutaramakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanutaramakanan.jpg")
                .into(kalimantanutaramakanan);

        ImageView kalimantanutaratarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanutaratarian.jpg")
                .into(kalimantanutaratarian);

        ImageView kalimantanutaraobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanutaraobjekwisata.jpg")
                .into(kalimantanutaraobjekwisata);

        ImageView kalimantanutaraalatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanutaraalatmusik.jpg")
                .into(kalimantanutaraalatmusik);

        ImageView kalimantanutaraupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanutaraupacara.jpg")
                .into(kalimantanutaraupacara);

        ImageView kalimantanutarasenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanutarasenjata.jpg")
                .into(kalimantanutarasenjata);

        ImageView kalimantanutaraproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanutaraproduk.jpeg")
                .into(kalimantanutaraproduk);

        ImageView kalimantanutarapermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanutarapermainan.jpg")
                .into(kalimantanutarapermainan);

        ImageView kalimantanutaraflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanutaraflora.jpg")
                .into(kalimantanutaraflora);

        ImageView kalimantanutarafauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/kalimantanutarafauna.png")
                .into(kalimantanutarafauna);

        kalimantanutarapakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        kalimantanutararumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        kalimantanutaramakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        kalimantanutaratarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        kalimantanutaraobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        kalimantanutaraalatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        kalimantanutaraupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        kalimantanutarasenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        kalimantanutaraproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        kalimantanutarapermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        kalimantanutaraflora.setOnClickListener(v -> showPopupSlider(this, flora));
        kalimantanutarafauna.setOnClickListener(v -> showPopupSlider(this, fauna));

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