package com.qingfeng.algorithm.order.insert;

import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class DirectInsertSort {
    /**
     * @param array
     */
    public static void insertSort(int[] array) {
        int i, j;
        for (i = 1; i < array.length; i++)
            if (array[i] < array[i - 1]) {
                array[0] = array[i];
                for (j = i - 1; array[0] < array[j]; j--)
                    array[j + 1] = array[j];
                array[j + 1] = array[0];
            }


    }

    public static void main(String[] args) {
        int[] array = {45, 360, 89, 25, 1, 36, 85, 74, 23};
        insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
