package org.example;

public class Main {
    public static void main(String[] args) {
        String input = "the the dog";
        Text t = new Text(input);
        t.normalizeWhiteSpace();
        t.removeComments();
        System.out.println(t.getText());
    }
}
