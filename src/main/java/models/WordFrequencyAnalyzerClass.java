package models;

import interfaces.WordFrequency;
import interfaces.WordFrequencyAnalyzer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordFrequencyAnalyzerClass implements WordFrequencyAnalyzer {
    @Override
    public int calculateHighestFrequency(String text) {
        String[] words = text.split("[^a-zA-Z']");                  // TODO should this be arraylist?

        int highestFreq = 0;

        for (String word1: words) {
            String word1Lower = word1.toLowerCase();
            int currentFreq = 0;

            for (String word2: words) {
                String word2Lower = word2.toLowerCase();
                if (word1Lower.equals(word2Lower)) {
                    currentFreq++;
                }
                if (currentFreq > highestFreq) {
                    highestFreq = currentFreq;
                }
            }
        }
        return highestFreq;
    }

    @Override
    public int calculateFrequencyForWord(String text, String word) {
        int counter = 0;
        String[] words = text.split("[^a-zA-Z']");
        String wordLower = word.toLowerCase();

        for (String textWord: words) {
            String textWordLower = textWord.toLowerCase();
            if (wordLower.equals(textWordLower)) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public List<WordFrequency> calculateMostFrequentNWords(String text, int n) {
         //String[] words = text.split("[^a-zA-Z']");
        List<String> words = List.of(text.split("[^a-zA-Z']"));
        HashMap<String, Integer> wordsHashMap = new HashMap<String, Integer>();
        List<WordFrequencyClass> requestedList = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            String wordLower = words.get(i);
            wordsHashMap.put(wordLower, i);
        }
        
        System.out.print(wordsHashMap);

        for (String word: wordsHashMap.keySet()) {
            int currentFreq = calculateFrequencyForWord(text, word);
            //wordsHashMap.put(word, currentFreq);
            requestedList.add(new WordFrequencyClass(word, currentFreq));
        }
        System.out.print("\n" + wordsHashMap);
        System.out.print("\n" + requestedList);

                            // create a list of all unique words CHECK
                            // for each word retrieve frequency (use existing method) and create object
                            // add object to list
                            // sort objects by frequency
                            // return n largest objects


        return null;
    }
}
