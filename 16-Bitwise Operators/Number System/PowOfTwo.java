
/*
Given a number. find out if its power of 2 or not.
 */

public class PowOfTwo {

    public static void main(String[] args) {

        int n=64;

//        int n = 31; // note: fix for n = 0
//        boolean ans = (n & (n-1)) == 0;

//        OR
        boolean ans=false;
        if((n&n>>1)==0){
            ans=true;
        }
        System.out.println(ans);
    }
}
