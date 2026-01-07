package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    private String text;

    Text(String newText) {
        text = newText;
    }

    public String getText() {
        return text;
    }

    public void cleanText() {
        normalizeWhiteSpace();
        removeComments();
        removeDuplicateWords();
    }

    private void removeComments() {
        String pattern = "(\".*?\"|'.*?')|(/\\*.*?\\*/|//.*?$)";
        Pattern regex = Pattern.compile(pattern, Pattern.MULTILINE | Pattern.DOTALL);
        Matcher matcher = regex.matcher(text);
        StringBuffer buffer = new StringBuffer();
        while (matcher.find()) {
            if (matcher.group(1) != null) {
                matcher.appendReplacement(buffer, matcher.group(1));
            } else {
                matcher.appendReplacement(buffer, "");
            }
        }
        matcher.appendTail(buffer);
        text = buffer.toString();
    }

    public void normalizeWhiteSpace() {
        text = text.replaceAll("\\s{2,}", " ");
    }

    public void removeDuplicateWords() {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!words[i].equals(words[i - 1])) {
                result.append(" ");
                result.append(words[i]);
            }
        }
        text = result.toString();
    }
}
