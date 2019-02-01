package com.company;

import java.util.ArrayList;
import java.util.List;

public class DoneItem {

    public List<ToDoListItem> itemsToDelete = new ArrayList();


    public void removeItemFromList(ToDoListItem ItemDelete) {
        itemsToDelete.remove(ItemDelete);
    }

}
