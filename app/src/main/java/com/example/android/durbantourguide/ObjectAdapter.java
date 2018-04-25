package com.example.android.durbantourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ObjectAdapter extends ArrayAdapter<LocationObject> {

    public ObjectAdapter(Context context, ArrayList<LocationObject> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        LocationObject currentObject = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);

        assert currentObject != null;
        nameTextView.setText(currentObject.getObjectNameId());

        TextView addressTextView = listItemView.findViewById(R.id.address_text_view);

        addressTextView.setText(currentObject.getObjectAddressId());

        ImageView imageView = listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(currentObject.getObjectPhotoId());
        if (currentObject.getObjectPhotoId() != 0) {
            imageView.setVisibility(View.VISIBLE);

        }


//        // Find the ImageView in the list_item.xml layout with the ID image.
//        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
//        // Check if an image is provided for this word or not
//        if (currentWord.hasImage()) {
//            // If an image is available, display the provided image based on the resource ID
//            imageView.setImageResource(currentWord.getImageResourceId());
//            // Make sure the view is visible
//            imageView.setVisibility(View.VISIBLE);
//        } else {
//            // Otherwise hide the ImageView (set visibility to GONE)
//            imageView.setVisibility(View.GONE);
//        }

//        // Set the theme color for the list item
//        View textContainer = listItemView.findViewById(R.id.text_container);
//        // Find the color that the resource ID maps to
//        int color = ContextCompat.getColor(getContext(), mColorResourceId);
//        // Set the background color of the text container View
//        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
