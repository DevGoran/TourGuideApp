package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView vancouverBanner = findViewById(R.id.vancouver_banner);
        // The code in this method will be executed when Vancouver is clicked on.
        vancouverBanner.setOnClickListener(view -> {
            // Create a new intent to open the {@link VancouverActivity}
            Intent vancouverIntent = new Intent(MainActivity.this, VancouverActivity.class);

            // Start the new activity
            startActivity(vancouverIntent);
        });

        ImageView torontoBanner = findViewById(R.id.toronto_banner);
        // The code in this method will be executed when Toronto is clicked on.
        torontoBanner.setOnClickListener(view -> {
            // Create a new intent to open the {@link SaskatoonActivity}
            Intent saskatoonIntent = new Intent(MainActivity.this, TorontoActivity.class);

            // Start the new activity
            startActivity(saskatoonIntent);
        });

        ImageView saskatoonBanner = findViewById(R.id.saskatoon_banner);
        // The code in this method will be executed when Saskatoon is clicked on.
        saskatoonBanner.setOnClickListener(view -> {
            // Create a new intent to open the {@link SaskatoonActivity}
            Intent saskatoonIntent = new Intent(MainActivity.this, SaskatoonActivity.class);

            // Start the new activity
            startActivity(saskatoonIntent);
        });

        ImageView stJohnsBanner = findViewById(R.id.st_johns_banner);
        // The code in this method will be executed when St. Johns is clicked on.
        stJohnsBanner.setOnClickListener(view -> {
            // Create a new intent to open the {@link SaskatoonActivity}
            Intent stJohnsIntent = new Intent(MainActivity.this, StJohnsActivity.class);

            // Start the new activity
            startActivity(stJohnsIntent);
        });

        ImageView calgaryBanner = findViewById(R.id.calgary_banner);
        // The code in this method will be executed when Calgary is clicked on.
        calgaryBanner.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Design purpose only", Toast.LENGTH_SHORT).show());

        ImageView victoriaBanner = findViewById(R.id.victoria_banner);
        // The code in this method will be executed when Victoria is clicked on.
        victoriaBanner.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Design purpose only", Toast.LENGTH_SHORT).show());
    }
}