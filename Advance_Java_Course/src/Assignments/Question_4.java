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
public class Question_4 {

    private int count;

    Question_4() {
        count = 0;
    }

    public int countSquarePair(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (isSquarePair(array[i], array[j])) {
                    count++;
                }

            }

        }
        return count;

    }

    public boolean isSquarePair(int a, int b) {
        if (a <= 0 || b <= 0 || a >= b) {
            return false;
        }

        if (isPerfectSquare(a + b)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPerfectSquare(int a) {
        int temp = (int) Math.sqrt(a);
        if (temp * temp == a) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Question_4 _4 = new Question_4();
        int[] a = {11, 5, 4, 20, 16, 36};
        System.out.println(_4.countSquarePair(a));
    }

}
