package com.example.springbootdemo2.dao;

import java.util.List;

import com.example.springbootdemo2.model.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    public List<Book> findAll();

    // public List<Book> findById();

    // public List<Book> addBook();

    // public List<Book> deleteById();



}
