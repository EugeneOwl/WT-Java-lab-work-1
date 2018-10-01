package classesAndObjects.task16.comparators;

import classesAndObject.task16.Book;
import classesAndObject.task16.comparators.TitleComparator;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static junit.framework.TestCase.assertEquals;

public class TitleComparatorTest {
    private final TitleComparator comparator = new TitleComparator();

    @Test
    public void compareTest() {
        final Book book1 = new Book();
        book1.setTitle("ABC");

        final Book book2 = new Book();
        book2.setTitle("BCD");

        final Book book3 = new Book();
        book3.setTitle("BCE");

        final Book book4 = new Book();
        book4.setTitle("z");

        final List<Book> expectedBookList = Stream.of(book1, book2, book3, book4)
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());

        final List<Book> actualBookList = Stream.of(book1, book2, book3, book4)
                .sorted(comparator)
                .collect(Collectors.toList());



        assertEquals(expectedBookList, actualBookList);
    }
}
