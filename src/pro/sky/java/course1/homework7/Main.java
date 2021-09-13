package pro.sky.java.course1.homework7;

public class Main {

    public static void main(String[] args) {
        //easy level
        Author author1 = new Author("Alexander", "Pushkin");
        Author author2 = new Author("Fyodor", "Dostoevsky");
        Author author3 = new Author("Leo", "Tolstoy");
        Author author4 = new Author("Anton", "Chekhov");
        Book book1 = new Book(author1.getName(), 1839, "Captain's daughter");
        Book book2 = new Book(author2.getName(), 1865, "Crime and Punishment");
        book2.setPublishingYear(1866);
        //hard level
        Library classic = new Library(5);
        classic.addBook(0, author1.getName(), 1839, "Captain's daughter");
        classic.addBook(1, author1.getName(), 1820, "Ruslan i Ludmila");
        classic.addBook(2, author2.getName(), 1866, "Crime and Punishment");
        classic.addBook(3, author3.getName(), 1868, "War and Peace");
        classic.addBook(4, author4.getName(), 1904, "The Cherry Orchard");
        classic.printByName("War and Peace");
        classic.changeYearByName("War and Peace", 1869);
        classic.printByIndex(3);
    }


}
