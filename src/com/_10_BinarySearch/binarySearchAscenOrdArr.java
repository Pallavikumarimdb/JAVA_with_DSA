package com._10_BinarySearch;
import java.util.Scanner;

public class binarySearchAscenOrdArr {
    public static void main(String[] args) {
//        int[] array = {-18, -12, -4, -2, 0, 2, 4 , 5, 7, 8, 10, 15, 17, 22, 27, 45, 49, 88, 89, 99, 1000};
//        Enter sorted array
//        int targetEle = 49;

        // USER INPUT:

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of user input Array");
        int arrLen = sc.nextInt();
        int[] array = new int[arrLen];
        System.out.println("Enter input as sorted ascending order in the Array");
        for(int i=0; i<arrLen; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the target element, which you want to find");
        int targetEle = sc.nextInt();
        int EleFound = findIndex(array, targetEle);
        System.out.println("Element found at index no: "+EleFound);

    }
    //return the index of targer element
    static int findIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            //find mid element
//            int mid = (start + end)/2;
            // here note that Integer value has a limit and (start+end)can be cause of problem, to overcome this problem
            int mid = start + (end-start)/2;

            //BETTER WAY TO FIND MID:
            //
            // mid = (s+e)/2, this may cause exceed the int range

            //** mid = s+(s-e)/2
            //   (2s+e-s)/2
            // ***** (s+e)/2 *****

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target >arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
                //element found
            }
            // if element found then automatic loop will break due to return statement

        }
        return -1;
        // If element does not exist in array return -1.
    }

}





//EXAMPLE:-

//arr=[2,4,6,9,11,12,14,20,36,48]
//
//1). Find the middle element
//2). Target > mid => Search in the right else search in left
//3). If middle element == target element then ans

// Let our target = 36
//
//              mid = start+end/2
//
//              => 0+9/2=4 here 36 if greater than mid then search in right
//              => 5+9/2=7 here 36 is greater than 20 i.e 7index chech right
//              => 8+9/2=8 here 36 is equal to 36 i.e 8th index hence element found

//                ANS: 8

// If start > end : element not found

//IMP POINT:
//
//Total comparisons in the worst case = logN



