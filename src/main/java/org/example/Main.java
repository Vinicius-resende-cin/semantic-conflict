package org.example;

public class Main {
    public static void main(String[] args) {
        
        Detective sherlock = new Detective("Sherlock Holmes");

        CaseFile case1 = new CaseFile("Museum Robbery");
        case1.addClue(new Clue("footprints found on back window", 5));
        sherlock.addCaseFile(case1);
        sherlock.solveCase(case1);
        
        CaseFile case2 = new CaseFile("Bank Robbery");
        case2.addClue(new Clue("Witness saw a black van", 3));
        sherlock.addCaseFile((case2));
        sherlock.solveCase(case2);

        sherlock.addCaseFile(case2);
    }
}