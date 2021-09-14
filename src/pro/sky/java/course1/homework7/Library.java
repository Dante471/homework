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
        try {
            throw new Exception("The library is full");
        } catch (Exception e) {
            e.printStackTrace();
            return bookshelf.length;
        }
    }

    public void addBook(Book book) {
        int index = findFreeIndex();
        bookshelf[index] = book;
    }

    public void printAll() {
        for (int index = 0; index < bookshelf.length; index++) {
            System.out.printf("%s: %s: %d\n", bookshelf[index].getAuthorName(), bookshelf[index].getName(), bookshelf[index].getPublishingYear());
        }
    }

    public void printByName(String name) {
        for (int index = 0; index < bookshelf.length; index++) {
            if (name.equals(bookshelf[index].getName())) {
                System.out.printf("%s by %s was published in %d\n", bookshelf[index].getName(), bookshelf[index].getAuthorName(), bookshelf[index].getPublishingYear());
                break;
            }
        }
    }

    public void changeYearByName(String name, int year) {
        if (year > 0 && year < LocalDate.now().getYear()) {
            for (int index = 0; index < bookshelf.length; index++) {
                if (name.equals(bookshelf[index].getName())) {
                    bookshelf[index].setPublishingYear(year);
                    break;
                }
            }
        } else {
            try {
                throw new Exception("Invalid value entered");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
