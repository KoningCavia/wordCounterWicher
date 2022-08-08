package controller;

import models.WordFrequencyAnalyzerClass;

public class WordFrequencyLauncher {
    public static void main(String[] args) {

        WordFrequencyAnalyzerClass test1 = new WordFrequencyAnalyzerClass();

        String testString = "blie blie ja ja ja nee  nee nee oh ja ja oh oh";
        int i = test1.calculateHighestFrequency(testString);
        System.out.printf("The highest frequency for any word in this text is %d", i);

        String testWord = "blie";
        int j = test1.calculateFrequencyForWord(testString, testWord);
        System.out.printf("\nThe frequency for word %s is %d", testWord, j);
    }
}
