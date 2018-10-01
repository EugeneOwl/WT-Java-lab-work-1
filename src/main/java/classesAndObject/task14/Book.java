package classesAndObject.task14;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    protected Book clone() throws CloneNotSupportedException {
        final Book book = new Book();
        book.title = title;
        book.author = author;
        book.price = price;
        return book;
    }
}