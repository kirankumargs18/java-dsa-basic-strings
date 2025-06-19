package com.kirangs;

import java.util.Scanner;

public class StringIsAPalindromeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = scanner.nextLine();
        System.out.println("is Palindrome : " + palindromeCheck(s));
    }

    /*
    Time Complexity:O(n) because the while loop iterates at most n/2 times,
    where n is the length of the string.
    Space Complexity:O(1) because the algorithm uses a constant amount of extra space.
     */
    private static boolean palindromeCheck(String s) {
        int begin = 0;
        int end = s.length() - 1;
        while (begin < end) {
            if (s.charAt(begin) != s.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}
