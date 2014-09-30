package com.djh.location.list.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author David Hancock
 */
public class SummaryItems implements Serializable {

    List<SummaryItem> summaryItemList = new ArrayList<>();

    public SummaryItems(List<SummaryItem> summaryItemList) {
        this.summaryItemList = summaryItemList;
    }

    public List<SummaryItem> getSummaryItemList() {
        return summaryItemList;
    }

    public void setSummaryItemList(List<SummaryItem> summaryItemList) {
        this.summaryItemList = summaryItemList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SummaryItems that = (SummaryItems) o;

        if (summaryItemList != null ? !summaryItemList.equals(that.summaryItemList) : that.summaryItemList != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return summaryItemList != null ? summaryItemList.hashCode() : 0;
    }
}
