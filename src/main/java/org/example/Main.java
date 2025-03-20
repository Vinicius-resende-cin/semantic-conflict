package org.example;

public class Main {
    static Foo a = new Foo();
    static Foo b = new Foo();
    public static void main(String[] args) {
        AddOne.plusOne(a); //left
        int z = a.x + b.x;
        System.out.println(z);
    }
}