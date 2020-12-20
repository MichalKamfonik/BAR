package pl.kamfonik.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;

    public Book(Book book){
        this(book.id,book.isbn,book.title,book.author,book.publisher, book.type);
    }

    public void copycat(Book book){
        this.id = book.id;
        this.isbn = book.isbn;
        this.title = book.title;
        this.author = book.author;
        this.publisher = book.publisher;
        this.type = book.type;
    }

    // make the given book same as this book
    public void agentSmith(Book toChange){
        toChange.id = this.id;
        toChange.isbn = this.isbn;
        toChange.title = this.title;
        toChange.author = this.author;
        toChange.publisher = this.publisher;
        toChange.type = this.type;
    }
}
