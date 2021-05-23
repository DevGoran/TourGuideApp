package com.example.tourguideapp.fragment.vancouver;

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
public class VancouverMainFragment extends Fragment {

    public VancouverMainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_vancouver_main, container, false);

        // Get LinearLayout with the ID website_vancouver_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout vancouverWebsite = view.findViewById(R.id.website_vancouver_linear_view);
        vancouverWebsite.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.vancouver_website_url)))));

        // Get LinearLayout with the ID twitter_vancouver_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout vancouverTwitter = view.findViewById(R.id.twitter_vancouver_linear_view);
        vancouverTwitter.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.vancouver_twitter_url)))));

        // Get LinearLayout with the ID instagram_vancouver_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout vancouverInstagram = view.findViewById(R.id.instagram_vancouver_linear_view);
        vancouverInstagram.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.vancouver_instagram_url)))));

        // Get LinearLayout with the ID facebook_vancouver_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout vancouverFacebook = view.findViewById(R.id.facebook_vancouver_linear_view);
        vancouverFacebook.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.vancouver_facebook_url)))));

        // Inflate the layout for this fragment.
        return view;
    }
}