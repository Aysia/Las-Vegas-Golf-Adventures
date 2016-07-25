package com.golfadventures.lasvegasgolfadventures;

import android.location.Address;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class NightclubFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        /**
         * Create a list of Tours that include Tour Name, Tour Image, Tour Rates, Tour Address,
         * and Tour Phone Number
         */

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.jewel, R.string.jewel_info,R.string.aria,R.string.jewel_phone));
        tours.add(new Tour(R.string.bank,R.string.bank_info,R.string.bellagio,R.string.bank_phone));
        tours.add(new Tour(R.string.light,R.string.light_info,R.string.mandalay,R.string.light_phone));
        tours.add(new Tour(R.string.hakkasan,R.string.hakkasan_info,R.string.mgm,R.string.hakkasan_phone));
        tours.add(new Tour(R.string.oak,R.string.oak_info,R.string.mirage,R.string.oak_phone));

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