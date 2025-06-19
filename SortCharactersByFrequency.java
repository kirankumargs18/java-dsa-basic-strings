package com.kirangs;

import java.util.*;

/*
You are given a string s. Return the array of unique characters, sorted by highest to lowest occurring characters.

If two or more characters have same frequency then arrange them in alphabetic order.
 */
public class SortCharactersByFrequency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scanner.next();
        List<Character> frequencySortList = frequencySort(s);
        System.out.println(frequencySortList);
    }

//    Time Complexity:O(n + klogk), where n is the length of the string and k is the number of unique characters, here k is 26
//    Space Complexity:O(k), where k is the number of unique characters, here k is 26
    private static List<Character> frequencySort(String s) {
        Pair[] freqCharArray = new Pair[26];
        for (int i = 0; i < 26; i++) {
            freqCharArray[i] = new Pair(0, (char) (i + 'a'));
        }
        for (char ch : s.toCharArray()) {
            freqCharArray[ch - 'a'].freq++;
        }

        Arrays.sort(freqCharArray, (o1, o2) -> {
            if (o1 != o2) {
                return o2.freq - o1.freq;
            }
            return o2.ch - o1.ch;
        });

        List<Character> characterList = new ArrayList<>();
        for (Pair pair : freqCharArray) {
            if (pair.freq > 0) {
                characterList.add(pair.ch);
            }
        }
        return characterList;
    }

    private static void printArray(Pair[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Pair {
    int freq;
    char ch;

    Pair(int freq, char ch) {
        this.freq = freq;
        this.ch = ch;
    }

    @Override
    public String toString() {
        return ch + ":" + freq;
    }
}
