package com.kirangs;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = scanner.nextInt();
        String[] str = new String[n];
        System.out.println("Enter " + n + " strings : ");
        for (int i = 0; i <= n - 1; i++) {
            str[i] = scanner.next();
        }
        System.out.println("Longest Common Prefix : " + longestCommonPrefix(str));

    }

    //Using Sorting (dictionary)

    /*
    Time Complexity:O(n log n + m), where n is the number of strings and m is the length of the shortest string.
    Space Complexity:O(1) excluding the space used by the input array, as sorting is done in place.
     */
    private static String longestCommonPrefix(String[] str) {
        if (str.length == 1) {
            return str[0];
        }
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        String commonPrefixStr = "";
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            commonPrefixStr += first.charAt(i);
        }
        return commonPrefixStr;
    }

    /*  Time Complexity:O(n*m*k), where n is the number of strings,
        m is the length of the shortest string, and k is the average length of the strings.
      Space Complexity:O(1), excluding the input array.*/
    private static String longestCommonPrefix_1(String[] str) {
        String commonPrefixStr = getMinimumLengthStr(str);
        int intialLength = commonPrefixStr.length();
        for (int i = 0; i < intialLength; i++) {
            boolean isCommonPrefix = true;
            for (String string : str) {
                if (!string.startsWith(commonPrefixStr)) {
                    isCommonPrefix = false;
                    break;
                }
            }
            if (isCommonPrefix) {
                return commonPrefixStr;
            }
            commonPrefixStr = commonPrefixStr.substring(0, commonPrefixStr.length() - 1);
        }
        return "";
    }

    private static String getMinimumLengthStr(String[] str) {
        String minLengthStr = str[0];
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() < minLengthStr.length()) {
                minLengthStr = str[i];
            }
        }
        return minLengthStr;
    }
}
