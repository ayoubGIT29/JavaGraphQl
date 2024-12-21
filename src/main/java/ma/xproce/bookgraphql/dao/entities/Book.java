package ma.xproce.bookgraphql.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@Builder
public class Book {
    public int getId_Book() {
        return id_Book;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPrice() {
        return price;
    }

    public String getResume() {
        return resume;
    }

    @Id
    @GeneratedValue
    int id_Book;
    String title;
    String publisher;
    int price;
    String resume;

    public void setId_Book(int id_Book) {
        this.id_Book = id_Book;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Book(int id_Book, String title, String publisher, int price, String resume) {
        this.id_Book = id_Book;
        this.title = title;
        this.publisher = publisher;
        this.price = price;
        this.resume = resume;
    }

    public Book() {
        this.price=150;
    }
}
