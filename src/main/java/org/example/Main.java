package org.example;

public class Main {
    public static void main(String[] args) {
        
        Detective sherlock = new Detective("Sherlock Holmes");

        CaseFile case1 = new CaseFile("Museum Robbery"
        //divider
            );
        case1.addClue(new Clue("footprints found on back window", 5));
        sherlock.addCaseFile(case1);
        sherlock.solveCase(case1);
    }
}