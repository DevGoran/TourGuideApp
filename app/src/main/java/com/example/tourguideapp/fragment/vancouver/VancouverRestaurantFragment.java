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
public class VancouverRestaurantFragment extends Fragment {

    public VancouverRestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of CityCategoryItem's
        ArrayList<CityCategoryItem> categories = new ArrayList<>();
        categories.add(new CityCategoryItem(R.drawable.ic_spaghetti, R.string.frankies_italian_kitchen, R.string.frankies_italian_kitchen_info));
        categories.add(new CityCategoryItem(R.drawable.ic_pizza, R.string.boston_pizza, R.string.boston_pizza_info));
        categories.add(new CityCategoryItem(R.drawable.ic_cutlery, R.string.joey_burrard, R.string.joey_burrard_info));
        categories.add(new CityCategoryItem(R.drawable.ic_spaghetti, R.string.italian_kitchen, R.string.italian_kitchen_info));
        categories.add(new CityCategoryItem(R.drawable.ic_meat, R.string.devils_elbow, R.string.devils_elbow_info));
        categories.add(new CityCategoryItem(R.drawable.ic_taco, R.string.patron_tacos_cantina, R.string.patron_tacos_cantina_info));
        categories.add(new CityCategoryItem(R.drawable.ic_pizza, R.string.ignite_pizza, R.string.ignite_pizza_info));
        categories.add(new CityCategoryItem(R.drawable.ic_cutlery, R.string.vancouver_lookout, R.string.vancouver_lookout_info));
        categories.add(new CityCategoryItem(R.drawable.ic_cutlery, R.string.joey_bentall_one, R.string.joey_bentall_one_info));
        categories.add(new CityCategoryItem(R.drawable.ic_waffle, R.string.le_petit_belge, R.string.le_petit_belge_info));

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