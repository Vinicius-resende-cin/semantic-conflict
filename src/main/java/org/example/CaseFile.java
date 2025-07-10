package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Deque;
import java.util.List;

public class CaseFile {
    private String caseName;
    private List<Clue> clues;

     private float importanceFactor; // previous change

    public CaseFile(String caseName, float importanceFactor) { // previous change
        this.caseName = caseName;
        this.clues = new LinkedList<>();
        this.importanceFactor = importanceFactor; // previous change
    }

    public String getCaseName() { return caseName; }

    public void addClue(Clue clue) { this.clues.add(clue); }
    public List<Clue> getClues() { return  clues; }

    /**
     * Returns a factor describing how important it is to resolve this
     * case, i.e., how strong the evidence needs to be.
     *
     * @return The importance factor
     */
    public float getImportanceFactor() { // previous change
        return importanceFactor;
    }

    public List<Clue> cluesContaining(String text) {
        List<Clue> relevantClues = new ArrayList<>();

        for (Clue clue : clues) {
            if (clue.contains(text)) {
                relevantClues.add(clue);
            }
        }

        return relevantClues;
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
