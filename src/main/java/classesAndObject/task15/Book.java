package classesAndObject.task15;

/**
 * @author e.ivanov {@link 'https://github.com/EugeneOwl'}
 */
public class Book implements Comparable {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(final int isbn) {
        this.isbn = isbn;
    }

    @Override
    public int compareTo(final Object o) {
        if (o == null || !o.getClass().equals(this.getClass())) {
            throw new RuntimeException("Object should initialized and belong to class Book.");
        }
        final Book book = (Book)o;
        return isbn - book.isbn;
    }
}