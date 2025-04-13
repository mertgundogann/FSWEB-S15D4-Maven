package org.example;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));                  // true
        System.out.println(checkForPalindrome("Racecar"));                       // true
        System.out.println(checkForPalindrome("hello"));                         // false
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?")); // true

        System.out.println(convertDecimalToBinary(5));   // 101
        System.out.println(convertDecimalToBinary(6));   // 110
        System.out.println(convertDecimalToBinary(13));  // 1101
        System.out.println(convertDecimalToBinary(0));
    }

    public static boolean checkForPalindrome(String input) {

        String filtered = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        String reversed = new StringBuilder(filtered).reverse().toString();


        return filtered.equals(reversed);
    }
    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}
