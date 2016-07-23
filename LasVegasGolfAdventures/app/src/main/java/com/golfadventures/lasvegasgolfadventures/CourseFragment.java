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
        tours.add(new Tour("Badlands Golf Club", R.drawable.badlands, "$95-$119",
                "9119 Alta Drive Las Vegas, Nevada 89145", "1-800-841-6570"));
        tours.add(new Tour("Cascata", R.drawable.cascata_2, "$245-$395",
                "One Cascata Drive Boulder City, Nevada 89005", "1-800-841-6570"));
        tours.add(new Tour("Dragon Ridge Country Club", R.drawable.dragon_ridge, "$275",
                "552 South Stephanie Street Henderson, Nevada 89012", "1-800-841-6570"));
        tours.add(new Tour("Paiute Golf Resort WOLF", R.drawable.paiute_wolf, "$109-$179",
                "10325 Nu-Wav Kaiv Boulevard Las Vegas, Nevada 89124", "1-800-841-6570"));
        tours.add(new Tour("Paiute Golf Resort Snow Mountain", R.drawable.paiute_snow, "$99-$159",
                "10325 Nu-Wav Kaiv Boulevard Las Vegas, Nevada 89124", "1-800-841-6570"));
        tours.add(new Tour("Paiute Golf Resort Sun Mountain", R.drawable.paiute_sun, "$99-$159",
                "10325 Nu-Wav Kaiv Boulevard Las Vegas, Nevada 89124", "1-800-841-6570"));
        tours.add(new Tour("Reflection Bay Golf Club", R.drawable.reflection_bay, "$190-$225",
                "1600 Lake Las Vegas Pkwy Henderson, Nevada 89011", "1-800-841-6570"));
        tours.add(new Tour("Revere Golf Club", R.drawable.revere_concord, "$129",
                "2600 Hampton Road Henderson, Nevada 89052", "1-800-841-6570"));
        tours.add(new Tour("Rio Secco Golf Club", R.drawable.rio_secco, "$109-#219",
                "2851 Grand Hills Drive Henderson, Nevada 89052", "1-800-841-6570"));
        tours.add(new Tour("Shadow Creek", R.drawable.shadow_creek, "$500",
                "5400 Losee Road North Las Vegas, NV 89081", "1-800-841-6570"));
        tours.add(new Tour("TPC Las Vegas", R.drawable.tpc, "$190-$250",
                "9851 Canyon Run Drive Las Vegas, Nevada 89144", "1-800-841-6570"));

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