package com.company;

/**
 * Created by Travis on 2/16/2017.
 */
public class Fib {

    public Fib(int n) {
        System.out.println(fib(n));
        System.out.println(fib(n, new int[n+1]));
        System.out.println(fibIter(n));
    }

    public int fib(int n) {
        if (n == 0 || n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }

    public int fib(int n, int[] table) {
        if (n == 0 || n == 1) return 1;
        if (table[n] != 0) return table[n];
        else {
            table[n-1] = fib(n - 1, table);
            table[n-2] = fib(n - 2, table);
            return table[n-1] + table[n-2];
        }
    }

    public int fibIter(int n) {
        int[] table = new int[n+1];
        table[0] = 1;
        table[1] = 1;
        int total = 2;

        for (int i = 2; i < n+1; i++) {
            table[i] = table[i-1] + table[i-2];
        }

        return table[n];
    }
}
