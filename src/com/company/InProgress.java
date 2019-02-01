package com.company;

import java.util.ArrayList;
import java.util.List;

public class InProgress {


    public List<ToDoListItem> progressItems = new ArrayList();


    public void addItemToInProgressList(ToDoListItem progressItem) {
        progressItems.add(progressItem);
    }

    public boolean hasId (int idNumber) {
        boolean id = false;
        //creating a name for the variable to store the value of the loop | picking what object you want to loop through
        for (ToDoListItem idItem:  progressItems) {
            if (idItem.getIDNumber() == idNumber) {
                id = true;
            }
        }
        return id;
    }

    public int getIndexFromId (int id) {
        int toDoItemIndex = -1;
        for (ToDoListItem toDoItem: progressItems) {
            if (toDoItem.getIDNumber() == id) {
                toDoItemIndex = progressItems.indexOf(toDoItem);

            }
        }
        return toDoItemIndex;
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
