# Advance-Java-Programming
<b>Quesiton 1</b><br>
 Write a function named primeCount with signature
   int primeCount(int start, int end);

The function returns the number of primes between start and end inclusive. Recall that a prime is a positive integer greater than 1 whose only integer factors  are 1 and itself.

<b>Examples</b></br>
<table>
	<tr>
		<th>If start is</th>
		<th>and end is</th>
		<th>return</th>
		<th>reason</th>
	</tr>
	<tr>
		<td>10</td>	
		<td>30</td>	
		<td>6</td>	
		<td>The primes between 10 and 30 inclusive are 11, 13, 17, 19, 23 and 29</td>
	</tr>
	<tr>
		<td>11</td>	
		<td>29</td>	
		<td>6</td>	
		<td>The primes between 11 and 29 inclusive are 11, 13, 17, 19, 23 and 29</td>
	</tr>
	<tr>
		<td>20</td>
		<td>22</td>
		<td>0</td>
		<td>20, 21, and 22 are all non-prime</td>
	</tr>
	<tr>
		<td>1</td>
		<td>1</td>	
		<td>0</td>
		<td>By definition, 1 is not a prime number</td>
	</tr>
	<tr>
		<td>5</td>
		<td>5</td>
		<td>1</td>
		<td>5 is a prime number</td>
	</tr>
	<tr>
		<td>6</td>
		<td>2</td>
		<td>0</td>
		<td>start must be less than or equal to end</td>
	</tr>
	<tr>
		<td>-10</td>
		<td>6</td>
		<td>3</td>
		<td>primes are greater than 1 and 2, 3, 5 are  prime</td>
	</tr>
</table>

<b>Quesiton 2</b><br>
A Madhav array has the following property. 
   a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
The length of a Madhav array must be n*(n+1)/2 for some n.

Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array, otherwise it returns 0. 
the function signature is
   int isMadhavArray(int[ ] a)


<b>Examples</b></br>
<table>
	<tr>
		<th>if a is</th> 	
		<th>return</th>
		<th>reason</th>
	</tr>
	<tr>
		<td>{2, 1, 1}</td>
		<td>1</td>
		<td>2 + 1 + 1</td>
	</tr>
	<tr>
		<td>{2, 1, 1, 4, -1, -1}</td>
		<td>1</td>
		<td>2 = 1 + 1, 2 = 4 + -1 + -1</td>
	</tr>
	<tr>
		<td>{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}</td>
		<td>1</td>
		<td>6 = 2 + 4, 6 = 2 + 2 + 2, 6 = 1 + 5 + 0 + 0</td>
	</tr>
	<tr>
		<td>{18, 9, 10, 6, 6, 6}</td>
		<td>0</td>
		<td>18 != 9 + 10</td>
	</tr>
	<tr>
		<td>{-6, -3, -3, 8, -5, -4}</td>
		<td>0</td>
		<td>-6 != 8 + -5 + -4</td>
	</tr>
	<tr>
		<td>{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}</td>
		<td>1</td>
		<td>0 = 0 + 0, 0 = 0 + 0 + 0, 0 = 0 + 0 + 0 + 0, 0 = 1 + 1 + 1 + -2 + -1</td>
	</tr>
	<tr>
		<td>{3, 1, 2, 3, 0}</td>
		<td>0</td>
		<td>The length of the array is 5, but 5 does not equal n*(n+1)/2 for any value of n.</td>
	</tr>
</table>


<b>Quesiton 3</b><br>
An array is defined to be inertial if the following conditions hold:
 a. it contains at least one odd value
 b. the maximum value in the array is even
 c. every odd value is greater than every even value that is not the maximum value. 

So {11, 4, 20, 9, 2, 8} is inertial because 
 a. it contains at least one odd value
 b. the maximum value in the array is 20 which is even
 c. the two odd values (11 and 9) are greater than all the      
    even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}. 

However, {12, 11, 4, 9, 2, 3, 10} is not inertial because it fails condition (c), i.e., 10 (which is even) is greater 9 (which is odd) but 10 is not the maximum value in the array.
Write a function called isIntertial that accepts an integer array and returns 1 if the array is inertial; otherwise it returns 0. 

the function signature is 
	int isInertial(int[ ] a) 

<b>Some other examples:</b></br> 
<table>
	<tr>
		<th>if the input array is</th>
		<th>return</th>
		<th>reason</th>
	</tr>
	<tr>
		<td>{1}</td>
		<td>0</td>
		<td>fails condition (a) - the maximum value must be even</td>
	</tr>
	<tr>
		<td>{2}</td>
		<td>0</td>
		<td>fails condition (b) - the array must contain at least one odd value.</td>
	</tr>
	<tr>
		<td>{1, 2, 3, 4}</td>
		<td>0</td>
		<td>	fails condition (c) - 1 (which is odd) is not greater than all even values other than the maximum (1 is less 				than 2 which is not the maximum)</td>
	</tr>
	<tr>
		<td>{1, 1, 1, 1, 1, 1, 2}</td>
		<td>1</td>
		<td>there is no even number other than the maximum. Hence, there can be no other even values  that are greater than 1.			</td>
	</tr>
	<tr>
		<td>{2, 12, 4, 6, 8, 11}</td>
		<td>1</td>
		<td>11, the only odd value is greater than all even values except 12 which is the maximum value in the array.</td>
	</tr>
	<tr>
		<td>{2, 12, 12, 4, 6, 8, 11}</td>
		<td>1</td>
		<td>same as previous, i.e., it is OK if maximum value occurs more than once.</td>
	</tr>
	<tr>
		<td>{-2, -4, -6, -8, -11}</td>
		<td>0</td>
		<td>-8, which is even, is not the maximum value but is greater than -11 which is odd</td>
	</tr>
	<tr>
		<td>{2, 3, 5, 7}</td>
		<td>0</td>
		<td>the maximum value is odd</td>
	</tr>
	<tr>
		<td>{2, 4, 6, 8, 10}</td>
		<td>0</td>
		<td>there is no odd value in the array.</td>
	</tr>
</table>

<b>Quesiton 4</b><br>
Define a square pair to be the tuple <x, y> where x and y are positive, non-zero integers, x<y and x + y is a perfect square. A perfect square is an integer whose square root is also an integer, e.g. 4, 9, 16 are perfect squares but 3, 10 and 17 are not. Write a function named countSquarePairs that takes an array and returns the number of square pairs that can be constructed from the elements in the array. For example, if the array is {11, 5, 4, 20} the function would return 3 because the only square pairs that can be constructed from those numbers are <5, 11>, 
<5, 20> and <4, 5>.  You may assume that there exists a function named isPerfectSquare that returns 1 if its argument is a perfect square and 0 otherwise. E.G., isPerfectSquare(4) returns 1 and isPerfectSquare(8) returns 0.

the function signature is
	int countSquarePairs(int[ ] a)

You may assume that there are no duplicate values in the array, i.e, you don't have to deal with an array like {2, 7, 2, 2}.

Examples:
<table>
	<tr>
		<th><pre>if a is</pre></th>
		<th>return</th>
		<th>reason</th>
	</tr>
	<tr>
		<td>{9, 0, 2, -5, 7}</td>
		<td>2</td>
		<td>	The square pairs are <2, 7> and <7, 9>. Note that <-5, 9> and <0, 9> are not square pairs, even though they sum 			to perfect squares, because both members of a square pair have to be greater than 0. Also <7,2> and <9,7> are 				not square pairs because the first number has to be less than the second number.
			</td>
	</tr>
	<tr>
		<td>{9}</td>
		<td>0</td>
		<td>The array must have at least 2 elements</td>
	</tr>
</table>


