package ma.xproce.bookgraphql.mapper;

import ma.xproce.bookgraphql.dao.entities.Book;
import ma.xproce.bookgraphql.dto.BookDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public final ModelMapper modelMapper=new ModelMapper();

    public BookDto toDto(Book book){
        return modelMapper.map(book, BookDto.class);
    }

    // Convert Book to BookDto
//    public BookDto toDto(Book book) {
//        if (book == null) {
//            return null;
//        }
//        BookDto dto = new BookDto();
//        dto.setTitle(book.getTitle());
//        dto.setPublisher(book.getPublisher());
//        dto.setPrice(book.getPrice());
//        dto.setResume(book.getResume());
//        return dto;
//    }

    // Convert BookDto to Book
//    public Book toEntity(BookDto dto) {
//        if (dto == null) {
//            return null;
//        }
//        return new Book(0, dto.getTitle(), dto.getPublisher(), dto.getPrice(), dto.getResume());
//    }

    public Book toEntity(BookDto dto){
        if(dto==null){
            return null;
        }
        return modelMapper.map(dto, Book.class);
    }
}
