package edu.sandiego.comp305;

public class StringUtils {

    private StringUtils() {
        //code
    }

    public static String reverseString(final String originalString) {

        if (originalString == null || originalString.length() < 2) {
            return originalString;
        }

        final char[] characters = originalString.toCharArray();
        int leftIndex = 0;
        int rightIndex = characters.length - 1;

        while (leftIndex < rightIndex){
            final char tempCharacter = characters[leftIndex];
            characters[leftIndex] = characters[rightIndex];
            characters[rightIndex] = tempCharacter;
            leftIndex++;
            rightIndex--;
        }

        return new String(characters);
    }
}
