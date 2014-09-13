package com.djh.location.list.dao;

import com.djh.location.list.model.LocationListItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author David Hancock
 */
public class SimpleLocationListDAO implements LocationListDAO {

    private AtomicLong currentId = new AtomicLong();

    private ConcurrentHashMap<Long, LocationListItem> locationListItemMap = new ConcurrentHashMap<Long, LocationListItem>();

    @Override
    public void saveLocationListItem(LocationListItem locationListItem) {
        Long id = currentId.incrementAndGet();
        locationListItem.setId(id);
        locationListItemMap.putIfAbsent(id, locationListItem);
    }

    @Override
    public void deleteLocationListItem(Long locationListItemId) {
        locationListItemMap.remove(locationListItemId);
    }

    public List<LocationListItem> findAllLocationListItems() {
        List<LocationListItem> locationListItems = new ArrayList<LocationListItem>(locationListItemMap.values());
        return locationListItems;
    }

    @Override
    public LocationListItem findLocationListItemById(Long locationListItemId) {
        return locationListItemMap.get(locationListItemId);
    }

}
