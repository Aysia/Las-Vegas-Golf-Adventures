package com.golfadventures.lasvegasgolfadventures;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * (@link TourAdapter) is an (@link ArrayAdapter) that can provide the layout for each list item
 * based on a data source, which is a list of {@link Tour} objects.
 */
public class TourAdapter extends ArrayAdapter<Tour>  {

    /**
     * Create a new {@link TourAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param tours is the list of {@link Tour} to be displayed.
     */
    public TourAdapter(Context context, ArrayList<Tour> tours) {
        super(context, 0, tours);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Tour} object located at this position in the list
        Tour currentTour = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID tour_name.
        TextView tourNameView = (TextView) listItemView.findViewById(R.id.tour_name);
        // Get the Tour Name from the currenttour object and set this text on
        // the Tour Name View
        tourNameView.setText(currentTour.getTourName());

        // Find the ImageView in the list_item.xml layout with the ID tour_image.
        ImageView tourImageView = (ImageView) listItemView.findViewById(R.id.tour_image);
        // Get the tour image from the currentTour object and set this image on
        // the tour image ImageView.

        if (currentTour.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            tourImageView.setImageResource(currentTour.getImageResourceId());
            // Make sure the view is visible
            tourImageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            tourImageView.setVisibility(View.GONE);
            // Also set the LinearVIew visibility to GONE
            LinearLayout imageLayout = (LinearLayout) listItemView.findViewById(R.id.image_container);
            imageLayout.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID tour_address
        TextView tourAddressView = (TextView) listItemView.findViewById(R.id.tour_address);
        // Get the tour Address from the currentTour object and set this text to that TextVIew
        tourAddressView.setText(currentTour.getTourAddress());

        // Find the TextView in the list_item.xml layout with the ID phone_number
        TextView phoneNumberView = (TextView) listItemView.findViewById(R.id.phone_number);
        // Get the Phone Number from the currentTour object and set this to the phone_number TextView
        //phoneNumberView.setText(currentTour.getPhoneNumber());

        phoneNumberView.setText(currentTour.getPhoneNumber());

        // Find the TextView in the list_item.xml layout with the ID tour_info
        TextView tourInfoView = (TextView) listItemView.findViewById(R.id.tour_info);
        // Get the Tour Info from the currentTour object and set this to the tour_info TextView
        tourInfoView.setText(currentTour.getTourInfo());

        // Return the whole list item layout (containing 4 TextViews and 1 ImageView) to be shown in
        // the ListView.
        return listItemView;
    }
}