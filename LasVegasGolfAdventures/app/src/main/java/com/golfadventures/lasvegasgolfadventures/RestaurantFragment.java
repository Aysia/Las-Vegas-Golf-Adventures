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

public class RestaurantFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        /**
         * Create a list of Tours that include Tour Name, Tour Info, Tour Location
         * and Tour Phone Number
         */

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.sage, R.string.sage_type, R.string.aria, R.string.sage_phone));
        tours.add(new Tour(R.string.jserrano, R.string.jserrano_type, R.string.aria, R.string.jserrano_phone));
        tours.add(new Tour(R.string.bobbys,R.string.bobbys_type,R.string.aria,R.string.bobbys_phone));
        tours.add(new Tour(R.string.pinkb,R.string.pinkb_type,R.string.aria,R.string.pinkb_phone));
        tours.add(new Tour(R.string.yellowtail,R.string.yellowtail_type,R.string.bellagio,R.string.yellowtail_phone));
        tours.add(new Tour(R.string.jasmin,R.string.jasmin_type,R.string.bellagio,R.string.jasmin_phone));
        tours.add(new Tour(R.string.prime,R.string.prime_type,R.string.bellagio,R.string.prime_phone));
        tours.add(new Tour(R.string.stripsteak,R.string.stripsteak_type,R.string.mandalay,R.string.stripsteak_phone));
        tours.add(new Tour(R.string.fleur,R.string.fleur_type,R.string.mandalay,R.string.fleur_phone));
        tours.add(new Tour(R.string.kumi,R.string.kumi_type,R.string.mandalay,R.string.kumi_phone));
        tours.add(new Tour(R.string.wolfgang,R.string.wolfgang_type,R.string.mgm,R.string.wolfgang_phone));

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