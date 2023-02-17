import java.util.*;
import java.lang.*;

class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public String toString() {
        return  "title: " + title +
                ", author: " + author +
                ", year: " + year;

    }
}

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Bible", "Some author", 1200);
        Book book2 = new Book("Gray", "Random author", 2020);
        Book book3 = new Book("Angel's and demon's", "Another author", 2005);
        Book book4 = new Book("Davinci's Code", "Different author", 1999);
        Book book5 = new Book("Lord of the rings", "Tolkien", 1969);

        Deque<Book> stackPile = new ArrayDeque<>();

        stackPile.push(book1);
        stackPile.push(book2);
        stackPile.push(book3);
        stackPile.push(book4);
        stackPile.push(book5);

        System.out.println("Queue is created. It's size is: " + stackPile.size());

        Book tempBook = null;

        //displays only last book which was removed
        while (stackPile.size() > 0) {
            Book book = stackPile.pop();
            if(stackPile.size() == 0) {
                tempBook = book;
            }
        }
        System.out.println("Queue is created. It's size is: " + stackPile.size());
        System.out.println("Last book removed from stack was: " + tempBook);

    }
}