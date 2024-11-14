package com.Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr ={4,3,1,5,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctPos=arr[i]-1;
            if(arr[i]!=arr[correctPos]){
                swap(arr, i, correctPos);
            }
            else{
                i++;
            }
        }

    }

    public static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
