package com.company;

public class ToDoList {

    private  ToDoListItem[] items = new ToDoListItem[3];

    public int totalItemsInList() {
        int totalItems = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                totalItems++;
            }
        }
        return totalItems;
    }

    public void addItemToToDoList(ToDoListItem item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
    }

    public boolean listSlotNotAvailable() {
        return totalItemsInList() == items.length;
    }

    public boolean listSlotAvailable() {
        return !listSlotNotAvailable();
    }




}
