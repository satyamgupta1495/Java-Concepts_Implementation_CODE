package com.Java_Place_Practice;

class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println("New Book added! -> "+book);
    }

    void showAvailableBooks() {
        System.out.println("Available Books are : ");
        for (String elem : this.books) {
            if (elem == null) {
                break;
            }
            System.out.println(elem);
        }
    }
    void issueBook(String book){
        for (int i = 0; i < this.books.length; i++) {
            String b = this.books[i];
            if (b == book) {
                System.out.println("Books has been issued.");
                b = null;
            }

        }
    }
    }


public class P13_Library {
    public static void main(String[] args) {
    Library lib = new Library();
    lib.addBook("Rich Dad Poor Dad");
    lib.addBook("Data Structure");
    lib.addBook("Let us c");
    lib.addBook("Alchemist");
    lib.showAvailableBooks();
    }
}
