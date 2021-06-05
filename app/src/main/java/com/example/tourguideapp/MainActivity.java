package com.example.tourguideapp;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Turn off night mode for app.
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
            // Create a new intent to open the {@link TorontoActivity}
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
        calgaryBanner.setOnClickListener(view -> {
            // Create a new intent to open the {@link CalgaryActivity}
            Intent calgaryIntent = new Intent(MainActivity.this, CalgaryActivity.class);

            // Start the new activity
            startActivity(calgaryIntent);
        });

        ImageView victoriaBanner = findViewById(R.id.victoria_banner);
        // The code in this method will be executed when Victoria is clicked on.
        victoriaBanner.setOnClickListener(view -> {
            // Create a new intent to open the {@link VictoriaActivity}
            Intent victoriaIntent = new Intent(MainActivity.this, VictoriaActivity.class);

            // Start the new activity
            startActivity(victoriaIntent);
        });

        // Copies the Ethereum address into clipboard and shows a message to the user for information.
        ImageView ethereumDonation = findViewById(R.id.ethereum);
        ethereumDonation.setOnClickListener(view -> copyAddress("Ethereum wallet address", getString(R.string.eth_address)));

        // Copies the Bitcoin address into clipboard and shows a message to the user for information.
        ImageView bitcoinDonation = findViewById(R.id.bitcoin);
        bitcoinDonation.setOnClickListener(view -> copyAddress("Bitcoin wallet address", getString(R.string.btc_address)));

        // Copies the Monero address into clipboard and shows a message to the user for information.
        ImageView moneroDonation = findViewById(R.id.monero);
        moneroDonation.setOnClickListener(view -> copyAddress("Monero wallet address", getString(R.string.xmr_address)));

        // Copies the Litecoin address into clipboard and shows a message to the user for information.
        ImageView litecoinDonation = findViewById(R.id.litecoin);
        litecoinDonation.setOnClickListener(view -> copyAddress("Litecoin wallet address", getString(R.string.ltc_address)));

        // Copies the Stellar address into clipboard and shows a message to the user for information.
        ImageView stellarDonation = findViewById(R.id.stellar);
        stellarDonation.setOnClickListener(view -> copyAddress("Stellar wallet address", getString(R.string.xlm_address)));
    }

    private void copyAddress(String whichWallet, String walletAddress) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(whichWallet, walletAddress);
        clipboard.setPrimaryClip(clip);
        Toast.makeText(MainActivity.this, getString(R.string.address_copied), Toast.LENGTH_SHORT).show();
    }
}

// TODO 1: Create new nodpi banners and compress them.
// TODO 2: Add donation addresses to strings.
// TODO 3: Add current time to cities.
// TODO 4: Add weather to cities.