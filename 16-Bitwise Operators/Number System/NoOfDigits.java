/*
find no of digits in base b.
 */
public class NoOfDigits {
    public static void main(String[] args) {
        int n=6;
        int base=2;
        forBase2(n);
        forBaseb(n, base);
    }

    static void forBase2(int n){
        int count=0;

        while(n>0){
            n=n>>1;
            count++;
        }
        System.out.println(count);
    }

    static void forBaseb(int n, int b){
        // Here we need to apply formula, check notes for reference

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;

        System.out.println(ans);


    }
}
