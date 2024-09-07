package com._10_BinarySearch;

import java.util.Scanner;

public class NextGreatestLetter {

    public static void main(String[] args) {
//    int[] arr={2,3,5,9,14,16,18};
//    int target = 1;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of user input Array");
        int arrLen = sc.nextInt();
        char[] arr = new char[arrLen];
        System.out.println("Enter input as sorted ascending order in the Array");
        for(int i=0; i<arrLen; i++){
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the target element");
        char target = sc.next().charAt(0);
        char EleFound = returnCeiling(arr, target);
        System.out.println("Ceiling Element is: "+EleFound);

    }

    static char returnCeiling(char[] letters, char target) {
        int start = 0;

        int end = letters.length-1;
        if(target>=letters[letters.length-1]){
            return letters[0];
        }
        while(start <= end){
            int mid = start + (end - start)/2;

            if(letters[mid] <= target){
                start = mid + 1;
            }
            else if(letters[mid] >= target){
                end = mid - 1;
            }
        }
        System.out.println("Ceiling Element is: "+letters[start]);

        return letters[start];
    }
}


