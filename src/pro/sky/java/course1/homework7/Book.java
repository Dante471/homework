package pro.sky.java.course1.homework7;

public class Book {
    private final String name;
    private final String authorName;
    private int publishingYear;

    public Book(String authorName, int publishingYear, String name) {
        this.name = name;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public Book(String authorName) {
        this(authorName, 0, "No book name");
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
