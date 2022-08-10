package models;

import interfaces.WordFrequencyAnalyzer;

import java.util.*;

public class WordFrequencyAnalyzerClass implements WordFrequencyAnalyzer{
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
    public List<WordFrequencyClass> calculateMostFrequentNWords(String text, int n) {
        List<String> words = List.of(text.split("[^a-zA-Z']"));
        HashMap<String, Integer> wordsHashMap = new HashMap<String, Integer>();
        List<WordFrequencyClass> objectList = new ArrayList<>();
        List<WordFrequencyClass> requestedList = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            String wordLower = words.get(i).toLowerCase();
            wordsHashMap.put(wordLower, i);
        }
        for (String word: wordsHashMap.keySet()) {
            int currentFreq = calculateFrequencyForWord(text, word);
            objectList.add(new WordFrequencyClass(word, currentFreq));
        }
        Collections.sort(objectList);
        for (int i = 0; i < n; i++) {
            requestedList.add(objectList.get(i));
        }
        return requestedList;
    }


}
