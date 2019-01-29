package com.company;

import java.util.Scanner;

public class ToDoListDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userInput;
        ToDoList list = new ToDoList();
        boolean creatingList;

        do {
            System.out.println("Welcome to Todo List Creator!");
            System.out.println("What would you like to do?\n" +
                    "1. Add a item to your list\n" +
                    "2. Display items on list\n" +
                    "3. Display ");

        } while (!creatingList);




    }
}
