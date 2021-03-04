package com.example.model;

public class Gaurav {
    
    private int id;
    private String name;

    public Gaurav(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gaurav [id=" + id + ", name=" + name + "]";
    }
    

}
