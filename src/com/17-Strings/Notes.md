<h1 align="center"> *Strings and StringBuilder* </h1>

### What is the string pool?

>String pool is nothing but a storage area in Java heap where string 
 literals stores. It is also known as String Intern Pool or String 
 Constant Pool. It is just like object allocation. By default, it is 
 empty and privately maintained by the Java String class. Whenever we 
 create a string the string object occupies some space in the heap 
 memory. Creating a number of strings may increase the cost and memory 
 too which may reduce the performance also.


> It is the separate memory structure inside the heap memory to optimise the memory.
> When we create string object it stores inside it. Let two reference variable has same value ex;
> String name="Pallavi;
> String b="Pallavi;
> Then it will "Pallavi" will be stored inside string pool and both the reference variable will be point to the same object 
> created inside the pool which will optimise the memory.

#### Now if we have doubt if we change one string object then will it effect other?
> We can not change/modify the String because it is immutable.

#### Why Strings are immutable?
> Let 4 person p1, p2, p3, p4 has same name "Pallavi", Now if one person has changed her name 
> then if it will change the name of all other persons hence we can't modify/change it.


#### Difference between comparing String using == and .equals() method in Java
> The == operator checks for reference equality. It compares the memory addresses of two string objects to determine if they refer to the same location in memory. If two string objects reference the same memory address, == will return true, 

> The .equals() method in Java is used to compare the actual content of two string objects, focusing on the sequence of characters they contain, rather than considering other factors like references or memory addresses. It checks if the characters in both strings are the same. If the content of the strings is identical, .equals() will return true,

#### We have seen if two reference variable have same value then it will point to the same object, then what condition it will create 2 object separately?
> String s1=new String("Pallavi");
> String s2=new String("Pallavi");
> // Creating these value outside the pool but inside the heap.



### why use StringBuilder instead of Strings?
>StringBuilder is a class in the Java API that provides a mutable sequence of characters.

> Strings in Java are immutable. Meaning once you set their value you cannot change it. So what happens when add something to a string is that a new string object gets created and the old one gets thrown away. This can get expensive if you do it a lot. StringBuilder doesn't have this problem since it's mutable.


#### There are many format specifiers we can use. Here are some common ones:

%c - Character <br/>
%d - Decimal number (base 10)<br/>
%e - Exponential floating-point number<br/>
%f - Floating-point number<br/>
%i - Integer (base 10)<br/>
%o - Octal number (base 8)<br/>
%s - String<br/>
%u - Unsigned decimal (integer) number<br/>
%x - Hexadecimal number (base 16)<br/>
%t - Date/time<br/>
%n - Newline<br/>