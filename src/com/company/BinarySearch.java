package com.company;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Travis on 2/15/2017.
 */
public class BinarySearch {
    public List<Integer> list;
    public int target;

    public BinarySearch(List<Integer> list, int target) {
        this.list = list;
        this.target = target;
        System.out.println(this.search());
        System.out.println(this.iterSearch());
    }

    public boolean search() {
        return search(0, list.size());
    }

    private boolean search(int min, int max) {
        if (min > max) return false;

        int mid = (min+max)/2;
        int midValue = list.get(mid);
        if (target == midValue) return true;

        if (target < midValue) {
            return search(min, mid-1);
        } else {
            return search(mid+1, max);
        }
    }

    public boolean iterSearch() {
        int min = 0;
        int max = list.size()-1;

        while (min <= max) {
            int mid = (min + max)/2;
            int midValue = list.get(mid);
            if (target == midValue) return true;

            if (target < midValue) {
                max = mid-1;
            } else {
                min = mid+1;
            }
        }

        return false;
    }
}
