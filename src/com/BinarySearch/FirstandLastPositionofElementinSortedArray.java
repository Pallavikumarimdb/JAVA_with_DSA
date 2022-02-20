package com.BinarySearch;

import java.util.Scanner;

public class FirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
//    int[] arr={2,3,5,9,14,16,18};
//    int target = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of user input Array");
        int arrLen = sc.nextInt();
        int[] arrMain = new int[arrLen];
        System.out.println("Enter input as sorted ascending order in the Array");
        for (int i = 0; i < arrLen; i++) {
            arrMain[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int[] finArr=searchRange(arrMain, target);
        for(int arr:finArr){
            System.out.println(arr);
        }
    }



    public static int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};

        int start = 0;
        int end =nums.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                if(mid==0 || (mid!=0 && nums[mid-1]!=target)){
                    arr[0]=mid;
                    break;
                }
                else if(mid!=0 && nums[mid-1]==target){
                    end=mid-1;
                }
            }

            else if(nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }

        }

        start=0;
        end=nums.length-1;
        while(start<=end){

            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                if(mid==nums.length-1 || (mid!=nums.length-1 && nums[mid+1]!=target)){
                    arr[1]=mid;
                    break;
                }
                else if(mid!=nums.length-1 && nums[mid+1]==target){
                    start=mid+1;
                }
            }

            else if(nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }

        }

        return arr;
    }
}
