package com.company;

public class MaxSubarray {
    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long maxSum = 0;
        long curSum = 0;
        for (int i = 0; i < n; i++) {
            curSum += arr[i];
            maxSum = Math.max(curSum, maxSum);
            if (curSum < 0) curSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-2,19,-39};
        System.out.println(maxSubarraySum(arr, arr.length));
    }
}
