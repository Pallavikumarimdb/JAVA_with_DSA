
/*
Find Ith bit of a no.

8 7 6 5 4 3 2 1
1 0 1 1 0 1 1 0
find 5th bit.

n & (1<<(n-1))

Ans: 1 0 1 1 0 1 1 0
   & 0 0 0 1 0 0 0 0 <---- this is called a mask.
     ----------------
     0 0 0 1 0 0 0 0
     ----------------
If no is n then I need to create mask with the (n-1) zeros.

How to create the mask?
Use left shift: 1 << (n-1)
1 << 4 => 10000

Hence: n & (1<<(n-1)) is ans
 */

import java.util.Scanner;

public class FindithBit {
    public static void main(String[] args) {
        int n=5;  //n th digit
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
//        int value=1235;
        int mask=1<<(n-1);

        int ans = (value & mask) == 0 ? 0 : 1;
        System.out.println(ans);

    }
}


