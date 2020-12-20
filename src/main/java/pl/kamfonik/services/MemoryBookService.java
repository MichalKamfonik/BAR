package pl.kamfonik.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.kamfonik.exceptions.NoSuchBookException;
import pl.kamfonik.models.Book;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class MemoryBookService implements BookService {
    private Long nextId;
    private final List<Book> booksList;

    public MemoryBookService() {
        nextId = 0L;
        booksList = new ArrayList<>();
    }

    @Override
    public List<Book> getBooksList() {
        return List.copyOf(booksList); // return copy to avoid changing list outside of service
    }

    @Override
    public Book getBook(Long id) {
        return new Book(booksList.stream()  // return a copy to avoid changing book outside of service
                .filter(b -> b.getId().equals(id))
                .findAny()
                .orElseThrow(NoSuchBookException::new));
    }

    @Override
    public void addBook(Book book) {
        book.setId(nextId++);
        booksList.add(new Book(book));  // add a copy of book to avoid changing the book outside of service
    }

    @Override
    public void updateBook(Book book) {
        booksList.stream()
                .filter(b -> b.getId().equals(book.getId()))
                .findAny()
                .ifPresentOrElse(book::agentSmith, () -> {
                    throw new NoSuchBookException();
                });
    }

    @Override
    public void deleteBook(Long id) {
        booksList.stream()
                .filter(b -> b.getId().equals(id))
                .findAny()
                .ifPresentOrElse(booksList::remove, () -> {
                    throw new NoSuchBookException();
                });
    }
}
