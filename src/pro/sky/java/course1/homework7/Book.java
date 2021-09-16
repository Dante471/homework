package pro.sky.java.course1.homework7;

import java.time.LocalDate;

public class Book {
    private final String name;
    private final Author author;
    private int publishingYear;

    public Book(Author author, int publishingYear, String name) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public Book(Author author) {
        this(author, 0, "No book name");
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String authorToString() {
        return author.getFirstName() + " " + author.getSecondName();
    }


    public void setPublishingYear(int publishingYear) {
        if (publishingYear > 0 && publishingYear <= LocalDate.now().getYear()) {
            this.publishingYear = publishingYear;
        } else {
            System.out.println("Invalid value entered");
        }
    }
}
