package com.Sorting.SelectionSort;
import java.util.Arrays;
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr ={2,8,6,45,2,495, 0, -54, 63,-1,98};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selection(int[] arr){

        for(int i=0; i<arr.length; i++){
            int end=arr.length-i-1;
            int maxIndex=findMax(arr, 0, end);
            swap(arr, maxIndex, end);
        }
    }


    public static int findMax(int[] arr, int start, int end){

        int max=start;
        for(int i=start; i<=end; i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int max, int compare){
        int temp=arr[max];
        arr[max]=arr[compare];
        arr[compare]=temp;
    }
}
