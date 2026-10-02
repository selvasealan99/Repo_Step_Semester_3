package week8;

import java.util.*;
import java.time.*;

interface LibraryItem {
    LocalDate getDueDate();
    String getTitle();
}

class Book implements LibraryItem {
    String title;

    Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26).plusDays(14);
    }
}

class DVD implements LibraryItem {
    String title;

    DVD(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26).plusDays(7);
    }
}

class Magazine implements LibraryItem {
    String title;

    Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26).plusDays(3);
    }
}

public class LibraryDueDateCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            String[] parts = line.split(" ", 2);
            String type = parts[0];
            String title = parts[1].replace("\"", "");

            LibraryItem item;

            if (type.equals("BOOK"))
                item = new Book(title);
            else if (type.equals("DVD"))
                item = new DVD(title);
            else
                item = new Magazine(title);

            System.out.println(item.getTitle() + ": " + item.getDueDate());
        }
    }
}
