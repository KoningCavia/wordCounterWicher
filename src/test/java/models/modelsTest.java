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
    @DisplayName("Tests whether the right frequency is found")
    void testCalculateHighestFrequency() {
        int testFrequency =testWordFrequencyAnalyzerClass.calculateHighestFrequency(testString);
        assertEquals(5, testFrequency, "The highest frequency should be 5, but is not 5. " +
                "The wrong number was retrievede" );
    }
}
