//Input 1: 359
//Output: 3
//        5
//        59
//        359
//
//Input 2: 446
//Output: No prime combo

import java.util.ArrayList;
import java.util.Scanner;

public class PossiblePrimeNo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<Integer> list=new ArrayList<>();

        String s=String.valueOf(n);

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                list.add(Integer.valueOf((s.substring(i,j))));
            }
        }
        System.out.println(list);

        int check=0;
        for(int i=0; i<list.size(); i++){
            if(checkPrime(list.get(i))){
                check++;
                System.out.println(list.get(i));
            }
        }
        if(check==0){
            System.out.println("no prime combo");
        }
    }

    public static boolean checkPrime(int n){

        boolean check=true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return  check;
    }
}


// More Optimized Solution

//import java.util.HashSet;
//import java.util.Scanner;
//
//public class PossiblePrimeNo {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        String s = String.valueOf(n);
//        HashSet<Integer> uniqueSubstrings = new HashSet<>();
//
//        // Generate unique substrings
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j <= s.length(); j++) {
//                uniqueSubstrings.add(Integer.valueOf(s.substring(i, j)));
//            }
//        }
//
//        System.out.println("Unique Substrings: " + uniqueSubstrings);
//
//        // Check for primes
//        boolean hasPrime = false;
//        for (int num : uniqueSubstrings) {
//            if (isPrime(num)) {
//                hasPrime = true;
//                System.out.println("Prime: " + num);
//            }
//        }
//
//        if (!hasPrime) {
//            System.out.println("No prime combinations found.");
//        }
//    }
//
//    // Optimized primality check
//    public static boolean isPrime(int n) {
//        if (n < 2) return false; // Numbers less than 2 are not prime
//        if (n == 2 || n == 3) return true; // 2 and 3 are prime
//        if (n % 2 == 0 || n % 3 == 0) return false; // Eliminate multiples of 2 and 3
//
//        // Check divisors up to sqrt(n)
//        for (int i = 5; i * i <= n; i += 6) {
//            if (n % i == 0 || n % (i + 2) == 0) return false;
//        }
//        return true;
//    }
//}

