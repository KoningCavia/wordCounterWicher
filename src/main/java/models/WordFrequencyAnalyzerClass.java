package models;

import interfaces.WordFrequency;
import interfaces.WordFrequencyAnalyzer;

import java.util.List;

public class WordFrequencyAnalyzerClass implements WordFrequencyAnalyzer {
    @Override
    public int calculateHighestFrequency(String text) {
        return 0;
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
