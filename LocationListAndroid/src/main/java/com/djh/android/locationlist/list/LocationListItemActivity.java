package com.djh.android.locationlist.list;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import com.djh.android.locationlist.R;
import com.djh.android.locationlist.list.adapter.ListSectionsPagerAdapter;

/**
 * Activity to enter / amend list items for "Doing" activities.
 */
public class LocationListItemActivity extends FragmentActivity implements ActionBar.TabListener {

    private ViewPager viewPager;

    private static final int TAB_DATE = 0;
    private static final int TAB_DESCRIPTION = 1;
    private static final int TAB_LOCATION = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        // Initialise Action Bar and Tabs
        final ActionBar actionBar = getActionBar();
        initActionBar(actionBar);

        // Initialise ViewPager
        initViewPager(actionBar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.create_list, menu);
        return true;
    }

    /**
     * Initialise Action Bar and Tabs
     */
    public void initActionBar(final ActionBar actionBar) {

        // Hide top bar and icon
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
    }

    public void initViewPager(final ActionBar actionBar) {

        ListSectionsPagerAdapter listSectionsPagerAdapter = new ListSectionsPagerAdapter(getSupportFragmentManager());

        viewPager = (ViewPager) findViewById(R.id.listPager);
        viewPager.setAdapter(listSectionsPagerAdapter);

        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }
        });

        actionBar.addTab(actionBar.newTab().setTabListener(this).setText("Date").setTag(TAB_DATE));
        actionBar.addTab(actionBar.newTab().setTabListener(this).setText("Description").setTag(TAB_DESCRIPTION), true);
        actionBar.addTab(actionBar.newTab().setTabListener(this).setText("Location").setTag(TAB_LOCATION));
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    public void newDescriptionButton(View view) {
        Toast.makeText(view.getContext(), "Description Added", Toast.LENGTH_SHORT).show();
       // System.exit(0);
    }
}
