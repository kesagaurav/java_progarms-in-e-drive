package com.example.springbootdemo2.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "author")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Author {
    @Id
    @Column(name = "authorid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorid;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "language")
    private String language;
    @OneToOne(mappedBy = "author")
    @JsonBackReference
    private Book book;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Family family;

    public Author(String firstname, String lastname, String language, Family family, Book book) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.language = language;
        this.family = family;
        this.book = book;
    }

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

}
