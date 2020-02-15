/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advance_java_course;

import Assignments.Question_2;

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
        //Question 1 
//        Question_1  primecounter;
//        primecounter = new Question_1 ();
//        
//        Scanner s1 = new Scanner(System.in);
//        
//        System.out.println("Enter the start number :");
//        int start =s1.nextInt();
//        
//        System.out.println("Enter the end number :");
//        int end = s1.nextInt();
//        
//        System.out.println("The number of prime number between "+start+" and "+end+" is "+primecounter.primeCount(start, end));

        //Question 2
        Question_2 obj = new Question_2();
        int a[] = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};

        System.out.println(obj.isMadhavArray(a));

    }

}
