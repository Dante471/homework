package pro.sky.java.course1.homework7;

import java.time.LocalDate;

public class Library {
    private static Book[] bookshelf;

    public Library(int length) {
        bookshelf = new Book[length];
    }

    private static int findFreeIndex() {
        for (int index = 0; index < bookshelf.length; index++) {
            if (bookshelf[index] == null) {
                return index;
            }
        }
        System.out.println("Library is full");
        return -1;
    }

    public void addBook(Book book) {
        int index = findFreeIndex();
        if (index >= 0 && index < bookshelf.length) {
            bookshelf[index] = book;
        } else {
            return;
        }
    }

    public void printAll() {
        for (Book book : bookshelf) {
            System.out.printf("%s: %s: %d\n", book.authorToString(), book.getName(), book.getPublishingYear());
        }
    }

    public void printByName(String name) {
        for (Book book : bookshelf) {
            if (name.equals(book.getName())) {
                System.out.printf("%s by %s was published in %d\n", book.getName(), book.authorToString(), book.getPublishingYear());
                return;
            }
        }
    }

    public void changeYearByName(String name, int year) {
        if (year > 0 && year <= LocalDate.now().getYear()) {
            for (Book book : bookshelf) {
                if (name.equals(book.getName())) {
                    book.setPublishingYear(year);
                    return;
                }
            }
        } else {
            System.out.println("Invalid value entered");
        }
    }
}
