package com.BinarySearch;

import java.util.Scanner;

// If in the given question array is sorted then try to apply Binary Search
public class CeilingOfaNumber {

//    Ceiling = Smallest element in array greater or equal to target
public static void main(String[] args) {
//    int[] arr={2,3,5,9,14,16,18};
//    int target = 1;

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the length of user input Array");
    int arrLen = sc.nextInt();
    int[] arr = new int[arrLen];
    System.out.println("Enter input as sorted ascending order/ descending order in the Array");
    for(int i=0; i<arrLen; i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the target element");
    int target = sc.nextInt();
    int EleFound = returnCeiling(arr, target);
    System.out.println("Ceiling Element is: "+EleFound);

}
  static int returnCeiling(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;
    boolean isAsc = arr[start]<arr[end];

    // If the target is greater than the greatest number in the  array
    if(target > arr[arr.length - 1]){
        return -1;
    }

    while(start <= end){

        int mid = start + (end-start)/2;


        if(target == arr[mid]){
            return arr[mid];
       }
//        else{
//            if(target < arr[mid] && target>arr[mid-1]){
//                return arr[mid];
//            }
//        }

        //For ascending order Array
        if(isAsc){
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target >arr[mid]){
                start = mid + 1;
            }
        }
        // For Descending order Array
        else{
            if(target > arr[mid]){
                end = mid -1;
            }
            else if(target < arr[mid]){
                start = mid +1;
            }
        }

    }
    if(isAsc){
        return arr[start];
    /* when start <= end => when while loop breaks
    start = end + 1;
    next big no, when no target found = start;
     */
    }
    else{
        return arr[end];
    }

  }

}


//Time comlexity logN
