package classesAndObjects.task16.comparators;

import classesAndObject.task16.Book;
import classesAndObject.task16.comparators.AuthorTitlePriceComparator;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static junit.framework.TestCase.assertEquals;

public class AuthorTitlePriceComparatorTest {
    private final AuthorTitlePriceComparator comparator = new AuthorTitlePriceComparator();

    @Test
    public void compareTest() {
        final Book book1 = new Book();
        book1.setTitle("BCD")
                .setAuthor("author1")
                .setPrice(3);

        final Book book2 = new Book();
        book2.setTitle("BCD")
                .setAuthor("author2")
                .setPrice(0);

        final Book book3 = new Book();
        book3.setTitle("ABC")
                .setAuthor("author1")
                .setPrice(2);

        final Book book4 = new Book();
        book4.setTitle("BCD")
                .setAuthor("author4")
                .setPrice(0);

        final Book book5 = new Book();
        book5.setTitle("ABC")
                .setAuthor("author1")
                .setPrice(1);

        final List<Book> expectedBookList = Stream.of(book1, book2, book3, book4)
                .sorted(Comparator.comparing(Book::getAuthor)
                        .thenComparing(Book::getTitle)
                        .thenComparing(Book::getPrice))
                .collect(Collectors.toList());

        final List<Book> actualBookList = Stream.of(book1, book2, book3, book4)
                .sorted(comparator)
                .collect(Collectors.toList());


        assertEquals(expectedBookList, actualBookList);
    }
}
