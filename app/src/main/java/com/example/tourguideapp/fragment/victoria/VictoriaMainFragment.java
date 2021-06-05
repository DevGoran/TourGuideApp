package com.example.tourguideapp.fragment.victoria;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.example.tourguideapp.R;

/**
 * A {@link Fragment} subclass.
 */
public class VictoriaMainFragment extends Fragment {

    public VictoriaMainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_victoria_main, container, false);

        // Get LinearLayout with the ID website_victoria_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout victoriaWebsite = view.findViewById(R.id.website_victoria_linear_view);
        victoriaWebsite.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.victoria_website_url)))));

        // Get LinearLayout with the ID twitter_victoria_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout victoriaTwitter = view.findViewById(R.id.twitter_victoria_linear_view);
        victoriaTwitter.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.victoria_twitter_url)))));

        // Get LinearLayout with the ID instagram_victoria_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout victoriaInstagram = view.findViewById(R.id.instagram_victoria_linear_view);
        victoriaInstagram.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.victoria_instagram_url)))));

        // Get LinearLayout with the ID facebook_victoria_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout victoriaFacebook = view.findViewById(R.id.facebook_victoria_linear_view);
        victoriaFacebook.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.victoria_facebook_url)))));

        // Inflate the layout for this fragment.
        return view;
    }
}