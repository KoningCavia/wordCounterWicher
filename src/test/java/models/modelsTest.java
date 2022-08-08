package models;


//import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class modelsTest {

    WordFrequencyClass testWordFrequencyClass = new WordFrequencyClass();
    WordFrequencyAnalyzerClass testWordFrequencyAnalyzerClass = new WordFrequencyAnalyzerClass();

    String testString = "blie blie ja ja ja nee nee nee nee oh ja ja oh oh";

    @Test
    @DisplayName("Tests whether the highest frequency word in a text is found")
    void testCalculateHighestFrequency() {
        int testFrequency = testWordFrequencyAnalyzerClass.calculateHighestFrequency(testString);
        assertEquals(5, testFrequency, "The highest frequency should be 5, but is not 5. " +
                "The wrong number was retrieved");
    }

    @Test
    @DisplayName("Tests whether the frequency is found for a given word")
    void testCalculateFrequencyForWord() {
        int testFrequency = testWordFrequencyAnalyzerClass.calculateFrequencyForWord(testString, "blie");
        assertEquals(2, testFrequency, "The frequency for word 'blie' should be 2, " +
                "but a different value is returned" );
    }
}

