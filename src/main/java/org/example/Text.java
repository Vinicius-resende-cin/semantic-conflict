package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    String text;

    Text(String t) {
        this.text = t;
    }

    public String getText() {
        return this.text;
    }

    public void cleanText() {
        removeComments();
    }

    private void removeComments() {
        this.text = this.text.lines().filter(line -> !line.startsWith("//")).reduce("", String::concat);
    }
}
