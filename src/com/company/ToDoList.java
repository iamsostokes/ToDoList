package com.company;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {



    //Creating a ArrayLit for my todo list items.
    public List<ToDoListItem> items = new ArrayList<>();


    //creating a method that will print out all of the values in each index of the todo list array.
    public void printListItemDetails () {
            for (ToDoListItem item: items) {
                item.itemDetails();
            }
    }
    //hasId(put what perameters you want it to accept)
    public boolean hasId (int idNumber) {
        boolean id = false;
        //creating a name for the variable to store the value of the loop | picking what object you want to loop through
        for (ToDoListItem idItem:  items) {
            if (idItem.getIDNumber() == idNumber) {
                id = true;
            }
        }
        return id;
    }

    public int getIndexFromId (int id) {
        int toDoItemIndex = -1;
        for (ToDoListItem toDoItem: items) {
            if (toDoItem.getIDNumber() == id) {
                toDoItemIndex = items.indexOf(toDoItem);

            }
        }
        return toDoItemIndex;
    }

    public int getSize () {
        return items.size();
    }


    //creating a method that will add items to the todo list.
    public void addItemToToDoList(ToDoListItem item) {
        items.add(item);
    }

    public List<ToDoListItem> getItems() {
        return items;
    }

    public void setItems(List<ToDoListItem> items) {
        this.items = items;
    }
}
