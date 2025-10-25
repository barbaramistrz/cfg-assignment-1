package com.codefirstgirls;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in); // Scanner class is used to get user input

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE LIBRARY ITEM GENERATOR");
        System.out.println("*******************************");
        System.out.println("PLEASE ENTER ONE OF THE FOLLOWING OBJECTS TO CREATE");


        //print out your list here
        System.out.println("1. BOOK");
        System.out.println("2. MAGAZINE (WIP)");

        String menuChoice = scanner.nextLine();
        System.out.println("THANKS! HOW MANY WOULD YOU LIKE TO CREATE?");
        String amountToCreate = scanner.nextLine();

        // create the items, and output to the user as appropriate

    }
}