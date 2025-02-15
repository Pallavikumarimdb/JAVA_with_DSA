<h1 align="center">Hashing:</h1>

Given an array of integers: [1, 2, 1, 3, 2] and we are given some queries: [1, 3, 4, 2, 10]. For each query, we need to find out how many times the number appears in the array. For example, if the query is 1 our answer would be 2, and if the query is 4 the answer will be 0. 

> Brute Force approach:

> As we have learned the ‘for loop’, the first approach that should come to our mind is to use it to solve this problem. For each query, we will iterate over the array using a loop. We will count the number of times the query number appears in that array i.e. increment the counter variable if the array element at that index equals the query number. 

> Now, for each query, we will call the function and it will return the number of times the given query appears in the array. 


### Time Complexity analysis of the function:

> The above function contains a for loop that runs for N times. So, the time complexity of the function will be O(N) ignoring the other constant operations. 

> Now, for each query, we are calling this function. So, if the query contains 5 numbers and we call the function 5 times, the total time complexity will be O(5*N). If the number of queries is Q, the time complexity will be O(Q*N). 

> Now, if the length of the query becomes large like 105 and the array size also becomes large like 105, the time complexity will be O(1010).

> We know from our previous knowledge that 108 operations take 1 second to get executed. So, 1010 operations will take around 100 seconds(1010/108). We cannot say a code is good if it takes 100 seconds to get executed.


### Optimized approach using Hashing:
Definition of Hashing:

In order to optimize this approach, we need to use hashing. If we say the definition of hashing in a naive way, it is nothing but the combination of the steps, pre-storing, and fetching.

Now, let’s understand how to solve the given problem using the two steps:
Assumption: We are assuming that the maximum element in the given array can be 12.

> Step 1 - Pre-storing: In this step, we will create an array(named hash array) of size 13(so that we can get the index 12) initialized with 0. In this hash array, we are going to store the frequency of each element(i.e. The number of times each element appears in the array) of the given array. To do so, we will iterate over the given array, and for each element arr[i], we will do hash[arr[i]] += 1. After completing this process the hash array will look like the following:


This step is named pre-storing as we are pre-calculating the information about the element of the array before answering the queries.

> Step 2 - Fetching: In this step, we will select each query i.e. the number and for the query, we will just fetch the value of hash[number] and return it instead of running a ‘for loop’ every time. 

The implementation is given below:

```java


import java.util.*;

class tUf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            // fetching:
            System.out.println(hash[number]);
        }
    }
}

Input: 

5
1 3 2 1 3
5
1 4 2 3 12

Output: 

2
0
1
2
0


```


### Point to remember:

We may encounter a problem where the maximum array element may be very large like 109. In that case, theoretically, we should declare an array of size 109+1. But we cannot do so. The maximum size of an array can be the following:

#### Note: So, with this method, we can solve the problems where the array is within a specific size. We are going to discuss later in the article, how we can overcome this limitation of the specific size.




### Character Hashing:

Given the string: “abcdabefc” we are given some queries: [a, c, z]. For each query, we need to find out how many times the character appears in the string. For example, if the query is ‘a’ our answer would be 2, and if the query is ‘z’ the answer will be 0. 

Similarly, the following will be the answers to the given queries:

Brute Force approach:

> It is similar to the previous problem. Here, for each query, we will iterate over the string using a for loop and will count the number of times the character appears in that string i.e. increment the counter variable if the character at that index of the string equals the given character. In terms of function, it will look like the following:

> Now, for each query, we will call the function and it will return the number of times the given character appears in the string. 
Time Complexity analysis of the function:

> It is as same as the one we calculated for the previous problem. If the number of queries is Q, the time complexity will be O(Q*N) where N = size of the string. 


Optimized approach using Hashing:

> In number hashing, each index of the hash array represents an element in the given array. So, somehow, we need to map the characters of the string to an integer so that we can represent them using the indices of the hash array. So, let’s discuss the mapping technique:
Mapping characters to integers:

> In order to map the characters we need to use the ASCII values of the respective characters. The ASCII value of lowercase a is 97. So, if we write int x = ‘a’, it will typecast the character, ‘a’, into the ASCII value, 97, and store it in the variable x instead of throwing an error. So, similarly, if we write hash[‘a’], it will signify hash[97]. 

> Now, we can do the mapping more efficiently for specific cases like the following:

> Case 1 - If the string contains only lowercase letters: In this case, we can map the characters like:

‘a’ -> 0, ‘b’ -> 1, ‘c’ -> 2,....., ‘z’ -> 25. 

In order to get the corresponding value for a character, we will use the following formula:

corresponding value = given character - 'a'

For example, if the given character is ‘f’, we will get the value as (‘f’ - ‘a’) = (102-97) = 5.  Here, we can easily observe that the maximum value can be 25. 

So, for character hashing in this case, we need a hash array of size 26. And while pre-storing we will do hash[s[i]-’a’] += 1 instead of hash[arr[i]] += 1, and while fetching we will do hash[character-’a’] instead of hash[number]. The rest of the methods will be as same as in the case of number hashing.

> Case 2 -  If the string contains only uppercase letters: In this case, we can map the characters like:

‘A’ -> 0, ‘B’ -> 1, ‘C’ -> 2,....., ‘Z’ -> 25. 

In order to get the corresponding value for a character, we will use the following formula:

corresponding value = given character - 'A'

Then the process will be similar to case 1.

> Case 3 - If the string contains both uppercase and lowercase letters: We have 256 characters in total in this case. So, we will create a hash array of size 256. We will not subtract anything from the given character and will use the character as it is, to access the hash array while pre-storing and fetching. For pre-storing hash[s[i]] += 1 and for fetching we will use hash[character] only. The rest of the process will be exactly the same as in the number hashing.

Note: The case 3 method also applies to case 1 and case 2. In character hashing, the limit will not cross 256 and so we will always use this method.

The implementation is given below:

Code if the string contains only lowercase:

```java
import java.util.*;

class tUf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.next();

        //precompute:
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c - 'a']);
        }
    }
}

Input: 

abcdabehf
5
a
g
h
b
c

Output: 2
0
1
2
1
```

Code if the string contains both uppercase and lowercase:

```java
 import java.util.*;

class tUf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.next();

        //precompute:
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c]);
        }
    }
}

Input:
abcdabehf
5
a
g
h
b
c

Output: 
2
0
1
2
1
```


#### How to hash large numbers like 10^9 or higher:
 Use HashMap in Java collection.