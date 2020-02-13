/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advance_java_course;

import Assignments.Assignments;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Advance_Java_Course {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This java program finds the next perfect square number that is provided by the 
//        Assignments obj = new Assignments();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number to find its next perfect square");
//        int num = input.nextInt();
//        System.out.println("The next perfect number is :" + obj.next_Perfect_Square(num));

        
//        Java Program to count the prime number starting from the start number 
//        to the end number given by the user
        
        Assignments primecounter = new Assignments();
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the start number :");
        int start =s.nextInt();
        
        System.out.println("Enter the end number :");
        int end = s.nextInt();
        System.out.println("The number of prime number between "+start+" and "+end+" is "+primecounter.primeCount(start, end));
    }

}
