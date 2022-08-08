package models;

import interfaces.WordFrequency;

public class WordFrequencyClass implements WordFrequency {

    private String word;
    private int frequency;


    public WordFrequencyClass(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    public WordFrequencyClass(String word) {
        this.word = word;
    }


    @Override       // TODO REMOVE
    public String toString() {
        return "word='" + word + '\'' + ", frequency=" + frequency;
    }

    @Override
    public String getWord() {
        return word;
    }

    @Override
    public int getFrequency() {
        return frequency;
    }

}
