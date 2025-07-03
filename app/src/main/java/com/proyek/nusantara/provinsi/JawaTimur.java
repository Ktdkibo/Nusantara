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

public class JawaTimur extends AppCompatActivity {

    // Data untuk setiap kategori
    private final List<PopupItem> pakaian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20banyuwangi.webp", "Kabupaten Banyuwangi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20blitar.jpg", "Kabupaten Blitar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20bondowoso.JPG", "Kabupaten Bondowoso"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20gresik.jpg", "Kabupaten Gresik"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/pakaian%20madiun.webp", "Kabupaten Madiun")
    );

    private final List<PopupItem> rumah = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20banyuwangi.jpeg", "Kabupaten Banyuwangi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20blitar.webp", "Kabupaten Blitar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20bondowoso.jpeg", "Kabupaten Bondowoso"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20gresik.jpg", "Kabupaten Gresik"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/rumah%20adat%20madiun.jpeg", "Kabupaten Madiun")
    );

    private final List<PopupItem> makanan = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20banyuwangi.jpg", "Kabupaten Banyuwangi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20blitar.jpg", "Kabupaten Blitar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20bondowoso.jpg", "Kabupaten Bondowoso"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20gresik.jpg", "Kabupaten Gresik"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/makanan%20madiun.jpg", "Kabupaten Madiun")
    );

    private final List<PopupItem> tarian = Arrays.asList(
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20banyuwangi.jpg", "Kabupaten Banyuwangi"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20blitar.jpg", "Kabupaten Blitar"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20bondowoso.jpg", "Kabupaten Bondowoso"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20gresik.jpg", "Kabupaten Gresik"),
            new PopupItem("https://web-nusantara.vercel.app/assets/drawable/tarian%20madiun.jpg", "Kabupaten Madiun")
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
        setContentView(R.layout.activity_provinsi_jawa_timur);
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
                .load("https://web-nusantara.vercel.app/assets/drawable/header_jawatimur.webp")
                .into(headerprovinsi);

        ImageView jawatimurpakaian = findViewById(R.id.imgpakaian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatimurpakaian.webp")
                .into(jawatimurpakaian);

        ImageView jawatimurrumah = findViewById(R.id.imgrumah);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/budaya_jawatimur.webp")
                .into(jawatimurrumah);

        ImageView jawatimurmakanan = findViewById(R.id.imgmakanan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatimurmakanan.webp")
                .into(jawatimurmakanan);

        ImageView jawatimurtarian = findViewById(R.id.imgtarian);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatimurtarian.webp")
                .into(jawatimurtarian);

        ImageView jawatimurobjekwisata = findViewById(R.id.imgobjekwisata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatimurobjekwisata.webp")
                .into(jawatimurobjekwisata);

        ImageView jawatimuralatmusik = findViewById(R.id.imgalatmusik);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatimuralatmusik.jpg")
                .into(jawatimuralatmusik);

        ImageView jawatimurupacara = findViewById(R.id.imgupacara);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatimurupacara.webp")
                .into(jawatimurupacara);

        ImageView jawatimursenjata = findViewById(R.id.imgsenjata);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatimursenjata.webp")
                .into(jawatimursenjata);

        ImageView jawatimurproduk = findViewById(R.id.imgproduk);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatimurproduk.webp")
                .into(jawatimurproduk);

        ImageView jawatimurpermainan = findViewById(R.id.imgpermainan);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatimurpermainan.webp")
                .into(jawatimurpermainan);

        ImageView jawatimurflora = findViewById(R.id.imgflora);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatimurflora.webp")
                .into(jawatimurflora);

        ImageView jawatimurfauna = findViewById(R.id.imgfauna);
        Glide.with(this)
                .load("https://web-nusantara.vercel.app/assets/drawable/jawatimurfauna.webp")
                .into(jawatimurfauna);

        jawatimurpakaian.setOnClickListener(v -> showPopupSlider(this, pakaian));
        jawatimurrumah.setOnClickListener(v -> showPopupSlider(this, rumah));
        jawatimurmakanan.setOnClickListener(v -> showPopupSlider(this, makanan));
        jawatimurtarian.setOnClickListener(v -> showPopupSlider(this, tarian));
        jawatimurobjekwisata.setOnClickListener(v -> showPopupSlider(this, objekwisata));
        jawatimuralatmusik.setOnClickListener(v -> showPopupSlider(this, alatmusik));
        jawatimurupacara.setOnClickListener(v -> showPopupSlider(this, upacara));
        jawatimursenjata.setOnClickListener(v -> showPopupSlider(this, senjata));
        jawatimurproduk.setOnClickListener(v -> showPopupSlider(this, produk));
        jawatimurpermainan.setOnClickListener(v -> showPopupSlider(this, permainan));
        jawatimurflora.setOnClickListener(v -> showPopupSlider(this, flora));
        jawatimurfauna.setOnClickListener(v -> showPopupSlider(this, fauna));


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