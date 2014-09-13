package com.djh.location.list.service;

import com.djh.location.list.model.LocationListItem;

/**
 * @author David Hancock
 */
public interface LocationListService {

    /**
     * @param locationListItem
     */
    public void addItem(LocationListItem locationListItem);

    /**
     * @param locationListItem
     */
    public void deleteItem(LocationListItem locationListItem);


    /**
     * @param locationListItem
     */
    public void updateItem(LocationListItem locationListItem);

}
