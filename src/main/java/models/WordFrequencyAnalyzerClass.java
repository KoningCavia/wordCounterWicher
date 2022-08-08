package models;

import interfaces.WordFrequency;
import interfaces.WordFrequencyAnalyzer;

import java.util.List;

public class WordFrequencyAnalyzerClass implements WordFrequencyAnalyzer {
    @Override
    public int calculateHighestFrequency(String text) {
        String[] words = text.split("[^a-zA-Z']");                  // TODO should this be arraylist?

        int highestFreq = 0;
        int currentFreq;

        for (String word1: words) {
            String word1Lower = word1.toLowerCase();
            currentFreq = 0;

            for (String word2: words) {
                String word2Lower = word2.toLowerCase();

                if (word1Lower.equals(word2Lower)) {
                    currentFreq++;
                };
                if (currentFreq > highestFreq) {
                    highestFreq = currentFreq;
                };
            }
        }

        return highestFreq;
    }

    @Override
    public int calculateFrequencyForWord(String text, String word) {
        return 0;
    }

    @Override
    public List<WordFrequency> calculateMostFrequentNWords(String text, int n) {
        return null;
    }
}
