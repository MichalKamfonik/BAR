package pl.kamfonik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kamfonik.models.Book;

public interface BookRepository extends JpaRepository<Book,Long> {
}
