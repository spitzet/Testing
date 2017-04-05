package com.company;

/**
 * Created by Travis on 2/16/2017.
 */
public class ReverseString {
    public ReverseString(String str) {
        System.out.println(reverse(str));
        System.out.println(revWords(str));
    }

    public String reverse(String str) {
        if (str.length() == 0) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public String revWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        int j = words.length-1;
        for (int i = 0; i < words.length; i++) {
            result.append(words[j] + " ");
            j--;
        }
        return result.toString();
    }
}
