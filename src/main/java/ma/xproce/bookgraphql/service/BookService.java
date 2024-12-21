package ma.xproce.bookgraphql.service;

import ma.xproce.bookgraphql.dto.BookDto;

import java.util.List;

public interface BookService {
    public BookDto saveBook(BookDto bookDto);

    public List<BookDto> getBookByTitle(String title);
}
