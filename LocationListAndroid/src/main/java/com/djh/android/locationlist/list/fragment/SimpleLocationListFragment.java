package com.djh.android.locationlist.list.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.djh.android.locationlist.R;
import com.djh.android.locationlist.calendar.LocationListCalendarActivity;
import com.djh.android.locationlist.map.LocationListMapActivity;

import java.util.ArrayList;

public class SimpleLocationListFragment extends Fragment implements LocationListFragment {

    public static final String ARG_SECTION_NUMBER = "section_number";

    private ArrayAdapter<String> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_fragment, container, false);

        initListAdapter(rootView);
//
//        Button mapButton = (Button) rootView.findViewById(R.id.mapViewButton);
//        mapButton.setOnClickListener(this);
//
//        Button calendarButton = (Button) rootView.findViewById(R.id.calendarButton);
//        calendarButton.setOnClickListener(this);
//
//        Button descriptionButton = (Button) rootView.findViewById(R.id.newDescriptionButton);
//        descriptionButton.setOnClickListener(this);

        return rootView;
    }

    public void initListAdapter(View rootView) {

        ArrayList<String> toDoItems = new ArrayList<String>();
        toDoItems.add("Description for "+rootView.toString());

        adapter = new ArrayAdapter<String>(getActivity(), R.layout.simple_todo_item_list, toDoItems);
        ListView listView = (ListView) rootView.findViewById(R.id.toDoListView);
        listView.setAdapter(adapter);
    }

    //@Override
    public void onClick(View view) {

        Intent intent = new Intent();

        switch (view.getId()) {

            case R.id.newDescriptionButton:
                //adapter.add("New Description");
                break;

            case R.id.mapViewButton:
                //intent.setClass(getActivity(), LocationListMapActivity.class);
                Toast.makeText(view.getContext(),"Maps Currently not working... WIP",Toast.LENGTH_SHORT).show();
                break;

            case R.id.calendarButton:
                intent.setClass(getActivity(), LocationListCalendarActivity.class);
                startActivity(intent);
                break;
        }
    }

        public void newDescriptionButton(View view) {
            //Toast.makeText(view.getContext(), "Description Added", Toast.LENGTH_SHORT).show();
            adapter.add("New Description");
        }

    }

