package com.Polymorphism;

abstract class LibraryItem {
    String title;
    String authorOrEditor;

    public LibraryItem(String title, String authorOrEditor) {
        this.title = title;
        this.authorOrEditor = authorOrEditor;
    }

    public abstract void displayInfo();
}

class Book extends LibraryItem {
    int pages;

    public Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + authorOrEditor);
        System.out.println("Pages: " + pages);
    }
}

class Magazine extends LibraryItem {
    int issueNumber;

    public Magazine(String title, String editor, int issueNumber) {
        super(title, editor);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Editor: " + authorOrEditor);
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("Java Programming", "James Gosling", 500);
        LibraryItem magazine = new Magazine("Tech Today", "John Smith", 42);

        System.out.println("Displaying Book Information:");
        book.displayInfo();

        System.out.println("\nDisplaying Magazine Information:");
        magazine.displayInfo();
    }
}

