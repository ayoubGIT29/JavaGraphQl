package ma.xproce.bookgraphql;

import lombok.AllArgsConstructor;
import ma.xproce.bookgraphql.dao.entities.Book;
import ma.xproce.bookgraphql.dao.repositories.BookRepository;
import ma.xproce.bookgraphql.dto.BookDto;
import ma.xproce.bookgraphql.mapper.BookMapper;
import ma.xproce.bookgraphql.service.BookService;
import ma.xproce.bookgraphql.web.BookGraphQLController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class BookGraphQlApplication {
    @Autowired
    private BookMapper bookMapper;
    private static BookGraphQLController bookGraphQLController=new BookGraphQLController();


    public static void main(String[] args) {
        SpringApplication.run(BookGraphQlApplication.class, args);

//        List<BookDto> testBooks= bookGraphQLController.getBookByTitle("The Great Adventure");
//        for (BookDto book : testBooks) {
//            System.out.println("Title: " + book.getTitle());
//            System.out.println("Publisher: " + book.getPublisher());
//            System.out.println("Price: " + book.getPrice());
//            System.out.println("Resume: " + book.getResume());
//            System.out.println("-----------------------------");
//        }
    }

    @Bean
    CommandLineRunner start(BookRepository bookRepository){
        return args -> {
            System.out.println("The mapper test "+bookMapper.toDto(new Book(0, "The Great Adventure", "Epic Reads", 150, "An epic journey through unknown lands.")));
            bookRepository.saveAll(List.of(
                    new Book(0, "The Great Adventure", "Epic Reads", 150, "An epic journey through unknown lands."),
                    new Book(0, "The Great Adventure", "TechWorld", 200, "Exploring the innovations transforming the world."),
                    new Book(0, "Cooking 101", "Foodie Press", 75, "A beginner's guide to culinary mastery."),
                    new Book(0, "Mystery at Midnight", "Thriller House", 180, "A thrilling tale of suspense and mystery.")
                    )
            );
        };
    }

}
