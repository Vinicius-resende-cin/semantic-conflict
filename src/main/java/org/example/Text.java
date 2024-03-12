package org.example;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Text {
    String text;

    Text(String t) {
        this.text = t;
    }

    public String getText() {
        return this.text;
    }

    public void cleanText() {
        normalizeWhiteSpaces();
        removeComments();
        removeDuplicateWords();
    }

    private void removeComments() {
        this.text = this.text.lines().filter(line -> !line.startsWith("//")).reduce("", String::concat);
    }

    private void normalizeWhiteSpaces() {
        this.text = this.text.replaceAll(" +", " ");
    }

    private void removeDuplicateWords() {
        String regex = "\\b(\\w+)((?:\\W+\\1\\b)+)";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(this.text);

        while (m.find()) {
            this.text = this.text.replaceAll(m.group(), m.group(2));
        }
    }
}
