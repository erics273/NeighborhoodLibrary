package org.yup.nhlibrary;

import java.util.Scanner;

public class theApp {

    //create 5 books in a list
    private static Book[] theBooks = {
            new Book(1, "2934791742917324", "Ready Player 1"),
            new Book(2, "0975109842038402", "Jurassic Park"),
            new Book(3, "1987509172098324", "Alice In Wonderland"),
            new Book(4, "2430975093475092", "To Kill a MockingBird"),
            new Book(5, "7823109812349875", "Ready Player 1")
    };

    public static void main(String[] args){

        //fire up the scanner because I may want to caputure input from our user
        Scanner myScanner = new Scanner(System.in);

        //set appRunnin to true and use this to keep the application going
        boolean appRunning = true;

        //while the app is running (appRunning = true)
        while(appRunning) {

            int mainMenuChoice = Screens.mainMenu();

            switch(mainMenuChoice) {

                //view all the available books
                case 1:
                    int selectedBook = Screens.availableBooks(theBooks);

                    if(selectedBook <= theBooks.length){
                        Book bookToCheckOut = theBooks[selectedBook - 1];
                        System.out.print("What is your name?: ");
                        String usersName = myScanner.nextLine();
                        bookToCheckOut.checkOut(usersName);
                    }

                    if(selectedBook == -1){
                        continue;
                    }

                    break;

                case 2:
                    break;

                case 3:
                    appRunning = false;
                    break;
                default:
                    System.out.println("Bad choice, try again");

            }

        }
        System.out.println("Thank you for visiting the Library, Have a nice day\n");

    }

}
