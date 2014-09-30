package com.djh.location.list.rest.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author David Hancock
 */
public class SummaryItems implements Serializable {

    List<SummaryItemRest> summaryItemRestList = new ArrayList<>();

    public SummaryItems(List<SummaryItemRest> summaryItemRestList) {
        this.summaryItemRestList = summaryItemRestList;
    }

    public List<SummaryItemRest> getSummaryItemRestList() {
        return summaryItemRestList;
    }

    public void setSummaryItemRestList(List<SummaryItemRest> summaryItemRestList) {
        this.summaryItemRestList = summaryItemRestList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SummaryItems that = (SummaryItems) o;

        if (summaryItemRestList != null ? !summaryItemRestList.equals(that.summaryItemRestList) : that.summaryItemRestList != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return summaryItemRestList != null ? summaryItemRestList.hashCode() : 0;
    }
}
