package com.Recursion.Array;

import java.util.ArrayList;

public class FindAllIndex {


    public static void main(String[] args) {
        int[] arr={1,3,23,16,34,25,65,25,123};
        findAllIndexes(arr, 0, 25);
        System.out.println(list);
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

}
