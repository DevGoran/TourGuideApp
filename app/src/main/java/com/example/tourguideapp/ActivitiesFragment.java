package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * {@link Fragment} subclass.
 */
public class ActivitiesFragment extends Fragment {

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of CityCategoryItem's
        ArrayList<CityCategoryItem> categories = new ArrayList<>();
        categories.add(new CityCategoryItem(R.drawable.ic__09_climbing, R.string.climbing, R.string.climbing_info));
        categories.add(new CityCategoryItem(R.drawable.ic__16_skiing_1, R.string.skiing, R.string.skiing_info));
        categories.add(new CityCategoryItem(R.drawable.ic__17_bike_1, R.string.cycling, R.string.cycling_info));
        categories.add(new CityCategoryItem(R.drawable.ic__20_snowboard_1, R.string.snowboarding, R.string.snowboarding_info));
        categories.add(new CityCategoryItem(R.drawable.ic__57_bungee_jumping, R.string.bungee_jumping, R.string.bungee_jumping_info));
        categories.add(new CityCategoryItem(R.drawable.ic__31_kayak, R.string.kayaking, R.string.kayaking_info));
        categories.add(new CityCategoryItem(R.drawable.ic__32_kitesurf, R.string.kitesurfing, R.string.kitesurfing_info));
        categories.add(new CityCategoryItem(R.drawable.ic__34_ice_skating, R.string.ice_skating, R.string.ice_skating_info));
        categories.add(new CityCategoryItem(R.drawable.ic__37_hiking_1, R.string.hiking, R.string.hiking_info));
        categories.add(new CityCategoryItem(R.drawable.ic__38_skydiving, R.string.skydiving, R.string.skydiving_info));

        // Create an {@link CityCategoryItemAdapter}, whose data source is a list of {@link CityCategoryItem}s. The
        // adapter knows how to create list items for each item in the list.
        CityCategoryItemAdapter adapter = new CityCategoryItemAdapter(getActivity(), categories);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CityCategoryItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link CityCategoryItem} in the list.
        listView.setAdapter(adapter);

        // onItemClickListener with "dummy" code inside -> "Imagine this would open a website or another activity! :)"
        listView.setOnItemClickListener((parent, view, position, id) -> Toast.makeText(getActivity(), "Imagine this would open a website or another activity! :)", Toast.LENGTH_SHORT).show());

        // Inflate the layout for this fragment.
        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}