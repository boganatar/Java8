package ua.java8.less1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by red5 on 7/21/2016.
 * https://github.com/ievstratenko/Java8Project
 */
public class StreamsHelper {


    public static void main(String [] args){

        Book book1 = new Book("t1", 55, Collections.emptyList());
        Book book2 = new Book("t2",155, Collections.emptyList());
        Book book3 = new Book("t3",255, Collections.emptyList());
        Book book4 = new Book("t4",355, Collections.emptyList());
        Book book5 = new Book("t5",455, Collections.emptyList());
        Book book6 = new Book("t6",555, Collections.emptyList());
        //Book [] books = {book1, book2, book3, book4, book5, book6};

        Author author1 = new Author("a1", (short)25, Collections.emptyList());
        Author author2 = new Author("a2", (short)25, Collections.emptyList());
        Author author3 = new Author("a3", (short)53, Collections.emptyList());
        Author author4 = new Author("a4", (short)45, Collections.emptyList());
        Author author5 = new Author("a5", (short)15, Collections.emptyList());
        Author [] authors = {
                new Author("a1", (short)25, Arrays.asList(book1,book2)),
                new Author("a2", (short)55, Arrays.asList(book3,book4)),
                new Author("a3", (short)65, Arrays.asList(book5))
        };

        Book [] books = {
                new Book("t1", 55, Arrays.asList(author1)),
                new Book("t2", 155, Arrays.asList(author1)),
                new Book("t3", 255, Arrays.asList(author2)),
                new Book("t4", 355, Arrays.asList(author2)),
                new Book("t5", 455, Arrays.asList(author3)),

        };

        Stream<Book> booksStr = Stream.of(books);

        booksStr.map((Book b) -> b.getNumberOfPages())
                .filter((Integer numberOfPages) -> numberOfPages > 200)
                .forEach(System.out::println);

    }
}
