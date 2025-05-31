package org.example;
import java.util.ArrayList;
import java.util.List;

public class Detective {
    private String name;
    private List<CaseFile> caseFiles;

    public Detective(String name) {
        this.name = name;
        this.caseFiles = new ArrayList<>();
    }

    public void addCaseFile(CaseFile caseFile) {
        this.caseFiles.add(caseFile);
    }

    public void solveCase(CaseFile caseFile) {
        String caseName = caseFile.getCaseName();
        System.out.println("Detective " + name + " is solving case: " + caseName);

        List<Clue> clues = caseFile.getClues();
        float averageSignificance;

        if (clues.isEmpty()) {
            averageSignificance = 0;
        } else {
            int totalSignificance = 0;

            for (Clue clue : clues) {
                totalSignificance += clue.getSignificance();
            }

            averageSignificance =  (float) totalSignificance / clues.size();
        }

        final float SIGNIFICANCE_THRESHOLD = 7.0f;

        if (averageSignificance >= SIGNIFICANCE_THRESHOLD) {
            System.out.println("The case \"" + caseName + "\" is considered solved with an average significance of: " + averageSignificance);
            caseFiles.remove(caseFile);
        } else {
            System.out.println("The case \"" + caseName + "\" is not yet solved. Average significance: " + averageSignificance);
        }

        Clue mostSigClue = caseFile.getMostSignificantClue();
        if (mostSigClue != null) {
            System.out.println("Most Significant Clue Description: " + mostSigClue.getDescription());
            System.out.println("Most Significant Clue Weight: " + mostSigClue.getSignificance());
        } else {
            System.out.println("No clues available to solve the case.");
        }

        boolean found = findKeywordInCases("VIP");
        if (found) {
            System.out.println("Detective " + name + " still has a VIP case assigned");
        }
    }

    public boolean findKeywordInCases(String keyword) {
        for (CaseFile caseFile : caseFiles) {
            if (!caseFile.cluesContaining(keyword).isEmpty()) {
                return true;
            }
        }
        return false;
    }
}