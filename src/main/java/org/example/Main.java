package org.example;

public class Main {
    static int x = 0;
    static int y = 0;
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
        int z = x + y;
        System.out.println(z);
    }

    public static void add1toX() {
        x++;
    }

    public static void add1toY() {
        y++;
    }
}