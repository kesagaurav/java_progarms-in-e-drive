package com.example.springdemo3.reposiotory;

import com.example.springdemo3.model.Gaurav;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GauravRepository extends CrudRepository<Gaurav, Integer> {

}
