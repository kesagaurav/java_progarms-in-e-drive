package com.example.demo1.services;

import java.util.List;

import com.example.demo1.dao.BookRepository;
import com.example.demo1.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@NoArgsConstructor
@Service
public class BookService {

    public BookRepository bookrepository;

    // private static List<Book> list = new ArrayList<>();

    // static {
    // list.add(new Book(1, "gaurav", "java"));
    // list.add(new Book(2, "yashwant", "ds"));
    // list.add(new Book(3, "josh", "pythin"));
    // list.add(new Book("gauarv1", "js"));
    // }

    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>) this.bookrepository.findAll();
        return list;
    }

    public Book getBookById(int id) {
        Book book = null;
        // book = list.stream().filter(e -> e.getId() == id).findFirst().get();
        try {
            // book = this.bookrepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public Book addBook(Book b) {
        Book result = bookrepository.save(b);
        return result;
    }

    public void deleteBook(int id) {
        // list.stream().filter(book -> book.getId() !=
        // id).collect(Collectors.toList());
        bookrepository.deleteById(id);
    }

    public void updateBook(Book book, int bookid) {
        // list.stream().map(b -> {
        // if (b.getId() == bookid) {
        // b.setAuthor(book.getAuthor());
        // b.setName(book.getName());
        // }
        // return b;
        // }).collect(Collectors.toList());
        bookrepository.save(book);
    }

}
