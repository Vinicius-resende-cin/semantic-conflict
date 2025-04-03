package org.example;

public class Main {
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {

        System.out.println("divider");
        
        int z = x + y;
        System.out.println(z);
    }

    public static void addX() {
        x++;
    }

    public static void addY() {
        y++;
    }
}