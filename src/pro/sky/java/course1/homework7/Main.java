package pro.sky.java.course1.homework7;

public class Main {

    public static void main(String[] args) {
        //easy level
        Author author1 = new Author("Alexander", "Pushkin");
        Author author2 = new Author("Fyodor", "Dostoevsky");
        Author author3 = new Author("Leo", "Tolstoy");
        Author author4 = new Author("Anton", "Chekhov");
        Book book1 = new Book(author1, 1839, "Captain's daughter");
        Book book2 = new Book(author1, 1820, "Ruslan i Ludmila");
        Book book3 = new Book(author2, 1865, "Crime and Punishment");
        Book book4 = new Book(author3, 1868, "War and Peace");
        Book book5 = new Book(author4, 1904, "The Cherry Orchard");
        book3.setPublishingYear(1866);
        //hard level
        Library classic = new Library(5);
        classic.addBook(book1);
        classic.addBook(book2);
        classic.addBook(book3);
        classic.addBook(book4);
        classic.addBook(book5);
        classic.printByName("War and Peace");
        classic.changeYearByName("War and Peace", 1869);
        classic.printAll();
    }
}
