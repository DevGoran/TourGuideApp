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
public class AttractionsFragment extends Fragment {

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
        categories.add(new CityCategoryItem(R.drawable.ic_building, R.string.robson_square, R.string.robson_square_info));
        categories.add(new CityCategoryItem(R.drawable.ic_street, R.string.granville_st, R.string.granville_st_info));
        categories.add(new CityCategoryItem(R.drawable.ic_street_lamps, R.string.gastown, R.string.gastown_info));
        categories.add(new CityCategoryItem(R.drawable.ic_binoculars, R.string.vancouver_lookout_attraction, R.string.vancouver_lookout_info));
        categories.add(new CityCategoryItem(R.drawable.ic_building, R.string.canada_place, R.string.canada_place_info));
        categories.add(new CityCategoryItem(R.drawable.ic_totem, R.string.totem_poles, R.string.totem_poles_info));
        categories.add(new CityCategoryItem(R.drawable.ic_seawall, R.string.van_seawall, R.string.van_seawall_info));
        categories.add(new CityCategoryItem(R.drawable.ic_street, R.string.robson_st, R.string.robson_st_info));
        categories.add(new CityCategoryItem(R.drawable.ic_stadium, R.string.rogers_arena, R.string.rogers_arena_info));
        categories.add(new CityCategoryItem(R.drawable.ic_building, R.string.marine_building, R.string.marine_building_info));

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