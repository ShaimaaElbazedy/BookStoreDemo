package api.model;

import java.awt.print.Book;
import java.util.List;

public class BookListResponse {
    //Variables declaration
    private int numberOfBooks;
    private List<Book> books;

    //Setters&Getters

    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
}
