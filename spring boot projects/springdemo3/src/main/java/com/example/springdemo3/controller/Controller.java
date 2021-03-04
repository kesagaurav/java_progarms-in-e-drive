package com.example.springdemo3.controller;

import java.util.List;
import java.util.Optional;

import com.example.springdemo3.model.Gaurav;
import com.example.springdemo3.service.GauravService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@NoArgsConstructor
public class Controller {

    private GauravService gauravservice;

    // @PostMapping(value = "/books")
    // public ResponseEntity<Gaurav> insertGaurav(@RequestBody Gaurav gau) {
    // System.out.println(gau);
    // Gaurav gau1 = null;
    // try {
    // gau1 = gauravservice.addGaurav(gau);
    // System.out.println(gau1);
    // return ResponseEntity.of(Optional.of(gau1));
    // } catch (Exception e) {
    // System.out.println("error" + e);
    // return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    // }

    // }

    @GetMapping("/books")
    public ResponseEntity<List<Gaurav>> getBooks() {
        List<Gaurav> list = gauravservice.getAllGaurav();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
    }

    @PostMapping(value = "/books")
    public ResponseEntity<String> getGaurav(@RequestBody Gaurav gau) {
        gauravservice.addGaurav(gau);
        return new ResponseEntity<>("resource created", HttpStatus.CREATED);
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Optional<Gaurav>> getById(@PathVariable("id") int id) {
        // Optional<Gaurav> book = gauravservice.getGauravById(id);

        if (gauravservice.getGauravById(id) == null) {
            return new ResponseEntity<>(gauravservice.getGauravById(id), HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(gauravservice.getGauravById(id), HttpStatus.OK);

        }

    }

    @DeleteMapping("/books/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable("bookId") int bookId) {

        gauravservice.deleteBook(bookId);
        return new ResponseEntity<>("resource deleted", HttpStatus.GONE);

    }
}
