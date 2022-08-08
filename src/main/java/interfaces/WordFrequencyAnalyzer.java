package interfaces;

import models.WordFrequencyClass;

import java.util.List;

public interface WordFrequencyAnalyzer {

    int calculateHighestFrequency(String text);

    int calculateFrequencyForWord(String text, String word);

    List<WordFrequencyClass> calculateMostFrequentNWords(String text, int n);
}
