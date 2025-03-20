package org.example;

public class Main {
    static Example a = new Example();
    static Example b = new Example();
    public static void main(String[] args) {
        AddOne.plusOne(a); //left
        int z = a.x + b.x;
        System.out.println(z);
    }
}