//package com.Sorting.BubbleSort;

import java.util.*;

/* Bubble Sort: In every step you are sorting adjacent element.
          step 1: check index element 1 and 2 if 1>2 then swap it. Then move ahead.

    WHY ?  : With the first pass through the array, the largest element come
              to thr end.

    NOTE :  This is also known as sinking sort or exchange sort.

    Space Complexity: O(1)  // constant - no extra space required i.e copying the array, etc. not required.
     aka "inplace sorting algorithm".

     Time complexity : Best Case : O(N) => Array is  Already Sorted   (Actually it is N-1 comparison but here constant are ignored)
                       Worst Case : O(N^2) => Sorted in opposite
                                       ^
                                       |
                                       No of comparison

      Note  : As the size of array is growing, the no. of comparison is also growing.
      >> Bubble Sort is a stable sorting algorithm
*/

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
