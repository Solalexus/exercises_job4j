package ru.job4j.array;

import java.util.StringJoiner;

public class WordsToText {
    public static String convert(String[] words) {
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < words.length; i++) {
            sj.add(words[i]);
        }
        return sj.toString();
    }
}
