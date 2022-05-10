package com.Recursion.Array;

import java.util.ArrayList;

public class FindAllIndex {


    public static void main(String[] args) {
        int[] arr={1,3,23,16,34,25,65,25,123};
        findAllIndexes(arr, 0, 25);
        System.out.println("Solution 1: " + list);
        ArrayList<Integer> ans=findAllIndexes2(arr, 0, 25, new ArrayList<>());
        System.out.println("Solution 2: " + ans);

    }

    static ArrayList<Integer> list=new ArrayList<>();
    public static void findAllIndexes(int[] arr, int index, int target){

        if(index==arr.length){
            return;
        }

        if(arr[index]==target){
            list.add(index);
        }

        findAllIndexes(arr, index+1, target);
    }


//    ================================== APPROCH 2 =========================================

    public static ArrayList<Integer> findAllIndexes2(int[] arr, int index, int target,ArrayList<Integer> list1 ){

        if(index==arr.length){
            return list1;
        }

        if(arr[index]==target){
            list1.add(index);
        }

       return findAllIndexes2(arr, index+1, target, list1);
    }

}
