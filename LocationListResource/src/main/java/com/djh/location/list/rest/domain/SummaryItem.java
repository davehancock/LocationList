package com.djh.location.list.rest.domain;

import java.util.Date;
import java.util.UUID;

/**
 * @author David Hancock
 */
public class SummaryItem {

    private String id;

    private String description;

    private String location;

    private Date timestamp;

    public SummaryItem() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
