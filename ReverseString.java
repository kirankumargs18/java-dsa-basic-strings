package com.kirangs;

import java.util.Scanner;
import java.util.Vector;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string : ");
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
        Vector<Character> s = new Vector<>(charArray.length);
        for (char c : charArray) {
            s.add(c);
        }
        System.out.println("Before reverse : " + s);
        reverseString(s);
        System.out.println("After reverse : " + s);

    }

    //    Time Complexity:O(n), where n is the size of the input vector,
    //    due to the while loop iterating up to n/2 times, and constant time swap operations.
    //    Space Complexity:O(1), as the algorithm uses only a constant amount of extra space for variables like begin,
    //    end, and temp, irrespective of the input size.
    private static void reverseString(Vector<Character> s) {
        int begin = 0;
        int end = s.size() - 1;
        while (begin < end) {
            swap(s, begin, end);
            begin++;
            end--;
        }
    }

    private static void swap(Vector<Character> s, int begin, int end) {
        char temp = s.get(begin);
        s.set(begin, s.get(end));
        s.set(end, temp);
    }
}
