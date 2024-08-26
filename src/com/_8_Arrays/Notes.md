<h1 align="center"> *ARRAYS IN JAVA* </h1>


An array is a collection of similar data type values. <br/>
Syntax: datatype[] variable_name = new datatype[size]; <br/>

              OR

datatype[] variable_name;<br/>
variable_name = new datatype[size];<br/>

              OR

datatype[] variable_name = {value1, value2, value3, . . ., valueN};<br/>


## Understanding the Syntax:

datatype[] variable_name;<br/>

>This step will initialize the variable, and it will get initialized in the stack during compile time.<br/>

Example: int[] number;<br/>

![plot](img1.jpg)

variable_name = new datatype[size];

>In this step, aa new object will be created in the heap memory during runtime.<br/>
The 'new' keyword is used to create a new object.

Example: n=new int[6];

![plot](img2.jpg)

![plot](img3.jpg)

![plot](img4.jpg)
### Note


>1. Heap is the runtime data area from which the memory for all the classes instances is allocated.<br/>
>2. Arrays in C and C++ use contiguous memory allocation in order that pointer arithmetic can be used to access the various elements.<br/>
>3. Even though definition of Arrays says (It's continuous) still in Java internally it may not be continuous. -- It depends on JVM.<br/>
>4. By default, value in arrays : int -> 0, String -> "null".<br/>
>5. "null" is a special type of literal of a null type.<br/>
>6. By Default value of object is "null".<br/>
>7. Primitives are stored in stack memory and objects in heap.<br/>
>8. How reference variables are passed into function? Ans:- In java only "Call by value".<br/>
>9. When we pass object reference, in actually going to take copy of that reference which is going to point to the same object.<br/>
>10. Strings are immutable in java but Arrays are mutable in java.<br/>
>11. Mutable means you can change the object.<br/>
>12. Array objects are in heap.<br/>
>13. Heap objects are not continuous.<br/>
>14. It may be Dynamic memory allocation(DMA).<br/>
>15. Hence:- may not be continuous ---> Depends on JVM.<br/>
>16. Primitives (int, char, etc.) are stored in stack.<br/>
>17. All other objects are stored in heap memory.<br/>
>18. Arrays.toString(array) ---> internally uses for loop and gives the output in proper format.<br/>
>19. In an array, since we can change the objects, hence they are mutable.<br/>



## 2D Arrays:

A 2D array can be visualized as a matrix. Let's understand how?

> First of all, let's take a 1D array like this,<br/>
>   int[] num = {2, 5, 6, 9, 3};<br/>

![plot](img5.jpg)

![plot](img6.jpg)

![plot](img7.jpg)

![plot](img8.jpg)

![plot](img9.jpg)

![plot](img10.jpg)

![plot](img11.jpg)

![plot](img12.jpg)

  