package com.company;

import java.util.List;

/**
 * Created by Travis on 2/15/2017.
 * "Almost" works. Need to tweek indexes +- 1
 */
public class QuickSort {

    public QuickSort(List<Integer> list) {
        System.out.println(this.quickSort(list));
    }

    public List<Integer> quickSort(List<Integer> list) {
        return quickSort(list, 0, list.size()-1);
    }

    public List<Integer> quickSort(List<Integer> list, int min, int max) {
        if (min >= max) return list;
        int pivot = (min + max)/2;
        int pivotVal = list.get(pivot);
        int j = max;

        for (int i = min; i < j; i++) {
            while (list.get(i) < pivotVal && i <= max) {
                i++;
            }
            while (list.get(j) > pivotVal && j >= 0) {
                j--;
            }

            swap(list, i, j);
        }

        quickSort(list, min, pivot);
        quickSort(list, pivot+1, max);

        return list;
    }

    public void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
