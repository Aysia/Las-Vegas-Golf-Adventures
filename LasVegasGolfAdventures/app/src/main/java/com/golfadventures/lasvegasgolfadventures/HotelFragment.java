package com.golfadventures.lasvegasgolfadventures;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        /**
         * Create a list of Tours that include Tour Name, Tour Image, Tour Rates, Tour Address,
         * and Tour Phone Number
         */

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("ARIA Las Vegas", R.drawable.aria, "Up to 50% Off",
                "3730 Las Vegas Blvd Las Vegas, NV 89158", "1-800-841-6570"));
        tours.add(new Tour("Bellagio Las Vegas", R.drawable.bellagio1, "Up to 50% Off",
                "3600 Las Vegas Blvd S Las Vegas, Nevada 89109", "1-800-841-6570"));
        tours.add(new Tour("Delano Las Vegas", R.drawable.delano, "Up to 50% Off",
                "3940 S Las Vegas Blvd Las Vegas, Nevada 89119", "1-800-841-6570"));
        tours.add(new Tour("Harrah\'s Las Vegas", R.drawable.harrahs_main, "Up to 50% Off",
                "3475 Las Vegas Blvd S. Las Vegas, Nevada 89109", "1-800-841-6570"));
        tours.add(new Tour("JW Marriott", R.drawable.jwmarriott, "Up to 50% Off",
                "221 N Rampart Blvd. Las Vegas, Nevada 89145", "1-800-841-6570"));
        tours.add(new Tour("Mandalay Bay", R.drawable.mandalay_bay, "Up to 50% Off",
                "3950 Las Vegas Blvd S Las Vegas, Nevada 89119", "1-800-841-6570"));
        tours.add(new Tour("MGM Grand", R.drawable.mgm_front, "Up to 50% Off",
                "3799 Las Vegas Blvd S. Las Vegas, Nevada 89109", "1-800-841-6570"));
        tours.add(new Tour("Mirage Las Vegas", R.drawable.themirage, "Up to 50% Off",
                "3400 Las Vegas Blvd S. Las Vegas, Nevada 89109", "1-800-841-6570"));
        tours.add(new Tour("Westin Lake Las Vegas", R.drawable.westin_exterior, "Up to 50% Off",
                "101 Montelago Blvd. Las Vegas, Nevada 89011", "1-800-841-6570"));

        // Create an {@link TourAdapter}, whose data source is a list of {@link Tour}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}