package ma.xproce.bookgraphql.web;


import lombok.AllArgsConstructor;
import ma.xproce.bookgraphql.dto.BookDto;
import ma.xproce.bookgraphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookGraphQLController {
    @Autowired
    private BookService bookService;


    @QueryMapping
    public List<BookDto> getBookByTitle(@Argument String title){
        return bookService.getBookByTitle(title);
    }

    @MutationMapping
    public BookDto saveBook(@Argument BookDto bookDto){
        System.out.println("afkari test "+bookDto);
        return bookService.saveBook(bookDto);
    }
}
