/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Question:
'''''''''
5.   A prime number is an integer that is divisible only by 1 and itself. A porcupine number is a prime number whose last digit is 9 and the next prime number that follows it also ends with the digit 9. For example 139 is a porcupine number because:
 a. it is prime
 b. it ends in a 9
 c. The next prime number after it is 149 which also ends in 9. Note that 140, 141, 142, 143, 144, 145, 146, 147 and 148 are not prime so 149 is the next prime number after 139.

 Write a method named findPorcupineNumber which takes an integer argument n and returns the first porcupine number that is greater than n. So findPorcupineNumber(0) would return 139 (because 139 happens to be the first porcupine number) and so would findPorcupineNumber(138). But findPorcupineNumber(139) would return 409 which is the second porcupine number.

 The function signature is
 int findPorcupineNumber(int n)

 You may assume that a porcupine number greater than n exists

 */
package Assignments;

/**
 *
 * @author Dell
 */
public class Question_5 {
    public int findPorcupineNumber(int n) {
    int num = n + 1;
		int lastDigit;
		int primeNum,newPrime = 0;
		while (true) {
			// find the prime number which is greater than the given number

			primeNum = findPrimeNumber(num);
			newPrime=primeNum;
			// prime number found .Now lets check the last digit of the prime
			// Number which we have found
			lastDigit = primeNum % 10;
			if (lastDigit == 9) {
				// find leading prime number
				newPrime = findPrimeNumber(primeNum);
				lastDigit = newPrime % 10;
				// check the last digit
				if (lastDigit == 9) {
					// finally porcupine number is found
					return primeNum;

				}
			}
			num = newPrime;

		}
	}

	private int findPrimeNumber(int num) {
		int i = num + 1;
		int j;
		while (true) {

			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;

			}
				if (j == i) {
					return i;
				}
			
			i++;
		}
	}
        
        public static void main(String[] args){
            
            Question_5 _5 = new Question_5();
		System.out.println(_5.findPorcupineNumber(0));
        }

}
