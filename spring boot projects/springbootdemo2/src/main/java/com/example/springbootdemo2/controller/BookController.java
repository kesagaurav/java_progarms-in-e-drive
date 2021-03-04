package com.example.springbootdemo2.controller;

import java.util.List;
import java.util.Optional;

import com.example.springbootdemo2.model.Book;
import com.example.springbootdemo2.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookservice;

    @PostMapping("/books")
    public ResponseEntity<Book> getBook(@RequestBody Book book) {
        Book b = null;
        try {
            b = bookservice.addBook(book);
            System.out.println(book);
            return ResponseEntity.of(Optional.of(b));
        } catch (Exception e) {
            System.out.println("error" + e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> list = bookservice.getAllbooks();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Optional<Book>> getById(@PathVariable("id") int id) {
        Optional<Book> book = bookservice.getBookById(id);
        if (book == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.of(Optional.of(book));
        }

    }

    @DeleteMapping("/books/{bookId}")
    public ResponseEntity<Void> deleteBook(@PathVariable("bookId") int bookId) {
        try {
            System.out.println("\n resource deleted");
            this.bookservice.deleteBook(bookId);

            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    @PutMapping("/books/{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId) {
        bookservice.updateBook(book, bookId);
        return book;
    }

}
