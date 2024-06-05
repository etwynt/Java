Main.java

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your Book Manager!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. View all books");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.println("Enter the title of the book:");
                String title = scanner.nextLine();
                System.out.println("Enter the author of the book:");
                String author = scanner.nextLine();
                library.addBook(title, author);
                System.out.println("Book added successfully!");
            } else if (choice == 2) {
                if (library.isEmpty()) {
                    System.out.println("The library is empty.");
                } else {
                    System.out.println("Enter the index of the book to remove:");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Book removedBook = library.removeBook(index);
                    if (removedBook != null) {
                        System.out.println("Removed: " + removedBook);
                    } else {
                        System.out.println("Invalid index.");
                    }
                }
            } else if (choice == 3) {
                if (library.isEmpty()) {
                    System.out.println("The library is empty.");
                } else {
                    System.out.println("Books in the library:");
                    int index = 0;
                    for (Book book : library.getAllBooks()) {
                        System.out.println(index++ + ". " + book);
                    }
                }
            } else if (choice == 4) {
                System.out.println("Exiting the program. Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
```

Book.java

```java

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "'" + title + "' by " + author;
    }
}

```

Library.java

```java

import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public Book removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            return books.remove(index);
        } else {
            return null;
        }
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }
}

```
