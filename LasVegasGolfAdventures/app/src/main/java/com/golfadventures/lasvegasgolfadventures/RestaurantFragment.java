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
         * Create a list of Tours that include Tour Name, Tour Image, Tour Rates, Tour Address,
         * and Tour Phone Number
         */

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour("Sage", "American", "ARIA", "1-866-359-7757"));
        tours.add(new Tour("Bardot Brasserie", "French", "ARIA","1-866-359-7757"));
        tours.add(new Tour("Barmasa", "Modern Japanese", "ARIA","1-866-359-7757"));
        tours.add(new Tour("Julian Serrano", "Spanish", "ARIA", "1-866-359-7757"));
        tours.add(new Tour("Blossom","Chinese","ARIA","1-866-359-7757"));
        tours.add(new Tour("Burger Lounge","American","ARIA","1-866-359-7757"));
        tours.add(new Tour("Herringbone","Seafood","ARIA","1-866-359-7757"));
        tours.add(new Tour("Javier\'s","Mexican","ARIA","1-866-359-7757"));
        tours.add(new Tour("Bobby\'s Burger Palace","American","ARIA","1-866-359-7757"));
        tours.add(new Tour("Pinkberry","Yogurt","ARIA","1-866-359-7757"));
        tours.add(new Tour("Harvest By Roy Ellamar","Seasonal","Bellagio","1-888-987-6667"));
        tours.add(new Tour("Yellowtail Japanese Restaurant &amp; Lounge","Japanese","Bellagio","1-888-987-6667"));
        tours.add(new Tour("Fix Restaurant &amp; Bar","American","Bellagio","1-888-987-6667"));
        tours.add(new Tour("Todd English\'s Olives","Mediterrenean","Bellagio","1-888-987-6667"));
        tours.add(new Tour("Jasmine","Chinese","Bellagio","1-888-987-6667"));
        tours.add(new Tour("Prime Steakhouse","Steakhouse","Bellagio","1-888-987-6667"));
        tours.add(new Tour("Le Cirque","French","Bellagio","1-888-987-6667"));
        tours.add(new Tour("Rivea","French &amp; Italian","Delano","1-877-632-5400"));
        tours.add(new Tour("3940 Coffee &amp; Tea","Coffee","Delano","1-877-632-5400"));
        tours.add(new Tour("Rivea","French &amp; Italian","Delano","1-877-632-5400"));
        tours.add(new Tour("Toby Keith\'s I Love This Bar &amp; Grill","American","Harrah\'s","800-214-9110"));
        tours.add(new Tour("Ruth Chris\'s Steakhouse","Steakhouse","Harrah\'s","800-214-9110"));
        tours.add(new Tour("Oyster Bar","Seafood","Harrah\'s","800-214-9110"));
        tours.add(new Tour("Ceres","American","JW Marriott","1-702-869-7381"));
        tours.add(new Tour("Spiedini Restorante", "Italian","JW Marriott","1-702-869-7790"));
        tours.add(new Tour("JC\'s Irish Pub","Irish","JW Marriott","1-702-869-7725"));
        tours.add(new Tour("Shizen Japanese Restaurant","Japanese","JW Marriott","1-702-869-7900"));
        tours.add(new Tour("Tapas","Spanish","JW Marriott","1-702-869-7750"));
        tours.add(new Tour("Charlie Palmer\'s Steak at Four Seasons","Steakhouse","Mandalay Bay","1-877-632-7800"));
        tours.add(new Tour("RX Boiler Room","American","Mandalay Bay","1-877-632-7800"));
        tours.add(new Tour("Stripsteak","Steakhouse","Mandalay Bay","1-877-632-7800"));
        tours.add(new Tour("Fleur","French","Mandalay Bay","1-877-632-7800"));
        tours.add(new Tour("Kumi","Japanese","Mandalay Bay","1-877-632-7800"));
        tours.add(new Tour("Rick Moonen\'s RM Seafood","Seafood","Mandalay Bay","1-877-632-7800"));
        tours.add(new Tour("Hecho En Vegas","Mexican","MGM Grand","1-877-880-0880"));
        tours.add(new Tour("Joel Robuchon","French","MGM Grand","1-877-880-0880"));
        tours.add(new Tour("Fiamma Trattoria &amp; Bar","Italian","MGM Grand","1-877-880-0880"));
        tours.add(new Tour("Crush","American","MGM Grand","1-877-880-0880"));
        tours.add(new Tour("Wolfgang Puck Bar &amp; Grill","American","MGM Grand","1-877-880-0880"));
        tours.add(new Tour("Tom Colicchio\'s Heritage Steak","Steakhouse","The Mirage","1-800-374-9000"));
        tours.add(new Tour("Portofino","Italian","The Mirage","1-800-374-9000"));


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