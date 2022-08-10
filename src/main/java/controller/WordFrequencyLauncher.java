package controller;

import models.WordFrequencyAnalyzerClass;
import models.WordFrequencyClass;

public class WordFrequencyLauncher {
    public static void main(String[] args) {

        WordFrequencyAnalyzerClass test1 = new WordFrequencyAnalyzerClass();


        String testString = "blie blie ja ja ja nee nee nee oh ja ja oh oh";
        int i = test1.calculateHighestFrequency(testString);
        System.out.printf("The highest frequency for any word in this text is %d", i);

        String testWord = "blie";
        int j = test1.calculateFrequencyForWord(testString, testWord);
        System.out.printf("\nThe frequency for word %s is %d", testWord, j);

         test1.calculateMostFrequentNWords(testString, 3);

         String testString2 = "The sun shines over the lake";
         System.out.print(test1.calculateMostFrequentNWords(testString2, 3));


    }

}
