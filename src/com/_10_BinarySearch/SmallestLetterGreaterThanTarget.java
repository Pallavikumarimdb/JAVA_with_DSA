package com._10_BinarySearch;

import java.util.Scanner;

public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = {'c','f','j'};
        char target = sc.next().charAt(0);
        System.out.println(nextGreatestLetter(arr, target));

    }


    public static char nextGreatestLetter(char[] letters, char target) {

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

        return letters[start];
    }
}
