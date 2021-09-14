package pro.sky.java.course1.homework7;

import java.time.LocalDate;

public class Book {
    private final String name;
    private final Author authorName;
    private int publishingYear;

    public Book(Author authorName, int publishingYear, String name) {
        this.name = name;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public Book(Author authorName) {
        this(authorName, 0, "No book name");
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName.getFirstName() + " " + authorName.getSecondName();
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear > 0 && publishingYear < LocalDate.now().getYear()) {
            this.publishingYear = publishingYear;
        } else {
            try {
                throw new Exception("Invalid value entered");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
