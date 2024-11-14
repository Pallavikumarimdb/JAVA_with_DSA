
/*
ReSet the Ith bit:
1 --- 0
0 --- 0
Ans: We know if we OR any bit with 1 will give 1.

     __________    complement
n &  (1<<(n-1))

EX : 1 0 1 1 0 1 1 0  -- set 4th bit
  OR 1 1 1 1 0 1 1 1 <---- this is called a mask.
     ----------------
     1 0 1 1 0 1 1 0
     ----------------

Mask  __________    complement
      (1<<(n-1))
 */
public class ResetIthBit {
}
