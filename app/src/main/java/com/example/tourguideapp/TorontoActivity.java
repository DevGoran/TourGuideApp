package com.example.tourguideapp;

import android.os.Bundle;

import androidx.viewpager2.widget.ViewPager2;

import com.example.tourguideapp.adapter.CategoryFragmentPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class TorontoActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_city);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager2 viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryFragmentPagerAdapter adapter = new CategoryFragmentPagerAdapter(TorontoActivity.this, getSupportFragmentManager(), getLifecycle());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = findViewById(R.id.tabs);

        // Connect the tab layout with the view pager and set the tab names.
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            if(position == 0)
                tab.setText(getString(R.string.toronto));
            else if (position == 1)
                tab.setText(getString(R.string.category_attractions));
            else if (position == 2)
                tab.setText(getString(R.string.category_coffee));
            else if (position == 3)
                tab.setText(getString(R.string.category_restaurants));
            else
                tab.setText(getString(R.string.category_activities));
        }).attach();
    }
}