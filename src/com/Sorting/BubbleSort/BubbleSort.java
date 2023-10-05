package com.Sorting.BubbleSort;

import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubble(int[] nums){

         boolean b;
        for(int i=0; i<nums.length; i++){
            b=false;
            for(int j=1; j<nums.length-i; j++){

                if(nums[j]<nums[j-1]) {
                    int temp = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    b=true;
                }
            }
            // If no swap is occuring in one complete round for 'j' then array is alredy sorted
            if(!b){
                break;
            }
        }
    }
}
