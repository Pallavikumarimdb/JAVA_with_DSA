
/*
Set the Ith bit: tern it to 1
Ans: We know if we OR any bit with 1 will give 1.

n OR (1<<(n-1))

EX : 1 0 1 1 0 1 1 0  -- set 4th bit
  OR 0 0 0 0 1 0 0 0 <---- this is called a mask.
     ----------------
     1 0 1 1 1 1 1 0
     ----------------

 */

public class SetIthBit {
}
