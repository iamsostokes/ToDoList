package com.company;

import java.util.Collections;
import java.util.Scanner;

public class ToDoListDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userInput;
        ToDoList list = new ToDoList();
        ToDoListItem listItem = new ToDoListItem();
        InProgress iPList = new InProgress();



        do {
            System.out.println("Welcome to Todo List Creator!");
            System.out.println("What would you like to do?\n" +
                    "1. Add a item to your list\n" +
                    "2. Display items on list\n" +
                    "3. Would you like to mark an item on your list In Progress?\n" +
                    "4. Would you like to mark an item on your In Progress list Done?\n" +
                    "5. Would you like to Delete an item?\n" +
                    "6. Exit ToDo list");
            System.out.println("Enter a number to make your selection");

            userInput = scan.nextInt();

            switch (userInput) {
                case 1:
                        ToDoListItem newItem = new ToDoListItem();


                        System.out.println("Give this item you are adding to the list an ID number");
                        Integer newIdNumber = scan.nextInt();
                        newItem.setiDNumber(newIdNumber);

                        System.out.println("What is the name of the item you would like to add?");
                        scan.nextLine();
                        String newItemName = scan.nextLine();
                        newItem.setToDoItemName(newItemName);


                        System.out.println("Give a description of the item you are adding to the list");
                        String newItemDescription = scan.nextLine();
                        newItem.setItemDescription(newItemDescription);

//              commenting out this cold because I won't need these questions once I finish my in progress and done list are made
//                        System.out.println("Is this item currently in progress? Enter true for yes and false for no");
//                        Boolean newInProgressStatus = scan.nextBoolean();
//                        newItem.setInProgress(newInProgressStatus);
//
//
//                        System.out.println("Is this Item Done yet?  Enter true for yes and false for no.");
//                        Boolean newDoneStatus = scan.nextBoolean();
//                        newItem.setDone(newDoneStatus);

                        newItem.itemDetails();

                        list.addItemToToDoList(newItem);


                        System.out.println("You can not add anymore items to your list.");

                    break;

                case 2:
                    list.printListItemDetails();
                    break;

                case 3:
                    System.out.println("                                                                                " +
                            "Please select the id number of the item on the list that you would like to mark" +
                            "in progress                                                                                ");
                    list.printListItemDetails();
                    userInput = scan.nextInt();
                    if (list.hasId(userInput)) {
                        int index = list.getIndexFromId(userInput);
                        iPList.addItemToInProgressList(list.items.get(index));
                        list.items.remove(list.items.get(index));

                        System.out.println("Here is a list of items in your In Progress List");
                        System.out.println("Todo Size" + list.getSize());
                        System.out.println("in progress list size " + iPList.getSize());
                        iPList.printInProgressDetails();
                        //working on getting the item from the array to move to the in progress array.
                    }

            }



        } while (true);




    }
}
