//package com.19-Recursion.Array;

public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 9, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            System.out.println("jjddddj");
            if (target >= arr[s] && target <= arr[m]) {
                System.out.println("jjjfufuf");
                return search(arr, target, s, m-1);
            } else {
                System.out.println("jjddj");
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            System.out.println("jjj");
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }
}
