package com.kirangs;

import java.util.Scanner;

/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.
 */
public class RotateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two string of same length to check for isomorphic :");
        String s = scanner.next();
        String goal = scanner.next();
        System.out.println("Can be rotated  : " + rotateString(s, goal));
        scanner.close();
    }

    /*
    Time Complexity:O(n) due to the contains method, where n is the length of the strings.
    Space Complexity:O(n) due to string concatenation creating a new string of double the original length.
     */
    private static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        s = s + s;
        return s.contains(goal);
    }

    /* Time Complexity:The time complexity is O(n^2) due to the loop and string concatenation.
     Space Complexity:The space complexity is O(n) due to the substring creation.*/
    private static boolean rotateString_1(String s, String goal) {
        if (s.equals(goal)) {
            return true;
        }
        int i = 0;
        while (i < s.length()) {
            char firstChar = s.charAt(0);
            s = s.substring(1) + firstChar;
            if (s.equals(goal)) {
                return true;
            }
            i++;
        }
        return false;
    }
}
