package com._10_BinarySearch;
public class TwoSumIIInputArrayIsSorted{
    public static void main(String[] args) {
        int a[]={1,2,2,5};
        int target=4;
        int[] arr=twoSum(a,target);
        System.out.println("["+arr[0]+" "+arr[1]+"]");

        
    }
    public static int[] twoSum(int[] number, int target) {

        int start=0;
        int end=number.length-1;
        int[] arr=new int[2];
        while(start<end){

            int mid=start+(end-start)/2;
            if(number[start]+number[end]==target){            
                arr[0]=start+1;
                arr[1]=end+1;
                return arr;
            }
           
            else if(number[start]+number[end]>target){
                end=end-1;
            }else if(number[start]+number[end]<target){
                start=start+1;
            }
        

        }
        return arr;
    }

}