package com.example.tourguideapp.fragment.toronto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.tourguideapp.R;
import com.example.tourguideapp.adapter.CityCategoryItemAdapter;
import com.example.tourguideapp.object.CityCategoryItem;

import java.util.ArrayList;

/**
 * {@link Fragment} subclass.
 */
public class TorontoAttractionsFragment extends Fragment {

    public TorontoAttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // TODO: Add correct strings.
        // Create a list of CityCategoryItem's
        ArrayList<CityCategoryItem> categories = new ArrayList<>();
        categories.add(new CityCategoryItem(R.drawable.ic__09_climbing, R.string.activities_placeholder_one, R.string.activities_placeholder_one_info));
        categories.add(new CityCategoryItem(R.drawable.ic__16_skiing_1, R.string.activities_placeholder_two, R.string.activities_placeholder_two_info));
        categories.add(new CityCategoryItem(R.drawable.ic__17_bike_1, R.string.activities_placeholder_three, R.string.activities_placeholder_three_info));
        categories.add(new CityCategoryItem(R.drawable.ic__20_snowboard_1, R.string.activities_placeholder_four, R.string.activities_placeholder_four_info));
        categories.add(new CityCategoryItem(R.drawable.ic__57_bungee_jumping, R.string.activities_placeholder_five, R.string.activities_placeholder_five_info));
        categories.add(new CityCategoryItem(R.drawable.ic__31_kayak, R.string.activities_placeholder_six, R.string.activities_placeholder_six_info));
        categories.add(new CityCategoryItem(R.drawable.ic__32_kitesurf, R.string.activities_placeholder_seven, R.string.activities_placeholder_seven_info));
        categories.add(new CityCategoryItem(R.drawable.ic__34_ice_skating, R.string.activities_placeholder_eight, R.string.activities_placeholder_eight_info));
        categories.add(new CityCategoryItem(R.drawable.ic__37_hiking_1, R.string.activities_placeholder_nine, R.string.activities_placeholder_nine_info));
        categories.add(new CityCategoryItem(R.drawable.ic__38_skydiving, R.string.activities_placeholder_ten, R.string.activities_placeholder_ten_info));

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
        listView.setOnItemClickListener((parent, view, position, id) -> Toast.makeText(getActivity(), getString(R.string.toast_message_fragments), Toast.LENGTH_SHORT).show());

        // Inflate the layout for this fragment.
        return rootView;
    }
}