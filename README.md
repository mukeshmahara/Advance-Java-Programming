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
<hr>

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
<hr>
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
<hr>
<b>Quesiton 5</b><br>
5.   A prime number is an integer that is divisible only by 1 and itself. A porcupine number is a prime number whose last digit is 9 and the next prime number that follows it also ends with the digit 9. For example 139 is a porcupine number because:
    a. it is prime
    b. it ends in a 9
    c. The next prime number after it is 149 which also ends in 9. Note that 140, 141, 142, 143, 144, 145, 146, 147 and 148 are not prime so 149 is the next prime number after 139.

Write a method named findPorcupineNumber which takes an integer argument n and returns the first porcupine number that is greater than n. So findPorcupineNumber(0) would return 139 (because 139 happens to be the first porcupine number) and so would findPorcupineNumber(138). But findPorcupineNumber(139) would return 409 which is the second porcupine number.

The function signature is
	int findPorcupineNumber(int n)

You may assume that a porcupine number greater than n exists.

Also write a  function isPrime that returns 1 if its argument is prime, otherwise it returns 0. E.G., isPrime(7) returns 1 and isPrime(8) returns 0. 

<hr>
<b>Quesiton 6</b><br>
6.   Consider the following algorithm
	Start with a positive number n
	if n is even then divide by 2
	if n is odd then multiply by 3 and add 1
	continue this until n becomes 1

The Guthrie sequence of a positive number n is defined to be the numbers generated by the above algorithm.

For example, the Guthrie sequence of the number 7 is 
7,  22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1

It is easy to see that this sequence was generated from the number 7 by the above algorithm. Since 7 is odd multiply by 3 and add 1 to get 22 which is the second number of the sequence. Since 22 is even, divide by 2 to get 11 which is the third number of the sequence. 11 is odd so multiply by 3 and add 1 to get 34 which is the fourth number of the sequence and so on.

Note: the first number of a Guthrie sequence is always the number that generated the sequence and the last number is always 1.

Write a function named isGuthrieSequence which returns 1 if the elements of the array form a Guthrie sequence. Otherwise, it returns 0.

	The function signature is
 int isGuthrieSequence(int[ ] a)


Examples
<table>
	<tr>
		<th>if a is</th>
		<th>return</th>
		<th>reason</th>
	</tr>
	<tr>
		<td>{8, 4, 2, 1}</td>
		<td>0</td>
		<td>This is not the Guthrie sequence for 8</td>
	</tr>	
	<tr>
		<td>{8, 17, 4, 1}</td>
		<td>1</td>
		<td>This is the Guthrie sequence for 8</td>
	</tr>	
	<tr>
		<td>{8, 4, 1}</td>
		<td>0</td>
		<td>Missing the 2</td>
	</tr>	
	<tr>
		<td>{8, 4, 2}</td>
		<td>0</td>
		<td>A Guthrie sequence must end with 1</td>
	</tr>	
</table>

<hr>
<b>Quesiton 7</b><br>
7.    The Stanton measure of an array is computed as follows. Count the number of 1s in the array. Let this count be n. The Stanton measure is the number of times that n appears in the array. For example, the Stanton measure of {1, 4, 3, 2, 1, 2, 3, 2} is 3 because 1 occurs 2 times in the array and 2 occurs 3 times.

Write a function named stantonMeasure that returns the Stanton measure of its array argument.

the function prototype is
	int stantonMeasure(int[ ] a)

Examples
<table>	
	<tr>
		<th>if a is</th>
		<th>return</th>
		<th>reason</th>
	</tr>
	<tr>
		<td>{1}</td>
		<td>1</td>
		<td>1 occurs 1 time, 1 occurs 1 time</td>
	</tr>
	<tr>
		<td>{0}</td>
		<td>1</td>
		<td>1 occurs 0 times, 0 occurs 1 time</td>
	</tr>
	<tr>
		<td>{3, 1, 1, 4}</td>
		<td>0</td>
		<td>1 occurs 2 times, 2 occurs 0 times</td>
	</tr>
	<tr>
		<td>{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}</td>
		<td>6</td>
		<td>1 occurs 3 times, 3 occurs 6 times</td>
	</tr>
	<tr>
		<td>{}</td>
		<td>0</td>
		<td>1 occurs 0 times, 0 occurs 0 times</td>
	</tr>


</table>


<hr>

<b>Quesiton 8</b><br>
8. The sum factor of an array is defined to be the number of times that the sum of the array appears as an element of the array. So the sum factor of {1, -1, 1, -1, 1, -1, 1} is 4 because the sum of the elements of the array is 1 and 1 appears four times in the array. And the sum factor of 
{1, 2, 3, 4} is 0 because the sum of the elements of the array is 10 and 10 does not occur as an element of the array. The sum factor of the empty array { } is defined to be 0.

Write a function named sumFactor that returns the sum factor of its array argument.

If you are programming in Java, the function signature is
	int sumFactor(int[ ] a)

Examples:
<table>
	<tr>
		<td>if a is</td>
		<td>return</td>
		<td>reason</td>
	</tr>
	<tr>
		<td>{3, 0, 2, -5, 0}</td>
		<td>2</td>
		<td>The sum of array is 0 and 0 occurs 2 times</td>
	</tr>
	<tr>
		<td>{9, -3, -3, -1, -1}</td>
		<td>0</td>
		<td>The sum of the array is 1 and 1 does not occur in array.</td>
	</tr>	
	<tr>
		<td>{1}</td>
		<td>1</td>
		<td>The sum of the array is 1 and 1 occurs once in the array</td>
	</tr>
	<tr>
		<td>{0, 0, 0}</td>
		<td>3</td>
		<td>The sum of the array is 0 and 0 occurs 3 times in the array</td>
	</tr>
	
</table>


<hr>

<b>Quesiton 9</b><br>
9.    It is a fact that there exist two numbers x and y such that  x! + y! = 10!. Write a method named solve10  that returns the values x and y in an array.

The notation n! is called n factorial and is equal to n * n-1 * n-2 * ... 2 * 1, e.g.,  5! = 5*4*3*2*1 = 120.

the function prototype is
   int[ ] solve10() where the length of the returned array is 2.


Please be sure that the method solve10 returns an array, a, with two elements 
where a[0] == x, a[1] == y and x! + y! = 10!.


<hr>

<b>Quesiton 10</b><br>
10.    An array is called centered-15 if some consecutive sequence of elements of the array sum to 15 and this sequence is preceded and followed by the same number of elements.  For example 
{3, 2, 10, 4, 1, 6, 9} is centered-15 because  the sequence 10, 4, 1 sums to 15 and the sequence is preceded by two elements (3, 2) and followed by two elements(6,9).

Write a method called isCentered15 that returns 1 if its array argument is centered-15, otherwise it returns 0.

the function prototype is
   int isCentered15(int[ ] a)

Examples
<table>
	<tr>
		<th>if a is</th>
		<th>return</th>
		<th>reason</th>
	</tr>
	<tr>
		<td>{3, 2, 10, 4, 1, 6, 9}</td>
		<td>1</td>
		<td>
			the sequence 10, 4, 1 sums to 15 and is preceded by 2 elements and followed by 2 elements. Note that there is 				another sequence that sums to 15 (6,9}. It is okay for the array to have more than one sequence that sums to 15 			as long as at least one of them is centered.
		</td>
	</tr>
	<tr>
		<td>{2, 10, 4, 1, 6, 9}</td>
		<td>0</td>
		<td>
			(10, 4, 1) is preceded by one element but followed by two.  (9,6) is preceded by five elements but followed by 				none.Hence neither qualify as centered.
		</td>
	</tr>
	<tr>
		<td>{3, 2, 10, 4, 1, 6}</td>
		<td></td>
		<td>
			(10, 4, 1) is preceded by two elements but followed by one. Note that the values 3, 2, 4, 6 sum to 15 but they 				are not consecutive.
		</td>
	</tr>
	<tr>
		<td>{1,1,8, 3, 1, 1}</td>
		<td></td>
		<td>The entire array sums to 15, hence the sequence is preceded by zero elements and followed by zero elements.</td>
	</tr>
	<tr>
		<td>{9, 15, 6}</td>
		<td>1</td>
		<td>the sequence (15) is preceded by one element and followed by one element.</td>
	</tr>
	<tr>
		<td>{1, 1, 2, 2, 1, 1}</td>
		<td>0</td>
		<td>no sequence sums to 15.</td>
	</tr>
	<tr>
		<td>{1, 1, 15 -1,-1}</td>
		<td>1</td>
		<td>
			there are three different sequences that sum to 15, the entire array, (1, 15, -1) and (15). In this case they 				all are centered but the requirement is that just one of them has to be.
		</td>
	</tr>
	
</table>
		
		

<hr>

