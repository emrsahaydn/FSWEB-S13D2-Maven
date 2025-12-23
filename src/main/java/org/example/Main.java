package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        int absoluteNumber = Math.abs(number);
        int originalNumber = absoluteNumber;
        int reverseNumber = 0;

        while (absoluteNumber > 0) {
            int lastDigit = absoluteNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            absoluteNumber /= 10;
        }

        return originalNumber == reverseNumber;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) return false;

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for (char digit : numStr.toCharArray()) {
            result.append(words[Character.getNumericValue(digit)]).append(" ");
        }

        return result.toString().trim();
    }
}


