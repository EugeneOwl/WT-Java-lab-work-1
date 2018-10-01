package classesAndObject.task12;

import java.text.MessageFormat;
import java.util.Objects;

/**
 * @author e.ivanov {@link 'https://github.com/EugeneOwl'}
 */
public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public boolean equals(final Object obj) {
        if (obj == null || !obj.getClass().equals(this.getClass())) {
            return false;
        }
        final Book book = (Book)obj;
        return Objects.equals(title, book.title)
                && Objects.equals(author, book.author)
                && book.price == price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return MessageFormat.format(
                "Book with title '{0}', author '{1}', price = {2}, edition = {3}",
                title, author, price, edition
        );
    }
}