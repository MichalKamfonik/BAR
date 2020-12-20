package pl.kamfonik.services;

import org.springframework.stereotype.Service;
import pl.kamfonik.models.Book;

import java.util.List;

@Service
public interface BookService {
    List<Book> getBooksList();
    Book getBook(Long id);
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(Long id);
}
