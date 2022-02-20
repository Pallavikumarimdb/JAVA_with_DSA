package com.BinarySearch;
import java.io.*;
import java.util.*;

public class InfiArray {

    public static void main(String[] args) {
        int target =2;
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};

        findRange(arr,target);
    }
    public static  void findRange(int [] arr,  int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            start=end+1;
            end = (2*start)+1;
        }
        System.out.println(start);
        System.out.println(end);
        System.out.println(binarysearch(start,end,arr,target));
    }

    public static  int binarysearch(int start, int end, int[] arr,  int target){
        while(start <= end) {
            int mid = start+(end-start)/2;
            System.out.println("mid"+mid);
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) {
                start = mid + 1;
            } else end = mid - 1;
        }
        return -1;
    }
}
