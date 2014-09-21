package com.djh.location.list.rest;

import com.djh.location.list.model.SummaryItem;
import com.djh.location.list.service.SummaryService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author David Hancock
 *         Restful API for LocationList operations
 */
@RestController
public class SummaryResource {

    private SummaryService summaryService;


    public void addItem(SummaryItem summaryItem) {
        summaryService.addItem(summaryItem);
    }

    public void deleteItem(SummaryItem summaryItem) {
        summaryService.deleteItem(summaryItem);
    }

    public void updateItem(SummaryItem summaryItem) {
        summaryService.updateItem(summaryItem);
    }

}
