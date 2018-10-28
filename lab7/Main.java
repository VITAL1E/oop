package com.vitalik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.*;

public class Main {


    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void main(String[] args) throws Exception {

        FileReader myFileReader = new FileReader("C:\\Users\\Vitalie\\IdeaProjects\\project-1\\src\\com\\vitalik\\text.txt");
        BufferedReader reader = new BufferedReader(myFileReader);

        String data = readFileAsString("C:\\Users\\Vitalie\\IdeaProjects\\project-1\\src\\com\\vitalik\\text.txt");
        System.out.println(data);

        TextParser text = new TextParser();

        System.out.println("Number of words is " + text.wordCount(data));
        System.out.println("Number of letters is " + text.letterCount(data));
        System.out.println("Number of sentences is " + text.sentenceCount(data));
        text.checkVowels(data);
        text.getMostFrequentWords(reader);
    }
}
