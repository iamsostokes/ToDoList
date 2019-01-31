package com.company;

import java.util.ArrayList;
import java.util.List;

public class InProgress {


    public List<ToDoListItem> progressItems = new ArrayList();


    public void addItemToInProgressList(ToDoListItem progressItem) {
        progressItems.add(progressItem);
    }

    public int getSize () {
        return progressItems.size();
    }

    public void printInProgressDetails () {
        for (ToDoListItem item: progressItems) {
            item.itemDetails();
        }
    }



}
