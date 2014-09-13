package com.djh.location.list.dao;

import com.djh.location.list.model.LocationListItem;

import java.util.List;

/**
 * @author David Hancock
 */
public interface LocationListDAO {

    void saveLocationListItem(LocationListItem locationListItem);

    void deleteLocationListItem(Long locationListItemId);

    List<LocationListItem> findAllLocationListItems();

    LocationListItem findLocationListItemById(Long locationListItemId);

}
