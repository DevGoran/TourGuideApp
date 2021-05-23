package com.example.tourguideapp.fragment.toronto;

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
public class TorontoMainFragment extends Fragment {

    public TorontoMainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_toronto_main, container, false);

        // Get LinearLayout with the ID website_toronto_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout torontoWebsite = view.findViewById(R.id.website_toronto_linear_view);
        torontoWebsite.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.toronto_website_url)))));

        // Get LinearLayout with the ID twitter_toronto_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout torontoTwitter = view.findViewById(R.id.twitter_toronto_linear_view);
        torontoTwitter.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.toronto_twitter_url)))));

        // Get LinearLayout with the ID instagram_toronto_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout torontoInstagram = view.findViewById(R.id.instagram_toronto_linear_view);
        torontoInstagram.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.toronto_instagram_url)))));

        // Get LinearLayout with the ID facebook_toronto_linear_view and set an OnClickListener
        // in order to open a website by using an Intent.
        LinearLayout torontoFacebook = view.findViewById(R.id.facebook_toronto_linear_view);
        torontoFacebook.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW,
                Uri.parse(getString(R.string.toronto_facebook_url)))));

        // Inflate the layout for this fragment.
        return view;
    }
}