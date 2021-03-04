package com.example.demo1.controller;

import java.util.List;
import java.util.Optional;

import com.example.demo1.model.Book;
import com.example.demo1.services.BookService;

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

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@NoArgsConstructor
public class Controller {

    private BookService bookservice;

    // get all the book list
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> list = bookservice.getAllBooks();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
    }

    // get single book
    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getById(@PathVariable("id") int id) {
        Book book = bookservice.getBookById(id);
        if (book == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.of(Optional.of(book));
        }

    }

    // new book handler
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

    // delete the book
    @DeleteMapping("/books/{bookId}")
    public ResponseEntity<Void> deleteBook(@PathVariable("bookId") int bookId) {
        try {
            this.bookservice.deleteBook(bookId);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }

    // update an book
    @PutMapping("/books/{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId) {
        bookservice.updateBook(book, bookId);
        return book;
    }

}
