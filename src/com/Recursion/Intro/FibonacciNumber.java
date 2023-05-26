package com.Recursion.Intro;
// step 1:
// when you write recursio in terms of formula or when we write a problem as experssion is called reccurence relation
// febo(n) = febo(n-1) + febo(n-2) // this is known as reccurence relation

// step 2:
// Fegure out recursive tree
// Break it down into smaller problem
// Fibonacci Number : It is the example of linear recurrence relation

public class FibonacciNumber {
    public static void main(String[] args) {

        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int n){
        //
        // Base condition
//        if(n<2){
//            return n;
//        }
        if(n==0 || n==1){
            return n;
        }
        else{
            // This is not tail recursion call because of two extra step in this, it is not last fn call
            // first fibonacci(n-1) will give answer then fibonacci(n-2) will give answer the at last fibonacci(n-1)+fibonacci(n-2) will give answer
            return fibonacci(n-1)+fibonacci(n-2);
        }

    }

}
