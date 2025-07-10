package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class CaseFile {
    private String caseName;
    private List<Clue> clues;

    public CaseFile(String caseName) {
        this.caseName = caseName;
        this.clues = new LinkedList<>();
    }

    public String getCaseName() { return caseName; }

    public void addClue(Clue clue) { this.clues.add(clue); }
    public List<Clue> getClues() { return  clues; }

    public List<Clue> cluesContaining(String text) {
        return clues.stream().filter(clue -> clue.contains(text)).collect(Collectors.toList()); // current change
    }

    public Clue getMostSignificantClue() {
        Clue mostSignificantClue = null;
        int maxSignificance = -1;

        for (Clue clue : clues) {
            if (clue.getSignificance() > maxSignificance) {
                mostSignificantClue = clue;
                maxSignificance = clue.getSignificance();
            }
        }

        return mostSignificantClue;
    }
}
