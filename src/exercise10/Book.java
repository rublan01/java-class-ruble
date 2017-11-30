package exercise10;

import java.util.Objects;
import java.util.Comparator;

/**
 * Class Book
 * @author rublan01
 */
public class Book {
    final String title;
    final String author;
    Double price;
    final Integer year;

    public Book(String title, String author, Double price, Integer year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }
   
    public Book(Book anotherBook) {
        this.title = anotherBook.getTitle();
        this.author = anotherBook.getAuthor();
        this.price = anotherBook.getPrice();
        this.year = anotherBook.getYear();
    }
    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getYear() {
        return year;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.title);
        hash = 73 * hash + Objects.hashCode(this.author);
        hash = 73 * hash + Objects.hashCode(this.price);
        hash = 73 * hash + Objects.hashCode(this.year);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return title + " (" + year + ") by " + author + " costs $" + price;
    }
    
}

class ByTitle implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.title.compareTo(o2.title);
    }
}


class ByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.author.compareTo(o2.author);
    }
}
    
class ByPrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.price.compareTo(o2.price);
    }
}
    
class ByYear implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.year.compareTo(o2.year);
    }
}
