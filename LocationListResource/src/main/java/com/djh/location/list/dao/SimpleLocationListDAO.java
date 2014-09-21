package com.djh.location.list.dao;

import com.djh.location.list.model.SummaryItem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author David Hancock
 */
public class SimpleLocationListDAO implements LocationListDAO {

    private AtomicLong currentId = new AtomicLong();

    private ConcurrentHashMap<Long, SummaryItem> locationListItemMap = new ConcurrentHashMap<Long, SummaryItem>();

    @Override
    public void saveLocationListItem(SummaryItem summaryItem) {
        Long id = currentId.incrementAndGet();
        summaryItem.setId(id);
        locationListItemMap.putIfAbsent(id, summaryItem);
    }

    @Override
    public void deleteLocationListItem(Long locationListItemId) {
        locationListItemMap.remove(locationListItemId);
    }

    public List<SummaryItem> findAllLocationListItems() {
        List<SummaryItem> summaryItems = new ArrayList<SummaryItem>(locationListItemMap.values());
        return summaryItems;
    }

    @Override
    public SummaryItem findLocationListItemById(Long locationListItemId) {
        return locationListItemMap.get(locationListItemId);
    }

}
