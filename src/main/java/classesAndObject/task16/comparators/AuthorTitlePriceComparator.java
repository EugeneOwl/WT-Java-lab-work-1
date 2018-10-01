package classesAndObject.task16.comparators;

import classesAndObject.task16.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(final Book book1, final Book book2) {
        final int authorDifference = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorDifference != 0) {
            return authorDifference;
        }
        final int titleDifference = book1.getTitle().compareTo(book2.getTitle());
        if (titleDifference != 0) {
            return titleDifference;
        }
        return book1.getPrice() - book2.getPrice();
    }
}
