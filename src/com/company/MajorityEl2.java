package com.company;

import java.util.ArrayList;

public class MajorityEl2 {
    public static void main(String[] args) {
         int[] arr = {3,2,2,1,5,2,3};
        System.out.println(majElement(arr));
    }
    static ArrayList majElement (int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int el1 = 0;
        int el2 = 0;
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (c1 == 0 && el2 != arr[i]) {
                c1 = 1;
                el1 = arr[i];
            }
            else if (c2 == 0 && el1 != arr[i]) {
                c2 = 1;
                el2 = arr[i];
            }
            else if (el1 == arr[i]) c1++;
            else if (el2 == arr[i]) c2++;
            else {
                c1--;
                c2--;
            }
        }

        int v1 = 0, v2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (el1 == arr[i]) v1++;
            if (el2 == arr[i]) v2++;
        }
        if (v1 > arr.length / 3) list.add(el1);
        if (v2 > arr.length / 3) list.add(el2);
        return list;
    }
}
