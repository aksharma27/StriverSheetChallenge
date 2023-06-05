package com.company;

public class MaxSubarraySum {
    public static int findMajority(int[] arr, int n) {
        // Write your code here.
        int c= 0;
        int el = 0;
        for (int i = 0; i < n; i++) {
            if (c == 0) {
                c = 1;
                el = arr[i];
            }
            else if (el == arr[i]) c++;
            else c--;
        }
        int v = 0;
        for (int i = 0; i < n; i++) {
            if (el == arr[i]) v++;
        }
        if (v > n / 2) return el;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7,7,7,7,7,7,4,52,3,4};
        System.out.println(findMajority(arr, arr.length));
    }
}
