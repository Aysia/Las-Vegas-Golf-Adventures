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
        tours.add(new Tour("Jewel Nightclub", "Upscale Fashionable", "ARIA","1-866-359-7757"));
        tours.add(new Tour("The Bank","Upsdale Fashionable","Bellagio","1-888-987-6667"));
        tours.add(new Tour("Light","Upscale Fashionable","Mandalay Bay","1-877-632-7800"));
        tours.add(new Tour("Hakkasan Nighclub","Smart Casual","MGM Grand","1-877-880-0880"));
        tours.add(new Tour("1 Oak","Upscale Chic","The Mirage","1-800-374-9000"));


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