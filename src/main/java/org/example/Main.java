package org.example;

public class Main {
    public static void main(String[] args) {
        Detective detective = new Detective("Sherlock Holmes");

        CaseFile case1 = new CaseFile("The Misterious Theft in the Museum");
        case1.addClue(new Clue("Digital printing on the display window", 8));
        case1.addClue(new Clue("VIP report found", 9));

        CaseFile case2 = new CaseFile("Disappearance in the Park");
        case2.addClue(new Clue("Footprints found in the mud\r\n", 5));
        case2.addClue(new Clue("Witness saw hooded figure", -2));

        detective.addCaseFile(case1);
        detective.addCaseFile(case2);

        detective.solveCase(case1);
        detective.solveCase(case2);
    }
}