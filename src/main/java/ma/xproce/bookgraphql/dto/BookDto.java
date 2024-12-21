package ma.xproce.bookgraphql.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", resume='" + resume + '\'' +
                '}';
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

    String title;
    String publisher;
    int price;
    String resume;

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
}
