package com.kirangs;

import java.util.Arrays;
import java.util.Scanner;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class ValidAnagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings to check for valid anagrams :");
        String s = scanner.next();
        String t = scanner.next();
        System.out.println("Valid anagrams  : " + anagramStrings(s, t));
        System.out.println("Valid anagrams  : " + anagramStrings_1(s, t));
    }

    /*
    Time Complexity:O(n), where n is the length of the strings s and t,
    due to three loops that iterate through the strings and the hash table.
    Space Complexity:O(1) as the space used by the hash tables is constant,
    irrespective of the input string size.
     */
    private static boolean anagramStrings(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sHashTable = new int[26];
        int[] tHashTable = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sHashTable[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            tHashTable[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sHashTable[i] != tHashTable[i]) {
                return false;
            }
        }
        return true;
    }

    //using sorting

    /*
    Time Complexity: O(N log N) due to sorting each string.
    Space Complexity: O(1) as no additional data structures are used. Note that for Java,
    the space complexity will be O(N) due to the creation of additional character arrays.
     */
    private static boolean anagramStrings_1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        return Arrays.equals(sCharArray, tCharArray);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
