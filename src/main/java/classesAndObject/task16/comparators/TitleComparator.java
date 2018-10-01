package classesAndObject.task16.comparators;

import classesAndObject.task16.Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(final Book book1,final Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
