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
public class Question_11 {

    private int count, sum;
    private int firstNum, secNum;

    public int henry(int i, int j) {
        count = 0;

        int temp = 2;
        firstNum = 0;
        secNum = 0;
        while (true) {
            sum = 0;
            //first calculate the sum of all factors except itself
            for (int k = 1; k < temp; k++) {
                if (temp % k == 0) {
                    sum += k;
                }
            }
            //if this true perfect number is found
            if (sum == temp) {
                //count is incremented to track the perfect number sequence
                count++;
                //ith perfect number is found
                if (count == i) {
                    firstNum = sum;
                }
                //jth perfect number is found
                if (count == j) {
                    secNum = sum;
                }
            }
            if (firstNum != 0 && secNum != 0) {
                return firstNum + secNum;
            }
            temp++;
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Question_11 h = new Question_11();
        System.out.println(h.henry(1, 2));
    }

}
