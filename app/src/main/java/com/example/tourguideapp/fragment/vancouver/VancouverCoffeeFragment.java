package com.example.tourguideapp.fragment.vancouver;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.tourguideapp.object.CityCategoryItem;
import com.example.tourguideapp.adapter.CityCategoryItemAdapter;
import com.example.tourguideapp.R;

import java.util.ArrayList;

/**
 * {@link Fragment} subclass.
 */
public class VancouverCoffeeFragment extends Fragment {

    public VancouverCoffeeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of CityCategoryItem's
        ArrayList<CityCategoryItem> categories = new ArrayList<>();
        categories.add(new CityCategoryItem(R.drawable.ic_black_tea, R.string.pcr, R.string.pcr_info, R.string.pcr_url));
        categories.add(new CityCategoryItem(R.drawable.ic_coffee, R.string.starbucks, R.string.starbucks_info, R.string.starbucks_url));
        categories.add(new CityCategoryItem(R.drawable.ic_coffee, R.string.blenz_coffe, R.string.blenz_coffe_info, R.string.blenz_url));
        categories.add(new CityCategoryItem(R.drawable.ic_coffee, R.string.waves_coffee, R.string.waves_coffee_info, R.string.waves_url));
        categories.add(new CityCategoryItem(R.drawable.ic_coffee, R.string.jj_bean, R.string.jj_bean_info, R.string.jj_bean_url));
        categories.add(new CityCategoryItem(R.drawable.ic_coffee, R.string.tim_hortons, R.string.tim_hortons_info, R.string.tim_hortons_url));
        categories.add(new CityCategoryItem(R.drawable.ic_black_tea, R.string.trees_organic_coffee, R.string.trees_organic_coffee_info, R.string.trees_organic_coffee_url));

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