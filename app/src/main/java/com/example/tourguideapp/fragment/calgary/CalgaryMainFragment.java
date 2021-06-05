package com.example.tourguideapp.fragment.calgary;

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
public class CalgaryMainFragment extends Fragment {

    public CalgaryMainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_calgary_main, container, false);

        // Get LinearLayout with the ID website_calgary_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout calgaryWebsite = view.findViewById(R.id.website_calgary_linear_view);
        calgaryWebsite.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.calgary_website_url)))));

        // Get LinearLayout with the ID twitter_calgary_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout calgaryTwitter = view.findViewById(R.id.twitter_calgary_linear_view);
        calgaryTwitter.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.calgary_twitter_url)))));

        // Get LinearLayout with the ID instagram_calgary_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout calgaryInstagram = view.findViewById(R.id.instagram_calgary_linear_view);
        calgaryInstagram.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.calgary_instagram_url)))));

        // Get LinearLayout with the ID facebook_calgary_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout calgaryFacebook = view.findViewById(R.id.facebook_calgary_linear_view);
        calgaryFacebook.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.calgary_facebook_url)))));

        // Inflate the layout for this fragment.
        return view;
    }
}