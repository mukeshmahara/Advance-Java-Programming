/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Question_14 {

    public int isStacked(int num) {
        int sum = 0;

        do {
            sum += sum;
            sum++;
            if (sum > num) {
                System.out.println("impossible number");
                break;
            }

        } while (sum < num);

        if (sum == num) {
            System.out.println("The number is stacked number...");
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Question_14 q = new Question_14();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number to check whether it is stacked number or not:");
        int input = s.nextInt();

        System.out.println("Return :" + q.isStacked(input));
    }

}
