package org.example;

public class Main {
    public static void main(String[] args) {
        Text text = new Text("Hello world  world!");
        text.cleanText();
        System.out.println(text.getText());
    }
}