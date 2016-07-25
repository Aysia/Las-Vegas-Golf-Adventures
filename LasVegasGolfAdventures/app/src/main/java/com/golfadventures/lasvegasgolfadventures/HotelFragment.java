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
        tours.add(new Tour(R.string.aria, R.drawable.aria, R.string.hotelrate,
                R.string.aria_address, R.string.bizphone));
        tours.add(new Tour(R.string.bellagio, R.drawable.bellagio1,R.string.hotelrate,
                R.string.bellagio_address, R.string.bizphone));
        tours.add(new Tour(R.string.mandalay, R.drawable.mandalay_bay,R.string.hotelrate,
                R.string.mandalay_address, R.string.bizphone));
        tours.add(new Tour(R.string.mgm, R.drawable.mgm_front,R.string.hotelrate,
                R.string.mgm_address, R.string.bizphone));
        tours.add(new Tour(R.string.mirage, R.drawable.themirage,R.string.hotelrate,
                R.string.mirage_address, R.string.bizphone));

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