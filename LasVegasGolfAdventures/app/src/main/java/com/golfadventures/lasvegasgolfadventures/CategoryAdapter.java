package com.golfadventures.lasvegasgolfadventures;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "Golf Courses", "Hotels", "Restaurants", "Nightclubs" };

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CourseFragment();
        } else if (position == 1) {
            return new HotelFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else {
            return new NightclubFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
    @Override
    public int getCount() {
        return 4;
    }
}