package classesAndObjects.task16.comparators;

import classesAndObject.task16.Book;
import classesAndObject.task16.comparators.AuthorTitileComparator;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static junit.framework.TestCase.assertEquals;

public class AuthorTitleComparatorTest {
    private final AuthorTitileComparator comparator = new AuthorTitileComparator();

    @Test
    public void compareTest() {
        final Book book1 = new Book();
        book1.setTitle("BCD")
                .setAuthor("author1");

        final Book book2 = new Book();
        book2.setTitle("BCD")
                .setAuthor("author2");

        final Book book3 = new Book();
        book3.setTitle("ABC")
                .setAuthor("author1");

        final Book book4 = new Book();
        book4.setTitle("BCD")
                .setAuthor("author4");

        final List<Book> expectedBookList = Stream.of(book1, book2, book3, book4)
                .sorted(Comparator.comparing(Book::getAuthor)
                        .thenComparing(Book::getTitle))
                .collect(Collectors.toList());

        final List<Book> actualBookList = Stream.of(book1, book2, book3, book4)
                .sorted(comparator)
                .collect(Collectors.toList());


        assertEquals(expectedBookList, actualBookList);
    }
}
