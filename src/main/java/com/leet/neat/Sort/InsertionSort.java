package com.leet.neat.Sort;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort insertionSort=new InsertionSort();
        int[] arr=new int[]{2,5,3,1,0,4};
        System.out.println(insertionSort.sortIt(arr));
    }

    int[] sortIt(int[] data) {

        for (int i = 1; i < data.length; i++) {
            int temp = data[1];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j] = data[j + 1];
            }
            data[j] = temp;
        }
        return data;
    }
}
