package org.yup.nhlibrary;

import java.util.Scanner;

public class Screens {

    public static int mainMenu(){

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to the library\n");

        System.out.println("What would you like to do?");
        System.out.println("1: View Available books");
        System.out.println("2: View Checked out books");
        System.out.println("3: Exit the Library\n");

        System.out.print("Please make your selection: ");

        return myScanner.nextInt();


    }

    public static int availableBooks(Book[] theBooks){

        Scanner myScanner = new Scanner(System.in);

        System.out.println("These are the available books:\n");

        for (int i = 0; i < theBooks.length; i++) {
            if(theBooks[i].isCheckedOut() == false) {

                Book currentBook = theBooks[i];
                System.out.println(i + 1 + ": " + currentBook.getTitle() + " - id:" + currentBook.getId() + " ISNBN:" + currentBook.getIsbn());

            }
        }

        System.out.print("\nWould you like to checkout a book (Y/N): ");
        String userSelection = myScanner.nextLine();

        if( userSelection.trim().equalsIgnoreCase("y") ){
            System.out.print("Please enter the number number of the book you would like to checkout: ");
            return myScanner.nextInt();
        }

        return -1;


    }

}
