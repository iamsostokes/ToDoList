package com.company;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    //Creating a ArrayLit for my todo list items.
    public List<ToDoListItem> items = new ArrayList<>();




    //Creating new way to get to total elements in my todo list array.


//This was the old way I had it formatted with just a normal array.
//    public   ToDoListItem[] items = new ToDoListItem[3];

    //Below is the old way I had the code formatted for a normal array.
    public int totalItemsInList() {
        int totalItems = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) != null) {
                totalItems++;

            }
        }
        return totalItems;
    }






//creating a variable that will print out all of the values in each index of the todo list array.

    public  void  printListItemDetails () {

    }

//    public void printListItemDetails () {
//        for(int i = 0; i < items.length; i++) {
//            if (items[i] != null) {
//                System.out.print(i + "      ");
//                items[i].itemDetails();
//            }
//        }
//    }

    public void addItemToToDoList(ToDoListItem item) {
        items.add(item);
    }
//
//    public void addItemToToDoList(ToDoListItem item) {
//        for (int i = 0; i < items.length; i++) {
//            if (items[i] == null) {
//                items[i] = item;
//                break;
//            }
//        }
//    }
//
    public boolean listSlotNotAvailable() {
        return totalItemsInList() == items.size();
    }

    public boolean listSlotAvailable() {
        return !listSlotNotAvailable();
    }
//
//
//
//
}
