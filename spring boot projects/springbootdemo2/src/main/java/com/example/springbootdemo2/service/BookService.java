package com.example.springbootdemo2.service;

import java.util.List;
import java.util.Optional;

import com.example.springbootdemo2.dao.BookRepository;
import com.example.springbootdemo2.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    public BookRepository bookrepository;

    public List<Book> getAllbooks() {
        return bookrepository.findAll();
    }

    public Optional<Book> getBookById(int id) {
        return bookrepository.findById(id);

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
