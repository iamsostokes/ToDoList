package com.company;

import java.util.Scanner;

public class ToDoListDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userInput;
        ToDoList list = new ToDoList();

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

                        System.out.println("What is the name of the item you would like to add?");
                        scan.nextLine();
                        String newItemName = scan.nextLine();
                        newItem.setToDoItemName(newItemName);

                        System.out.println("Give a description of the item you are adding to the list.");
                        String newItemDescription = scan.nextLine();
                        newItem.setItemDescription(newItemDescription);

                        System.out.println("Is this item currently in progress? Enter true for yes and false for no.");
                        Boolean newInProgressStatus = scan.nextBoolean();
                        newItem.setInProgress(newInProgressStatus);


                        System.out.println("Is this Item Done yet?  Enter true for yes and false for no.");
                        Boolean newDoneStatus = scan.nextBoolean();
                        newItem.setDone(newDoneStatus);

                        newItem.itemDetails();

                        list.addItemToToDoList(newItem);


                        System.out.println("You can not add anymore items to your list.");

                    break;

                case 2:
                    list.printListItemDetails();
                    break;


            }



        } while (true);




    }
}
