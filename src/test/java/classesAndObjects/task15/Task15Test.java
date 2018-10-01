package classesAndObjects.task15;

import classesAndObject.task15.Book;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static junit.framework.TestCase.assertEquals;

public class Task15Test {
    @Test
    public void testBooksCompareTo() {
        final Book book1 = new Book();
        book1.setIsbn(2);

        final Book book2 = new Book();
        book2.setIsbn(1);

        final Book book3 = new Book();
        book3.setIsbn(4);

        final Book book4 = new Book();
        book4.setIsbn(3);

        final Set<Book> bookSet = new TreeSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);

        final List<Book> bookList = Stream.of(book1, book2, book3, book4)
                .sorted(Comparator.comparingInt(Book::getIsbn))
                .collect(Collectors.toList());

        assertEquals(new ArrayList<>(bookSet), bookList);
    }
}
