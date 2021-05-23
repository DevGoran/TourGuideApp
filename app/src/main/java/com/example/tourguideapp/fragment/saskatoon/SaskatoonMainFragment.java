package com.example.tourguideapp.fragment.saskatoon;

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
public class SaskatoonMainFragment extends Fragment {

    public SaskatoonMainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_saskatoon_main, container, false);

        // Get LinearLayout with the ID website_saskatoon_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout saskatoonWebsite = view.findViewById(R.id.website_saskatoon_linear_view);
        saskatoonWebsite.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.saskatoon_website_url)))));

        // Get LinearLayout with the ID twitter_saskatoon_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout saskatoonTwitter = view.findViewById(R.id.twitter_saskatoon_linear_view);
        saskatoonTwitter.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.saskatoon_twitter_url)))));

        // Get LinearLayout with the ID instagram_saskatoon_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout saskatoonInstagram = view.findViewById(R.id.instagram_saskatoon_linear_view);
        saskatoonInstagram.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.saskatoon_instagram_url)))));

        // Get LinearLayout with the ID facebook_saskatoon_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout saskatoonFacebook = view.findViewById(R.id.facebook_saskatoon_linear_view);
        saskatoonFacebook.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.saskatoon_facebook_url)))));

        // Inflate the layout for this fragment.
        return view;
    }
}