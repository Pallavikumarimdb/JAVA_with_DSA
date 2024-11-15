
/*
Find the nth magic number.
Check description of magic no in notes pdf
 */

public class MagicNumber {
    public static void main(String[] args) {
        int n=5;

        int ans=0;

        int base=5;   // hare base can be acc. to need of question

        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last*base;
            base=base*5;
        }

        System.out.println(ans);

    }

}
