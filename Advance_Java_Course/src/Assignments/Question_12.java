/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 .   An array is defined to be n-unique if exactly one pair of its elements sum to n. For example, the array {2, 7,  3, 4} is 5-unique because only a[0] and a[2] sum to 5. But the array {2, 3, 3, 7} is not 5-unique because a[0] + a[1] = 5 and a[0] + a[2] = 5.  

 Write a function named isNUnique that returns 1 if its integer array argument is n-unique, otherwise it returns 0. So isNUnique(new int[ ]{2, 7, 3, 4}, 5) should return 1 and 
 isNUnique(new int[] {2, 3, 3, 7}, 5) should return 0.

 the function signature is
 int isNUnique(int[ ] a, int n)

 Examples
 If a is 	and n is	return 	because
 {7, 3, 3, 2, 4}	6	0	because a[1]+a[2] == 6 and a[3]+a[4] also == 6.
 {7, 3, 3, 2, 4}	10	0	because a[0]+a[1] == 10 and a[0] + a[2] also == 10
 {7, 3, 3, 2, 4}	11	1	because only a[0] + a[4] sums to 11
 {7, 3, 3, 2, 4}	8	0	because no pair of elements sum to 8. (Note that a[1]+a[2]+a[3] do sum to 8 but the requirement is that two elements sum to 8.)
 {7, 3, 3, 2, 4}	4	0	no pair of elements sum to 4. (Note that the a[4]==4, but the requirement is that two elements have to sum to 4.)
 {1}                anything	0	array must have at least 2 elements

 */
package Assignments;

/**
 *
 * @author Dell
 */
public class Question_12 {

    private int count;

    public int isNUnique(int[] a, int n) {
        count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > n) {
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > n) {
                    continue;
                }
                if ((a[i] + a[j]) == n) {
                    count++;
                }
                if (count > 1) {
                    return 0;
                }
            }

        }
        if (count == 1) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Question_12 q = new Question_12();
        int a[] = {7, 3, 3, 2, 4};
        System.out.println(q.isNUnique(a, 8));
    }

}
