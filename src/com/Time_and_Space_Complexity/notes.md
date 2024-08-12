<h1 align="center"> *SPACE AND TIME COMPLEXITY* </h1>

## Asymptotic Notations in Complexity Analysis of Algorithms:
### Asymptotic Notations:

> Asymptotic Notations are mathematical tools that allow you to analyze an algorithm’s running time by identifying its behavior as its input size grows.</br>
> This is also known as an algorithm's growth rate.</br>
> Description of how the algorithm scales with respect to input size,</br>
>###  There are mainly three asymptotic notations:
>
        > Big-O Notation (O-notation) </br>
        > Omega Notation (Ω-notation)</br>
        > Theta Notation (Θ-notation)</br>
>#        

### Why we need performance analysis:-
> Performance is like currency through which we can buy - user-friendliness, modularity, security, maintainability, etc.
### Asymptotic Analysis (asymptotics) :- 
> Asymptotic Analysis, method of describing limiting behavior - evaluate the performance of an algorithm in terms of input size (we don’t measure the actual running time). Calculate, how the time (or space) taken by an algorithm increases with the input size. </br>



# Time complexity

> Function that gives us the relationship about how the time will grow as the input grows.


 ## What do we consider when thinking about complexity:-
 #### 1) Always look for worst case complexity.
 #### 2) Always look at complexity for large/∞ data.
 #### 3) Constants are ignored.
       > We check for time and input relation.
       > We don't care about actual time.
 ### 4) Always ignore less dominating terms.
       > O(N^3 + log(n)) = O(N^3)


## 1. Big O notation (O):
> It Provides an upper bound on the growth rate of an algorithm’s running time. It represents the worst-case scenario, i.e., the maximum amount of time an algorithm may need to solve a problem.</br>
> Ex.-</br>
> Linear Search (order of growth is linear) - O(n) </br>
> Binary Search (order of growth is logarithmic) - O(log n). </br>
> Constant runtime - O(1)

 ### Time Complexity != Time taken
 >  Notation - f(n) = O(g(n))<br>
 >  Limit definition - f(n)=O(g(n))⟹lim(n→∞)f(n)/g(n)=0

## 2. Big Omega notation (Ω):
> Opposite of Big oh notation.
> The Big-Omega notation gives you a lower bound of the running time of an algorithm. So Big-Omega means the algorithms runs at least in n time but could actually take a lot longer. 

#### * Words: 
> Ω(N^3)  (Lower bound) <br>
> Limit definition - lim(n→∞)f(n)/g(n)>0

#### Q1. What if a algorithm has lower and upper bound as (N^2)?
>Ans.: O(n^2) and Ω(N^2)

## 3. Theta notation (θ):


## 4. Little O  notation (Ω):
## 5. Little Omega notation (Ω):