package com.example;

import com.example.model.Gaurav;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
       Gaurav obj=new Gaurav(1,"gaurav");
       System.out.println(obj);
    }
}
