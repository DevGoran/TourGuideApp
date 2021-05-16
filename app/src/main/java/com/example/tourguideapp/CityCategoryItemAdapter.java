package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link CityCategoryItemAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link CityCategoryItem} objects.
 */
public class CityCategoryItemAdapter extends ArrayAdapter<CityCategoryItem> {

    /**
     * Create a new {@link CityCategoryItemAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param items   is the list of {@link CityCategoryItem}s to be displayed.
     */
    public CityCategoryItemAdapter(Context context, ArrayList<CityCategoryItem> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the CityCategoryItem object located at this position in the list.
        CityCategoryItem currentCityCategoryItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID text_text_view.
        TextView textTextView = listItemView.findViewById(R.id.text_text_view);
        // Get the text from the currentCityCategoryItem object and set this text on the textTextView TextView.
        textTextView.setText(currentCityCategoryItem.getText());

        // Find the TextView in the list_item.xml layout with the ID location_text_view.
        TextView infoTextView = listItemView.findViewById(R.id.info_text_view);
        // Get the text from the currentCityCategoryItem object and set this text on the infoTextView TextView.
        infoTextView.setText(currentCityCategoryItem.getInfoId());

        // Find the ImageView in the list_item.xml layout with the ID icon.
        ImageView icon = listItemView.findViewById(R.id.icon);
        // Get the icon from the currentCityCategoryItem object and set this image on the icon ImageView.
        icon.setImageResource(currentCityCategoryItem.getIconResourceId());

        // Return the whole list item layout (containing 2 TextView's and 1 ImageView) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
