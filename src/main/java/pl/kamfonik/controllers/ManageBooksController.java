package pl.kamfonik.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.kamfonik.exceptions.NoSuchBookException;
import pl.kamfonik.models.Book;
import pl.kamfonik.services.BookService;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/admin/books")
public class ManageBooksController {
    private final BookService bookService;

    public ManageBooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public String showBooks(Model model) {
        List<Book> books = bookService.getBooksList();
        model.addAttribute("books", books);
        return "/books/all";
    }
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("book",new Book());
        return "/books/add";
    }
    @PostMapping("/add")
    public String add(@ModelAttribute Book book) {
        bookService.addBook(book);
        return "redirect:/admin/books/all";
    }
    @GetMapping("/edit/{id}")
    public String showEditForm(Model model, @PathVariable Long id) {
        model.addAttribute(
                "book"
                ,bookService.getBook(id).orElseThrow(NoSuchBookException::new));
        return "/books/edit";
    }
    @PostMapping("/edit/{id}")
    public String edit(@ModelAttribute Book book,@PathVariable Long id) {
        log.debug("Edited book ID= {}",book.getId());
        bookService.updateBook(book);
        return "redirect:/admin/books/all";
    }
    @GetMapping("/delete/{id}")
    public String showDeleteForm(Model model, @PathVariable Long id) {
        model.addAttribute(
                "book"
                ,bookService.getBook(id).orElseThrow(NoSuchBookException::new));
        return "/books/delete";
    }
    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Long id, @RequestParam String choice) {
        if("yes".equalsIgnoreCase(choice.trim())){
            bookService.deleteBook(id);
        }
        return "redirect:/admin/books/all";
    }
    @GetMapping("/show/{id}")
    public String show(Model model, @PathVariable Long id) {
        model.addAttribute(
                "book"
                ,bookService.getBook(id).orElseThrow(NoSuchBookException::new));
        return "/books/show";
    }
}
