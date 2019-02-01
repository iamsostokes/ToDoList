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
        DoneItem doneItem = new DoneItem();
        boolean loop = true;

        do {
            System.out.println("Welcome to Todo List Creator!");
            System.out.println("What would you like to do?\n" +
                    "1. Add a item to your list\n" +
                    "2. Display items on list\n" +
                    "3. Would you like to mark an item on your list In Progress?\n" +
                    "4. Would you like to view items that are In Progress?\n" +
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

                        newItem.itemDetails();

                        list.addItemToToDoList(newItem);


                        System.out.println("You can not add anymore items to your list.");

                    break;

                case 2:
                    System.out.println("___________________________________" +
                            "Here is a list of items on your todo list.____________________________________________");
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

                        System.out.println("_______________________________" +
                                "Here is a list of items in your In Progress List_______________________________________");
                        iPList.printInProgressDetails();

                    }
                    break;

                case 4:
                    System.out.println("___________________________________" +
                            "Here is a list of items on your todo list that is marked In Progress.______________________");
                    iPList.printInProgressDetails();
                    break;

                case 5:
                    System.out.println("___________________________________" +
                            "Please select the item ID number that you would like to make Done and delete.______________");
                    list.printListItemDetails();
                    iPList.printInProgressDetails();
                    userInput = scan.nextInt();
                    if (list.hasId(userInput)) {
                        int index = list.getIndexFromId(userInput);
                        list.items.remove(list.items.get(index));
                    }else if (iPList.hasId(userInput)) {
                        int index = iPList.getIndexFromId(userInput);
                        iPList.progressItems.remove(iPList.progressItems.get(index));

                    }
                    break;

                case 6:
                    System.out.println("Good Bye");
                    loop = false;
                    break;

            }



        } while (loop);




    }
}
