package com.golfadventures.lasvegasgolfadventures;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class CourseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        /**
         * Create a list of Tours that include Tour Name, Tour Image, Tour Rates, Tour Address,
         * and Tour Phone Number
         */

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.course0, R.drawable.badlands, R.string.rates0,
                R.string.address0, R.string.bizphone));
        tours.add(new Tour(R.string.course1, R.drawable.cascata_2, R.string.rates1,
                R.string.address1, R.string.bizphone));
        tours.add(new Tour(R.string.course2, R.drawable.dragon_ridge, R.string.rates2,
                R.string.address2, R.string.bizphone));
        tours.add(new Tour(R.string.course3, R.drawable.paiute_wolf, R.string.rates3,
                R.string.address3, R.string.bizphone));
        tours.add(new Tour(R.string.course4, R.drawable.paiute_snow, R.string.rates4,
                R.string.address4, R.string.bizphone));
        tours.add(new Tour(R.string.course5, R.drawable.paiute_sun, R.string.rates5,
                R.string.address5, R.string.bizphone));
        tours.add(new Tour(R.string.course6, R.drawable.reflection_bay, R.string.rates6,
                R.string.address6, R.string.bizphone));
        tours.add(new Tour(R.string.course7, R.drawable.revere_concord, R.string.rates7,
                R.string.address7, R.string.bizphone));
        tours.add(new Tour(R.string.course8, R.drawable.rio_secco, R.string.rates8,
                R.string.address8, R.string.bizphone));
        tours.add(new Tour(R.string.course9, R.drawable.shadow_creek,R.string.rates9,
                R.string.address9, R.string.bizphone));
        tours.add(new Tour(R.string.course10, R.drawable.tpc,R.string.rates10,
                R.string.address10, R.string.bizphone));

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