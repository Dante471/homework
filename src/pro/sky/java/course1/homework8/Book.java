package pro.sky.java.course1.homework8;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int publishingYear;

    public Book(String name, Author author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public Book(Author author) {
        this("No book name", author, 0);
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

    @Override
    public String toString() {
        return "Book: " + name + " by " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishingYear);
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear > 0 && publishingYear <= LocalDate.now().getYear()) {
            this.publishingYear = publishingYear;
        } else {
            System.out.println("Invalid value entered");
        }
    }
}
