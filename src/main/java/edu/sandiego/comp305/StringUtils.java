package edu.sandiego.comp305;

public class StringUtils {
    public String reverseString(final String originalString) {

        if (originalString.isEmpty()) {
            return "";
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
