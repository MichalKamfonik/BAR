package pl.kamfonik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kamfonik.exceptions.BadBookRequestException;
import pl.kamfonik.models.Book;
import pl.kamfonik.services.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("")
    public List<Book> getAllBooks(){
        return bookService.getBooksList();
    }

    @GetMapping("/{id:\\d+}")
    public Book getBook(@PathVariable(name = "id") Long id){
        return bookService.getBook(id);
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book){
        if (book == null) throw new BadBookRequestException();
        bookService.addBook(book);
    }

    @PutMapping("/{id:\\d+}")
    public void updateBook(@PathVariable(name = "id") Long id, @RequestBody Book book){
        if (book == null) throw new BadBookRequestException();
        book.setId(id);
        bookService.updateBook(book);
    }

    @DeleteMapping("/{id:\\d+}")
    public void deleteBook(@PathVariable(name = "id") Long id){
        bookService.deleteBook(id);
    }
}

