## Synopsis
The Power Set of a set **S** with **n** elements is the set of all its subsets. We can model the power set **P(S)** on all possible combinations of an **n-digit binary number**. 

## Description
Consider a set **S= {a, b, c}** with **n = 3** and a **3-digit binary number**. All the possible combination of this 3 digit number are: **000 001 010 011 100 101 110 and 111**. The total number of different combinations of the 3-digit number is **2^n = 2^3 = 6**. We can consider each digit of every number in the 3 digit binary number to indicate whether the corresponding element in the set **S** is on or off: 

* 000 (a=off, b=off, c=off) --> {} 
* 001 (a=off, b=off, c=on ) --> {c} 
* 010 (a=off, b=on, c=off ) --> {b}
* 111 (a=on, b=on, c=on   ) --> {a,b,c}
