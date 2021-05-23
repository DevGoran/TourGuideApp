package com.example.tourguideapp.fragment.stjohns;

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
public class StJohnsMainFragment extends Fragment {

    public StJohnsMainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_stjohns_main, container, false);

        // Get LinearLayout with the ID website_st_johns_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout stJohnsWebsite = view.findViewById(R.id.website_st_johns_linear_view);
        stJohnsWebsite.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.st_johns_website_url)))));

        // Get LinearLayout with the ID twitter_st_johns_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout stJohnsTwitter = view.findViewById(R.id.twitter_st_johns_linear_view);
        stJohnsTwitter.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.st_johns_twitter_url)))));

        // Get LinearLayout with the ID instagram_st_johns_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout stJohnsInstagram = view.findViewById(R.id.instagram_st_johns_linear_view);
        stJohnsInstagram.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.st_johns_instagram_url)))));

        // Get LinearLayout with the ID facebook_st_johns_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout stJohnsFacebook = view.findViewById(R.id.facebook_st_johns_linear_view);
        stJohnsFacebook.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.st_johns_facebook_url)))));

        // Inflate the layout for this fragment.
        return view;
    }
}