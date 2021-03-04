package com.example.springdemo3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "gaurav")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Gaurav {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "accno")
    private String accno;

    public Gaurav(String name, String accno) {
        this.name = name;
        this.accno = accno;
    }

}
