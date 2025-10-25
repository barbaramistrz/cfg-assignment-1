package com.codefirstgirls;

import java.util.ArrayList;
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

        int menuChoice = scanner.nextInt();

        if(menuChoice == 1) {
            System.out.println("THANKS! HOW MANY BOOKS WOULD YOU LIKE TO CREATE? MAX 5");
            int amountToCreate = scanner.nextInt();
            scanner.nextLine();

            if(amountToCreate > 5) {
                System.out.println("TOO MANY! WE WILL CREATE 5.");
                amountToCreate = 5;
            }
            ArrayList<Book> books = new ArrayList<>();
            // create the items, and output to the user as appropriate
            for(int i=0; i < amountToCreate; i++) {
                System.out.println("ENTER TITLE FOR BOOK " + (i+1) + ":");
                String title = scanner.nextLine();
                System.out.println("ENTER AUTHOR FOR BOOK " + (i+1) + ":");
                String author = scanner.nextLine();
                System.out.println("CHOOSE A GENRE FOR BOOK " +(i+1) + ":");
                for (Genre g : Genre.values()) {
                    System.out.println("- " + g.name());
                }
                Genre genre = Genre.valueOf(scanner.nextLine().toUpperCase());
                books.add(new Book(title, author, genre));
            }
            System.out.println("*******************************");
            System.out.println("YOU'VE CREATED " + books.size() + " BOOK(S):");
            for(Book book: books){
                System.out.println(book.getSummary());
            }



        } else if(menuChoice == 2) {
            System.out.println("MAGAZINE CREATION IS A WORK IN PROGRESS, PLEASE CHECK IN LATER.");

        } else {
            System.out.println("INVALID OPTION. PLEASE RESTART.");

        }
        scanner.close();
    }
}