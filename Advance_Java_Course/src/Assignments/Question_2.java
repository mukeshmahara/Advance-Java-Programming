/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

/**
 *
 * @author Dell
 */
/**
 * A Madhav array has the following property. a[0] = a[1] + a[2] = a[3] + a[4] +
 * a[5] = a[6] + a[7] + a[8] + a[9] = ... The length of a Madhav array must be
 * n*(n+1)/2 for some n.
 *
 * Write a method named isMadhavArray that returns 1 if its array argument is a
 * Madhav array, otherwise it returns 0. the function signature is int
 * isMadhavArray(int[ ] a)
 *
 *
 * Examples if a is return	reason {2, 1, 1}	1	2 + 1 + 1 {2, 1, 1, 4, -1, -1}	1	2
 * = 1 + 1, 2 = 4 + -1 + -1 {6, 2, 4, 2, 2, 2, 1, 5, 0, 0}	1	6 = 2 + 4, 6 = 2 +
 * 2 + 2, 6 = 1 + 5 + 0 + 0 {18, 9, 10, 6, 6, 6}	0	18 != 9 + 10 {-6, -3, -3, 8,
 * -5, -4}	0	-6 != 8 + -5 + -4 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}	1
 * 0 = 0 + 0, 0 = 0 + 0 + 0, 0 = 0 + 0 + 0 + 0, 0 = 1 + 1 + 1 + -2 + -1 {3, 1,
 * 2, 3, 0}	0	The length of the array is 5, but 5 does not equal n*(n+1)/2 for
 * any value of n.
 *
 */
public class Question_2 {

    private int prevSum, newSum, index;

    Question_2() {
        prevSum = 0;
        newSum = 0;
        index = 0;
    }

    public boolean isMadhavArray(int[] a) {
        int i = 0;
        int l = 0;
        while (true) {
            l = i * (i + 1) / 2;
            if (a.length == l) {
                break;
            }
            if (i > a.length) {
                return false;
            }
            i++;
        }
        prevSum = a[0];
        for (int j = 1; j <= i; j++) {
            try {
                newSum = arraySum(a, index, j);
            } catch (ArrayIndexOutOfBoundsException e) {
                return false;
            }
            if (prevSum != newSum) {
                return false;
            }
        }
        return true;
    }

    public int arraySum(int[] array, int index, int count) throws ArrayIndexOutOfBoundsException {
        int sum = 0;
        for (int i = 0; i < count; i++, index++) {
            sum += array[index];
            this.index++;
        }
        return sum;
    }

}

