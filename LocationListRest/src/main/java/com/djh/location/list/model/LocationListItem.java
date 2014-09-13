package com.djh.location.list.model;

/**
 * @author David Hancock
 */
public class LocationListItem {

    private Long id;

    private String description;

    private String location;

    private String time;

    public LocationListItem(String description, String location, String time) {
        this.description = description;
        this.location = location;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
