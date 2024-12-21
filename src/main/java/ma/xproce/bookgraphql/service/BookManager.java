package ma.xproce.bookgraphql.service;

import lombok.AllArgsConstructor;
import ma.xproce.bookgraphql.dao.entities.Book;
import ma.xproce.bookgraphql.dao.repositories.BookRepository;
import ma.xproce.bookgraphql.dto.BookDto;
import ma.xproce.bookgraphql.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class BookManager implements BookService{
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookMapper bookMapper;
    @Override
    public BookDto saveBook(BookDto bookDto) {
        System.out.println("Test test alah "+bookDto);
        Book book = bookMapper.toEntity(bookDto);
        book = bookRepository.save(book);
        bookDto = bookMapper.toDto(book);
        return bookDto;
    }

    @Override
    public List<BookDto> getBookByTitle(String title) {
        List<Book> books = bookRepository.getBookByTitle(title);
        List<BookDto> bookDtos = new ArrayList<>();
        for(Book book:books){
            System.out.println("Book "+book);
            System.out.println("Book's Dto "+bookMapper.toDto(book));
            bookDtos.add(bookMapper.toDto(book));
        }
        return bookDtos;
    }
}
