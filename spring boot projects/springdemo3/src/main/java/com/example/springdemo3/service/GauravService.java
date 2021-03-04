package com.example.springdemo3.service;

import java.util.List;
import java.util.Optional;

import com.example.springdemo3.model.Gaurav;
import com.example.springdemo3.reposiotory.GauravRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GauravService {
    @Autowired
    private GauravRepository gauravrepository;

    public List<Gaurav> getAllGaurav() {
        return (List<Gaurav>) gauravrepository.findAll();

    }

    public Optional<Gaurav> getGauravById(int id) {
        return gauravrepository.findById(id);
    }

    public Gaurav addGaurav(Gaurav g) {
        Gaurav gau = gauravrepository.save(g);
        return gau;
    }

    public void deleteBook(int id) {
        // list.stream().filter(book -> book.getId() !=
        // id).collect(Collectors.toList());
        gauravrepository.deleteById(id);
    }

    public void updateBook(Gaurav book, int bookid) {
        // list.stream().map(b -> {
        // if (b.getId() == bookid) {
        // b.setAuthor(book.getAuthor());
        // b.setName(book.getName());
        // }
        // return b;
        // }).collect(Collectors.toList());
        gauravrepository.save(book);
    }

}
