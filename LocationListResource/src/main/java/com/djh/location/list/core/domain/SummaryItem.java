package com.djh.location.list.core.domain;

import java.util.Date;
import java.util.UUID;


public class SummaryItem {

    private UUID id;

    private String description;

    private String location;

    private Date timestamp;

    public SummaryItem(){
        this.id = UUID.randomUUID();
    }

    public SummaryItem(String description, String location) {
        this();
        this.description = description;
        this.location = location;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
