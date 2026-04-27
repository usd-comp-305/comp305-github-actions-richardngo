import edu.sandiego.comp305.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTests {
    private StringUtils tool;

    @BeforeEach
    void initialize(){
        tool = new StringUtils();
    }

    @Test
    void reverseString_emptyString(){
        String originalString = "";
        String reversedString = tool.reverseString(originalString);
        assertEquals(originalString, reversedString);
    }

    @Test
    void reverseString_singleLetter(){
        String originalString = "a";
        String reversedString = tool.reverseString(originalString);
        assertEquals(originalString, reversedString);
    }

    @Test
    void reverseString_twoLetter(){
        String originalString = "ab";
        String reversedString = tool.reverseString(originalString);
        String expectedString = "ba";
        assertEquals(expectedString, reversedString);
    }

    @Test
    void reverseString_threeLetter(){
        String originalString = "abc";
        String reversedString = tool.reverseString(originalString);
        String expectedString = "cba";
        assertEquals(expectedString, reversedString);
    }

}
