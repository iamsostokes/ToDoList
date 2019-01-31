package com.company;

import java.awt.*;

public class ToDoListItem {

    private String itemDescription;
    private String toDoItemName;
    private Boolean inProgress;
    private Boolean done;
    private int iDNumber;

    public void itemDetails() {
        System.out.println("ID number:"+ iDNumber + "  " + toDoItemName + "\n" +
                "             Item description: " +itemDescription  + "\n" +
                "             In progress status: " + inProgress + "\n" +
                "             Complete status: " + done);
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getToDoItemName() {
        return toDoItemName;
    }

    public void setToDoItemName(String ToDoName) {
        this.toDoItemName = ToDoName;
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

    public int getIDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }
}

