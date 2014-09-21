package com.djh.location.list.dao;

import com.djh.location.list.model.SummaryItem;
import com.djh.location.list.model.SummaryItems;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author David Hancock
 */
public class SimpleLocationListDAO implements LocationListDAO {

    private AtomicLong currentId = new AtomicLong();

    private ConcurrentHashMap<Long, SummaryItem> locationListItemMap = new ConcurrentHashMap<>();

    @Override
    public void saveLocationListItem(SummaryItem summaryItem) {
        Long id = currentId.incrementAndGet();
        summaryItem.setId(id);
        locationListItemMap.putIfAbsent(id, summaryItem);
    }

    @Override
    public void deleteLocationListItem(SummaryItem summaryItem) {
        Long summaryItemId = summaryItem.getId();
        locationListItemMap.remove(summaryItemId);
    }

    public SummaryItems findAllSummaryItems() {
        List<SummaryItem> summaryItemsList = new ArrayList<>(locationListItemMap.values());
        SummaryItems summaryItems = new SummaryItems(summaryItemsList);
        return summaryItems;
    }

    @Override
    public SummaryItem findSummaryItemById(Long locationListItemId) {
        return locationListItemMap.get(locationListItemId);
    }

}
