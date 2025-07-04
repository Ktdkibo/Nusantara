package com.proyek.nusantara.Menu;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;
import com.proyek.nusantara.Profil.ProfileActivity;
import com.proyek.nusantara.R;
import com.proyek.nusantara.MasukAplikasi.SessionManager;
import com.proyek.nusantara.Postingan.Util;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SejarahFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SejarahFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SejarahFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SejarahFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SejarahFragment newInstance(String param1, String param2) {
        SejarahFragment fragment = new SejarahFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sejarah, container, false);

        ImageView imgProfile = view.findViewById(R.id.imgProfile);
        imgProfile.setOnClickListener(v -> {
            Log.d("BerandaFragment", "Profile diklik");
            Intent intent = new Intent(getActivity(), ProfileActivity.class);
            startActivity(intent);
        });

        SessionManager session = new SessionManager(requireContext());

        FirebaseFirestore.getInstance()
                .collection("users")
                .document(session.getUserId())
                .get()
                .addOnSuccessListener(documentSnapshot -> {
                    if (documentSnapshot.exists()) {
                        String base64Image = documentSnapshot.getString("profileImage");

                        if (base64Image != null && !base64Image.isEmpty()) {
                            Bitmap bitmap = Util.base64ToBitmap(base64Image);
                            imgProfile.setImageBitmap(bitmap);
                        } else {
                            imgProfile.setImageResource(R.drawable.ic_launcher_foreground);
                        }
                    }
                })
                .addOnFailureListener(e -> {
                    Toast.makeText(requireContext(), "Gagal memuat data: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                });

        return view;
    }
}