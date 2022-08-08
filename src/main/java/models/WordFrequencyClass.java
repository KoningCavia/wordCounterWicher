package models;

import interfaces.WordFrequency;

public class WordFrequencyClass implements WordFrequency, Comparable<WordFrequencyClass> {

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
        return "\n" + word + ", " + frequency;
    }

    @Override
    public String getWord() {
        return word;
    }

    @Override
    public int getFrequency() {
        return frequency;
    }

    @Override
    public int compareTo(WordFrequencyClass o) {
        getWord().compareTo(o.getWord());

        if (getFrequency() > o.getFrequency() ) {
            return -1;
        } else if (getFrequency() == o.getFrequency()) {
            return getWord().compareTo(o.getWord());
        } else {
            return 1;
        }
    }
}
