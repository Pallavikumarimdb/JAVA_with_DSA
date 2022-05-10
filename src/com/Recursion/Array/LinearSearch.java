package com.Recursion.Array;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr={1,3,23,16,34,25,65,25,123};
        System.out.println(find(arr, 0, 25));
        System.out.println(findElements(arr, 0, 25));
        System.out.println(findElementsFromLastIndex(arr, arr.length-1, 25));
    }


    public static int findElements(int[] arr, int index, int target){

        if(index==arr.length){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }

        return findElements(arr, index+1, target);
    }


    public static int findElementsFromLastIndex(int[] arr, int index, int target){

        if(index==-1){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }

        return findElements(arr, index-1, target);
    }


    public static boolean find(int[] arr, int index, int target){
        if(index==arr.length){
            return false;
        }

        return arr[index]==target || find(arr, index+1, target);
    }

}
