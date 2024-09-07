package com._13_BinarySearch2D;

import java.util.Scanner;

public class RowColSortMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }

    public static boolean retIndex(int arr[][], int target){

        int row=0;
        int col=arr.length-1;

        while(row < arr.length && col >= 0){

            if(arr[row][col]==target){
                return true;
            }
            else if(target<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
