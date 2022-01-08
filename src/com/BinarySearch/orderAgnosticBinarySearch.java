package com.BinarySearch;

import java.util.Scanner;

public class orderAgnosticBinarySearch {

    public static void main(String[] args) {
//        int[] array = {-18, -12, -4, -2, 0, 2, 4 , 5, 7, 8, 10, 15, 17, 22, 27, 45, 49, 88, 89, 99, 1000};
//        Enter sorted array
//        int targetEle = 49;

        // USER INPUT:

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of user input Array");
        int arrLen = sc.nextInt();
        int[] array = new int[arrLen];
        System.out.println("Enter input as sorted ascending order/ descending order in the Array");
        for(int i=0; i<arrLen; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the target element, which you want to find");
        int targetEle = sc.nextInt();
        int EleFound = oabsIndexRet(array, targetEle);
        System.out.println("Element found at index no: "+EleFound);
    }
    static int oabsIndexRet(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];
//        same as below if condition..
//        boolean isAsc
//        if(arr[start] < arr[end]){
//            isAsc = true;
//        }
//        else{
//            isAsc = false;
//        }

        while(start <= end){
            //find mid element
           //int mid = (start + end)/2;
            // here note that Integer value has a limit and (start+end)can be cause of problem, to overcome this problem
            int mid = start + (end-start)/2;

            //BETTER WAY TO FIND MID:
            //
            // mid = (s+e)/2, this may cause exceed the int range

            //** mid = s+(s-e)/2
            //   (2s+e-s)/2
            // ***** (s+e)/2 *****

            if(arr[mid] == target){
                return mid;
                // if element found then automatic loop will break due to return statement
            }

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
        return -1;
        // If element does not exist in array return -1.
    }
}
