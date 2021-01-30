package pl.kamfonik.services;

import pl.kamfonik.models.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getBooksList();
    Optional<Book> getBook(Long id);
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(Long id);
}
