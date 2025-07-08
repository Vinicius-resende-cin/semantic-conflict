package org.example;

public class Main {
    public static void main(String[] args) {
        CaseFile case1 = new CaseFile("Museum Robbery");
        case1.addClue(new Clue("footprints found on back window", 5));
        case1.removeLatestClue(); // previous change
        System.out.println("hello world");
    }
}