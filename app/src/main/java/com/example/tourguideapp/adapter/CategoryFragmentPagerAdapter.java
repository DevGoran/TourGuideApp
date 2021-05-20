package com.example.tourguideapp.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tourguideapp.R;
import com.example.tourguideapp.fragment.saskatoon.SaskatoonActivitiesFragment;
import com.example.tourguideapp.fragment.saskatoon.SaskatoonAttractionsFragment;
import com.example.tourguideapp.fragment.saskatoon.SaskatoonCoffeeFragment;
import com.example.tourguideapp.fragment.saskatoon.SaskatoonMainFragment;
import com.example.tourguideapp.fragment.saskatoon.SaskatoonRestaurantFragment;
import com.example.tourguideapp.fragment.vancouver.VancouverMainFragment;
import com.example.tourguideapp.fragment.vancouver.VancouverActivitiesFragment;
import com.example.tourguideapp.fragment.vancouver.VancouverAttractionsFragment;
import com.example.tourguideapp.fragment.vancouver.VancouverCoffeeFragment;
import com.example.tourguideapp.fragment.vancouver.VancouverRestaurantFragment;

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    /**
     * Constructor of the class.
     **/
    public CategoryFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Context of the Fragment.
     **/
    private final Context mContext;

    /**
     * Return the Fragment associated with a specified position.
     **/
    @NonNull
    @Override
    public Fragment getItem(int position) {

        String className = mContext.getClass().getSimpleName();

        switch (className) {
            case "VancouverActivity":
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
            case "SaskatoonActivity":
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
        }
        return null;
    }

    /**
     * Return the number of views available.
     **/
    @Override
    public int getCount() {
        return 5;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string to describe the specified page.
     **/
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.vancouver);
        } else if (position == 1) {
            return mContext.getString(R.string.category_attractions);
        } else if (position == 2) {
            return mContext.getString(R.string.category_coffee);
        } else if (position == 3) {
            return mContext.getString(R.string.category_food);
        } else {
            return mContext.getString(R.string.category_activities);
        }
    }
}

