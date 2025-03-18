package org.example;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        x = AddOne.plusOne(x); //left
        int y = 0;
        int z = x + y;
        System.out.println(z);
    }
}