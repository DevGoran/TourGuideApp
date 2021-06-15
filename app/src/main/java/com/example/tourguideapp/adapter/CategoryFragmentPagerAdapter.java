package com.example.tourguideapp.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tourguideapp.fragment.calgary.CalgaryActivitiesFragment;
import com.example.tourguideapp.fragment.calgary.CalgaryAttractionsFragment;
import com.example.tourguideapp.fragment.calgary.CalgaryCoffeeFragment;
import com.example.tourguideapp.fragment.calgary.CalgaryMainFragment;
import com.example.tourguideapp.fragment.calgary.CalgaryRestaurantFragment;
import com.example.tourguideapp.fragment.saskatoon.SaskatoonActivitiesFragment;
import com.example.tourguideapp.fragment.saskatoon.SaskatoonAttractionsFragment;
import com.example.tourguideapp.fragment.saskatoon.SaskatoonCoffeeFragment;
import com.example.tourguideapp.fragment.saskatoon.SaskatoonMainFragment;
import com.example.tourguideapp.fragment.saskatoon.SaskatoonRestaurantFragment;
import com.example.tourguideapp.fragment.stjohns.StJohnsActivitiesFragment;
import com.example.tourguideapp.fragment.stjohns.StJohnsAttractionsFragment;
import com.example.tourguideapp.fragment.stjohns.StJohnsCoffeeFragment;
import com.example.tourguideapp.fragment.stjohns.StJohnsMainFragment;
import com.example.tourguideapp.fragment.stjohns.StJohnsRestaurantFragment;
import com.example.tourguideapp.fragment.toronto.TorontoActivitiesFragment;
import com.example.tourguideapp.fragment.toronto.TorontoAttractionsFragment;
import com.example.tourguideapp.fragment.toronto.TorontoCoffeeFragment;
import com.example.tourguideapp.fragment.toronto.TorontoMainFragment;
import com.example.tourguideapp.fragment.toronto.TorontoRestaurantFragment;
import com.example.tourguideapp.fragment.vancouver.VancouverActivitiesFragment;
import com.example.tourguideapp.fragment.vancouver.VancouverAttractionsFragment;
import com.example.tourguideapp.fragment.vancouver.VancouverCoffeeFragment;
import com.example.tourguideapp.fragment.vancouver.VancouverMainFragment;
import com.example.tourguideapp.fragment.vancouver.VancouverRestaurantFragment;
import com.example.tourguideapp.fragment.victoria.VictoriaActivitiesFragment;
import com.example.tourguideapp.fragment.victoria.VictoriaAttractionsFragment;
import com.example.tourguideapp.fragment.victoria.VictoriaCoffeeFragment;
import com.example.tourguideapp.fragment.victoria.VictoriaMainFragment;
import com.example.tourguideapp.fragment.victoria.VictoriaRestaurantFragment;

public class CategoryFragmentPagerAdapter extends FragmentStateAdapter {

    /**
     * Context of the Fragment.
     **/
    private final Context mContext;

    /**
     * Constructor of the class.
     **/
    public CategoryFragmentPagerAdapter(Context context, FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        mContext = context;
    }

    @SuppressWarnings("ConstantConditions")
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        String className = mContext.getClass().getSimpleName();

        // Check which Activity is using the ViewHolder and return the appropriate Fragments.
        switch (className) {
            case "VancouverPlacesActivity":
                if (position == 0) {
                    return new VancouverMainFragment();
                } else if (position == 1) {
                    return new VancouverAttractionsFragment();
                } else if (position == 2) {
                    return new VancouverCoffeeFragment();
                } else if (position == 3) {
                    return new VancouverRestaurantFragment();
                } else {
                    return new VancouverActivitiesFragment();
                }
            case "SaskatoonPlacesActivity":
                if (position == 0) {
                    return new SaskatoonMainFragment();
                } else if (position == 1) {
                    return new SaskatoonAttractionsFragment();
                } else if (position == 2) {
                    return new SaskatoonCoffeeFragment();
                } else if (position == 3) {
                    return new SaskatoonRestaurantFragment();
                } else {
                    return new SaskatoonActivitiesFragment();
                }
            case "TorontoPlacesActivity":
                if (position == 0) {
                    return new TorontoMainFragment();
                } else if (position == 1) {
                    return new TorontoAttractionsFragment();
                } else if (position == 2) {
                    return new TorontoCoffeeFragment();
                } else if (position == 3) {
                    return new TorontoRestaurantFragment();
                } else {
                    return new TorontoActivitiesFragment();
                }
            case "StJohnsPlacesActivity":
                if (position == 0) {
                    return new StJohnsMainFragment();
                } else if (position == 1) {
                    return new StJohnsAttractionsFragment();
                } else if (position == 2) {
                    return new StJohnsCoffeeFragment();
                } else if (position == 3) {
                    return new StJohnsRestaurantFragment();
                } else {
                    return new StJohnsActivitiesFragment();
                }
            case "CalgaryPlacesActivity":
                if (position == 0) {
                    return new CalgaryMainFragment();
                } else if (position == 1) {
                    return new CalgaryAttractionsFragment();
                } else if (position == 2) {
                    return new CalgaryCoffeeFragment();
                } else if (position == 3) {
                    return new CalgaryRestaurantFragment();
                } else {
                    return new CalgaryActivitiesFragment();
                }
            case "VictoriaPlacesActivity":
                if (position == 0) {
                    return new VictoriaMainFragment();
                } else if (position == 1) {
                    return new VictoriaAttractionsFragment();
                } else if (position == 2) {
                    return new VictoriaCoffeeFragment();
                } else if (position == 3) {
                    return new VictoriaRestaurantFragment();
                } else {
                    return new VictoriaActivitiesFragment();
                }
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}

