package com.Recursion.Level_1;

public class CountZeroInANum {

    public static void main(String[] args) {
        System.out.println(countZero(2030100200));
    }

    public static int countZero(int num){

        int rem=num%10;
        int count=0;
//        if(rem==num ){
//            System.out.println(rem);
//            if(rem==0){
//                return 1;
//            }else{
//                return 0;
//            }
//        }

        if(num==0){
            return count;
        }


        if(rem%10==0){
            count++;
        }

        return count+countZero(num/10);

    }


//=====================================  SOLUTION 2  =====================================================


//    static int countZero(int n) {
//        return helper(n, 0);
//    }
//
//    // special pattern, how to pass a value to above calls
//    private static int helper(int n, int c) {
//        if (n == 0) {
//            return c;
//        }
//
//        int rem = n % 10;
//        if (rem == 0) {
//            return helper(n/10, c+1);
//        }
//        return helper(n/10, c);
//    }



}
