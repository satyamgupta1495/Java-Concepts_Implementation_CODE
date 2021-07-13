package com.satyamgupta;

class C_Library{
    String book[];
    int no_of_book;

    C_Library(){
        this.book = new String[100];
        this.no_of_book = 0;
    }

    void addBook(String book){
        this.book[no_of_book] = book;
        no_of_book++;
        System.out.println(book+ " Added Successfully! ");
    }

    void showAvailableBook(){
        System.out.println("Available books are:");
        for (String book:book) {
            if(book == null){
                continue;
            }
            System.out.println("* "+ book);
        }
    }

    void issueBook(String book){
        for (int i = 0; i < book.length(); i++) {
            if(this.book[i].equals(book)){
                System.out.println("The book has been issued!");
                this.book[i] = null;
                return;
            }

        }
        System.out.println("This book Doesn't exist");
    }

    void returnBook(String book){
        this.book[no_of_book] = book;
    }
}


public class Library {


    public static void main(String[] args) {
        C_Library centralLibrary = new C_Library();
        centralLibrary .addBook("Harry Potter");
        centralLibrary .addBook("DSA");
        centralLibrary .addBook("JAVA & C++");
        centralLibrary .showAvailableBook();
        centralLibrary.issueBook("JAVA & C++");
        centralLibrary .showAvailableBook();
        centralLibrary.addBook("Sadguru");
        centralLibrary .showAvailableBook();
    }
}
