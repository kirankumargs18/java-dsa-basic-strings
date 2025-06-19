package com.kirangs;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        System.out.println((int) '0');
        System.out.println((int) '9');

        System.out.println('9' - '0');

        String[] str = {"flowers", "flow", "fly", "flight"};
        Arrays.sort(str);
        for (String s : str) {
            System.out.print(s + " ");
        }
    }
}
