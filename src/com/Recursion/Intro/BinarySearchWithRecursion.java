package com.Recursion.Intro;

public class BinarySearchWithRecursion {

    public static void main(String[] args) {
        int[] arr = {2,3,7,8,10,20, 23, 25, 45, 67, 87, 100, 150, 197, 205};
        System.out.println(binarySearch(arr, 7, 0, arr.length-1));
    }

    public static int binarySearch(int[] arr, int target, int s, int e){

        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(target < arr[mid]){
            return binarySearch(arr, target, s, mid - 1);
        }

        return binarySearch(arr, target, mid+1, e);

    }
}
