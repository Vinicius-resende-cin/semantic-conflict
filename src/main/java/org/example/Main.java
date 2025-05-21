package org.example;

public class Main {
    public static void main(String[] args) {
        String input = args[0];
        Text t = new Text(input);
        t.removeComments();
        System.out.println(t.getText());
    }
}
