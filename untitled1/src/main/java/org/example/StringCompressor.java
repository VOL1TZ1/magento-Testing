package org.example;

import org.jetbrains.annotations.NotNull;

public class StringCompressor {
    public static String compress(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                result.append(input.charAt(i));
                if (count > 1) {
                    result.append(count);
                }
                count = 1;
            }
        }
        result.append(input.charAt(input.length() - 1));
        if (count > 1) {
            result.append(count);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbcdddsssedd";
        String compressed = compress(input);
        System.out.println("Compressed string: " + compressed);
    }
}