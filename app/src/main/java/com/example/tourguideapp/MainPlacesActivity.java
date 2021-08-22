package com.example.tourguideapp;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainPlacesActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_main);

        ImageView vancouverBanner = findViewById(R.id.vancouver_banner);
        // The code in this method will be executed when Vancouver is clicked on.
        vancouverBanner.setOnClickListener(view -> {
            // Create a new intent to open the {@link VancouverPlacesActivity}
            Intent vancouverIntent = new Intent(MainPlacesActivity.this, VancouverPlacesActivity.class);

            // Start the new activity
            startActivity(vancouverIntent);
        });

        ImageView calgaryBanner = findViewById(R.id.calgary_banner);
        // The code in this method will be executed when Calgary is clicked on.
        calgaryBanner.setOnClickListener(view -> {
            // Create a new intent to open the {@link CalgaryPlacesActivity}
            Intent calgaryIntent = new Intent(MainPlacesActivity.this, CalgaryPlacesActivity.class);

            // Start the new activity
            startActivity(calgaryIntent);
        });

        ImageView victoriaBanner = findViewById(R.id.victoria_banner);
        // The code in this method will be executed when Victoria is clicked on.
        victoriaBanner.setOnClickListener(view -> {
            // Create a new intent to open the {@link VictoriaPlacesActivity}
            Intent victoriaIntent = new Intent(MainPlacesActivity.this, VictoriaPlacesActivity.class);

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
        Toast.makeText(MainPlacesActivity.this, getString(R.string.address_copied), Toast.LENGTH_SHORT).show();
    }
}