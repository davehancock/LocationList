package com.djh.android.locationlist.list.item;

import com.google.android.gms.maps.model.LatLng;

import java.util.Date;

/**
 * POJO, Encapsulates a single "ToDoItem".
 */
public class ToDoItem {

    private String description;

    private LatLng location;

    private Date date;

    private boolean done;

    public ToDoItem(String description, LatLng location, Date date) {
        this.description = description;
        this.location = location;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
