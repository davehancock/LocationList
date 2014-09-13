package com.djh.android.locationlist.calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.djh.android.locationlist.R;

public class LocationListCalendarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_activity);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calendar, menu);
        return true;
    }
    
}
