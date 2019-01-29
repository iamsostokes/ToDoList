package com.company;

public class ToDoList {

    private  ToDoListItem[] items = new ToDoListItem[3];

    private void addItemToToDoList(ToDoListItem item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
    }




}
