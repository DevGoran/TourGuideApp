package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Turn off night mode for app.
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView tripsImageView = findViewById(R.id.trips_text_view);
        tripsImageView.setOnClickListener(view -> {
            // Create a new intent to open the {@link MainTripsActivity}
            Intent tripsIntent = new Intent(MainActivity.this, MainTripsActivity.class);

            // Start the new activity
            startActivity(tripsIntent);
        });

        ImageView placesImageView = findViewById(R.id.places_text_view);
        placesImageView.setOnClickListener(view -> {
            // Create a new intent to open the {@link MainPlacesActivity}
            Intent citiesIntent = new Intent(MainActivity.this, MainPlacesActivity.class);

            // Start the new activity
            startActivity(citiesIntent);
        });
    }
}