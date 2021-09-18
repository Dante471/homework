package pro.sky.java.course1.homework8;

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
            System.out.printf("%s: %s: %d\n", book.getAuthor(), book.getName(), book.getPublishingYear());
        }
    }

    @Override
    public String toString() {
        System.out.println("Library:");
        for (int i = 0; i < bookshelf.length; i++) {
            System.out.println(bookshelf[i]);
        }
        return "=================\nEnd of library";
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
