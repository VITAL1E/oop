package com.vitalik;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class TextParser {
    
    public int wordCount(String data) {

        String trim = data.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s+").length;
    }


    public int sentenceCount(String data) {

        String SENTENCE_DELIMETERS = "[!?.:]";
        int sentenceCount = 0;
        int lastIndex = 0;
        for (int i = 0; i < data.length(); i++) {
            for (int j = 0; j < SENTENCE_DELIMETERS.length(); j++) {
                if (data.charAt(i) == SENTENCE_DELIMETERS.charAt(j)) {
                    if (lastIndex != i - 1){
                        sentenceCount++;
                    }
                    lastIndex = i;
                }
            }
        }
        return sentenceCount;
    }


    public int letterCount(String data) {

        int charCount = 0;
        char temp;

        for (int i = 0; i < data.length(); i++) {
            temp = data.charAt(i);
            if (temp != ' ')
                charCount++;
        }
        return charCount;
    }


    public void getMostFrequentWords(BufferedReader reader) throws IOException {

        Map<String, Integer> frequency = new HashMap<>();
        String line = reader.readLine();
        System.out.println();
        System.out.println("Most frequently used words are");

        while (line != null) {
            if (!line.trim().equals("")) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word == null || word.trim().equals("")) {
                        continue;
                    }
                    String processed = word.toLowerCase();

                    if (frequency.containsKey(processed)) {
                        frequency.put(processed, frequency.get(processed) + 1);
                    } else {
                        frequency.put(processed, 1);
                    }
                }
            }
            line = reader.readLine();
        }
        frequency.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                )).forEach((s, integer) -> System.out.println(String.format("%s : %s times", s, integer)));
    }


    public void checkVowels(String text) {

        System.out.println("Number of vowels is " + (text.length() - text.toLowerCase().replaceAll("a|e|i|o|u|", "").length()));
        // Also eliminating spaces, if any for the consonant count
        System.out.println("Number of consonants is " + (text.toLowerCase().replaceAll("a|e|i|o| |u", "").length()));
    }
}
