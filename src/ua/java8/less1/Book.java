package ua.java8.less1;

import java.util.List;

/**
 * Created by red5 on 7/21/2016.
 */
public class Book {
    public Book(String title, int numberOfPages, List<Author> authors) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    String title;
    private int numberOfPages;
    private List<Author> authors;
}
