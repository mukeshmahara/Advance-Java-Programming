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
public class Question_13 {

    int isSquare(int n) {
        int lastNum = n % 10;
//        if (lastNum ==0 || lastNum ==1 || lastNum ==4 || lastNum ==5 || lastNum ==6 || lastNum ==9) {
//            
//            return 1;
//            
//        } else  {
//            return 0;
//        }
        int inc = 0;
        do {
            inc++;
            if (inc>n) {
                
                System.out.println("not not a square!!");
                return 0;
            }
            
        } while (inc * inc != n);
        
     return 1;
    }

    
    
    public static void main(String[] args) {
        Question_13 q = new Question_13();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = s.nextInt();

        System.out.println("Return :" + q.isSquare(input));
    }
}
