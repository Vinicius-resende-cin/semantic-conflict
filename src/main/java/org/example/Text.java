package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    public static String cleanText(String text) {
        return removeComments(text);
    }

    private static String removeComments(String text) {
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
        return buffer.toString();
    }

    public static String normalizeWhiteSpace(String text) {
        return text.replaceAll("\\s{2,}", " ");
    }

    public static String removeDuplicateWords(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        result.append(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!words[i].equals(words[i - 1])) {
                result.append(" ");
                result.append(words[i]);
            }
        }
        return result.toString();
    }
}
