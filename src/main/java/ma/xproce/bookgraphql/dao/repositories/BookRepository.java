package ma.xproce.bookgraphql.dao.repositories;

import ma.xproce.bookgraphql.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    public List<Book> getBookByTitle(String title);
}
