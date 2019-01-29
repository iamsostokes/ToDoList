package com.company;

import java.awt.*;

public class ToDoListItem {

    private String itemDescription;
    private String toDoItemName;
    private Boolean inProgress;
    private Boolean done;

    public void itemDetails() {
        System.out.println("The description of the item is " + itemDescription +
                ", the item on ToDo list name is " + toDoItemName +
                ", is the item still in progress? true for yes and false for no " + inProgress +
                ", is the item done? true for yes and false for no " + done);
    }

    public String getItemDiscription() {
        return itemDescription;
    }

    public void setItemDiscription(String itemDiscription) {
        this.itemDescription = itemDiscription;
    }

    public String getStillNeedTodo() {
        return toDoItemName;
    }

    public void setStillNeedTodo(String stillNeedTodo) {
        this.toDoItemName = stillNeedTodo;
    }

    public Boolean getInProgress() {
        return inProgress;
    }

    public void setInProgress(Boolean inProgress) {
        this.inProgress = inProgress;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
