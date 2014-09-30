package com.djh.android.locationlist.list.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.djh.android.locationlist.list.fragment.SimpleLocationListFragment;

import java.util.Locale;

public class ListSectionsPagerAdapter extends FragmentPagerAdapter {

    public ListSectionsPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // getItem is called to instantiate the fragment for the given page.
    // Return a DummySectionFragment (defined as a static inner class
    // below) with the page number as its lone argument.
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = new SimpleLocationListFragment();
        Bundle args = new Bundle();
        args.putInt(SimpleLocationListFragment.ARG_SECTION_NUMBER, position + 1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return "Section 1";
            case 1:
                return "Section 2";
            case 2:
                return "Section 3";
        }
        return null;
    }
}