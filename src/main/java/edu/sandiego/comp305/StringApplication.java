package edu.sandiego.comp305;

public final class StringApplication {

    private StringApplication() {
        //code
    }

    public static void main(final String[] args) {
        final String message = "Example output for StringUtils demo";

        System.out.println(message);

        final String reversed =
                StringUtils.reverseString("hello world");

        System.out.println(reversed);
    }
}