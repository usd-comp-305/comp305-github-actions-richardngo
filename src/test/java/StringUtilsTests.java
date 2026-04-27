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
        final String originalString = "";
        final String reversedString = tool.reverseString(originalString);

        assertEquals(originalString, reversedString);
    }

    @Test
    void reverseString_singleLetter(){
        final String originalString = "a";
        final String reversedString = tool.reverseString(originalString);

        assertEquals(originalString, reversedString);
    }

    @Test
    void reverseString_twoLetter(){
        final String originalString = "ab";
        final String reversedString = tool.reverseString(originalString);
        final String expectedString = "ba";

        assertEquals(expectedString, reversedString);
    }

    @Test
    void reverseString_threeLetter(){
        final String originalString = "abc";
        final String reversedString = tool.reverseString(originalString);
        final String expectedString = "cba";

        assertEquals(expectedString, reversedString);
    }

}
