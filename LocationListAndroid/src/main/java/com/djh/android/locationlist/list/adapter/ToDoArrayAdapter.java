package com.djh.android.locationlist.list.adapter;


import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.djh.android.locationlist.list.item.ToDoItem;

import java.util.ArrayList;
import java.util.List;

public class ToDoArrayAdapter extends ArrayAdapter {

    private ArrayList<TextView> toDoItems;

    public ToDoArrayAdapter(Context context, int textViewResourceId, List toDoItems) {
        super(context, textViewResourceId, toDoItems);

//        this.toDoItems = new ArrayList<ToDoItem>();
//        this.toDoItems.addAll(toDoItems);

        this.toDoItems = new ArrayList<TextView>();
        this.toDoItems.addAll(toDoItems);
    }

    @Override
    public View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {

        return null;
    }

}
