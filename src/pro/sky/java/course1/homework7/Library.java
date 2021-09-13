package pro.sky.java.course1.homework7;

import java.util.Objects;

public class Library {
    private final int length;
    private static Book[] bookshelf;

    public Library(int length) {
        this.length = length;
        bookshelf = new Book[length];
    }

    public void addBook(int index, String author, int year, String bookName) {
        if (index < length) {
            bookshelf[index] = new Book(author, year, bookName);
        }
    }

    public void printByIndex(int index) {
        System.out.printf("%s: %s: %d\n", bookshelf[index].getAuthorName(), bookshelf[index].getName(), bookshelf[index].getPublishingYear());
    }

    public void printByName(String name) {
        for (int index = 0; index < length; index++) {
            if (Objects.equals(name, bookshelf[index].getName())) {
                System.out.printf("%s by %s was published in %d\n", bookshelf[index].getName(), bookshelf[index].getAuthorName(), bookshelf[index].getPublishingYear());
                break;
            }
        }
    }

    public void changeYearByName(String name, int year) {
        for (int index = 0; index < length; index++) {
            if (Objects.equals(name, bookshelf[index].getName())) {
                bookshelf[index].setPublishingYear(year);
                break;
            }
        }
    }
}
