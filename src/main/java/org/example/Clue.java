package org.example;

public class Clue {
    private String description;
    private int significance;

    public Clue(String description, int significance) {
        this.description = description;
        this.significance = significance;
    }

    /** Textual description of the {@link Clue} */
    public String getDescription() { return description; }
    /** Significance of the clue between 0 (Insignificant) and 10 (Very Significant) */
    public int getSignificance() { return significance; }

    /**
     * Determines whether this {@link Clue} contains the given text in its
     * description.
     *
     * @param text The text to look for
     * @return True iff the text is in this {@link Clue Clues} description
     */
    public boolean contains(String text) {
        return description.contains(text);
    }

    // current change
    /**
     * Returns whether this {@link Clue} is insignificant, i.e., its significance is zero.
     *
     * @return Whether this {@link Clue} is insignificant
     */
    public boolean isInsignificant() {
        return significance <= 0;
    }
}