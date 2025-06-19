package com.kirangs;

import java.util.Scanner;

public class LargestOddNumberInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = scanner.nextLine();
        System.out.println("Largest Odd Number in the input string : " + largeOddNum(s));
    }

    /*
    Time Complexity:O(n): The code iterates through the string 's' at most twice,
    once from the end to find the rightmost odd digit,
    and potentially once from the beginning to find the first non-zero element,
    both of which are bounded by the length of the string.
    Space Complexity:O(1): The code uses a constant amount of extra space, regardless of the input size.
     */
    private static String largeOddNum(String s) {
        int j = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 != 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return "";
        }
        int i = 0;
        while (i <= j) {
            if (s.charAt(i) != '0') {
                return s.substring(i, j + 1);
            }
            i++;
        }
        return "";
    }
}
