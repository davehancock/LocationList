package com.djh.location.list.rest.domain;

import com.djh.location.list.core.domain.SummaryItem;

import java.util.Date;
import java.util.UUID;


public class SummaryItemRest {

    private String id;

    private String description;

    private String location;

    private Date timestamp;

    public SummaryItemRest() {
    }

    public SummaryItemRest fromSummaryItem(SummaryItem summaryItem) {
        this.id = summaryItem.getId().toString();
        this.description = summaryItem.getDescription();
        this.location = summaryItem.getLocation();
        this.timestamp = summaryItem.getTimestamp();
        return this;
    }

    public SummaryItem toSummaryItem() {
        SummaryItem summaryItem = new SummaryItem();
        summaryItem.setDescription(this.getDescription());
        summaryItem.setLocation(this.getLocation());

        if (this.getId() != null && this.getTimestamp() != null) {
            summaryItem.setId(UUID.fromString(this.getId()));
            summaryItem.setTimestamp(this.getTimestamp());
        }

        return summaryItem;
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
