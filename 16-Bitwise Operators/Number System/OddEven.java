public class OddEven {
    public static void main(String[] args) {
        int n=67;
        System.out.println(isOdd(n));
    }

    private  static  boolean isOdd(int n){
        /*
        Ex :- 0111110010100101
        ...1*2^2+0*2^1+ /1*2^0\   ---- Hence only last part i.e LSB will be either 0 or one and will decide no will be odd or even.
                                 ---- if 0 will be added in no then even if 1 will be added then odd.
           > Other than LSB rest all will be even.

           Hence and no with 1 if it gives 1 then odd else even.

           Note :  AND any digit with one will give the same digit.
           1 0 0 1 0 1
       &   0 0 0 0 0 1
       ------------------------
           0 0 0 0 0 1    --- odd
       -----------------------------
         */
        return (n & 1) ==1;
    }
}
