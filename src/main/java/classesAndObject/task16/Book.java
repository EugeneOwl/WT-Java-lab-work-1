package classesAndObject.task16;

/**
 * @author e.ivanov {@link 'https://github.com/EugeneOwl'}
 */
public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book() {
    }

    public Book(final String title, final String author, final int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(final String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(final String author) {
        this.author = author;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Book setPrice(final int price) {
        this.price = price;
        return this;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(final int edition) {
        Book.edition = edition;
    }
}