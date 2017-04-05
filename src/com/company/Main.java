package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<Integer> sorted = Arrays.asList(0, 3, 5, 6, 7, 8, 14, 15, 18, 20, 22, 25, 30, 35, 50);
    private static List<Integer> unsorted = Arrays.asList(8, 3, 1, 7, 0, 9, 30, 20, 10, 15, 22, 99, 45, 34, 2, 6, 98, 39);

    public static void main(String[] args) {
        new BinarySearch(sorted, 8);
        new QuickSort(new ArrayList<>(unsorted));
        new Fib(10);
        new ReverseString("Hello World!");
        new StringReplace();
        new FindLoneInt();
    }
}
