package com.company;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Travis on 3/20/2017.
 */
public class FindLoneInt {
    public FindLoneInt() {
        System.out.println(find(new int[]{4, 9, 95, 93, 57, 4, 57, 93, 9}));
    }
    public int find(int[] a) {
        Set<Integer> set = new HashSet<>();
        if (a.length < 3) return a[0];
        for (int e : a) {
            if (set.contains(e)) {
                set.remove(e);
            } else {
                set.add(e);
            }
        }
        return set.iterator().next();
    }
}
