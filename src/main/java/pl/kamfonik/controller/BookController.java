package pl.kamfonik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
/*
    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }
*/
    @GetMapping("")
    public List<Book> getAllBooks(){
        return bookService.getBooksList();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable(name = "id") Long id){
        return bookService.getBook(id);
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }
}

