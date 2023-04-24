package org.yup.nhlibrary;

public class Book {

    /*
    
    All the class properties for a Book
    
     */
    
    private int id;
    private String isbn;
    
    private String title;
    
    private boolean isCheckedOut;
    
    private String checkedOutTo;
    
    
    //Methods for a book
    
    //the constructor (create a book)


    public Book(int id, String isbn, String title) {

        //these are the properties where the value is passed in at book creation
        this.id = id;
        this.isbn = isbn;
        this.title = title;

        //these I am setting without data passed in to have default values
        this.setCheckedOut(false);
        this.setCheckedOutTo("");
    }

    //Method to checkout a book
    public void checkOut(String name){
        this.setCheckedOut(true);
        this.setCheckedOutTo(name);
    }

    //Method to check-in a book
    public void checkIn(String name){
        this.setCheckedOut(false);
        this.setCheckedOutTo("");
    }

    /*
        
        Getters and setters below
        
         */
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}
