package org.example;

public class Main {
    public static void main(String[] args) {
        String input = "Hello  world world! // comment here";
        Text t = new Text(input);
        t.cleanText();
    }
}
