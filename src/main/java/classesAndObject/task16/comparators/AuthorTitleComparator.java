package classesAndObject.task16.comparators;

import classesAndObject.task16.Book;

import java.util.Comparator;

/**
 * @author e.ivanov {@link 'https://github.com/EugeneOwl'}
 */
public class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(final Book book1, final Book book2) {
        final int authorDifference = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorDifference != 0) {
            return authorDifference;
        }
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
