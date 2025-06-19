package com.kirangs;

import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two string of same length to check for isomorphic :");
        String s = scanner.next();
        String t = scanner.next();
        System.out.println("Are string are isomorphic : " + isomorphicString(s, t));
        scanner.close();
    }

    /*
    Time Complexity:The time complexity is O(n), where n is the length of the input strings s and t
    due to the single for loop iterating through the strings.
    Space Complexity:The space complexity is O(1) because the size of the `mapS` and `mapT` arrays are fixed at 256, regardless of the input string size.
    Thus it takes constant space.
     */
    private static boolean isomorphicString(String s, String t) {
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (mapS[s.charAt(i)] != mapT[t.charAt(i)]) {
                return false;
            }
            mapS[s.charAt(i)] = i + 1;
            mapT[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
