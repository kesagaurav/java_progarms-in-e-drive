package com.example.demo1.dao;

import com.example.demo1.model.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    // public List<Book> findById();
}
