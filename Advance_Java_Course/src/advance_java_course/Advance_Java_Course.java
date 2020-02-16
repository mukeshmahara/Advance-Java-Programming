/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advance_java_course;

import Assignments.*;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

/**
 *
 * @author Dell
 */
public class Advance_Java_Course {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter 1 to for Question one solution");
        System.out.println("Enter 2 to for Question one solution");
        System.out.println("Enter 3 to for Question one solution");
        System.out.println("Enter 4 to for Question one solution");
        System.out.println("Enter 5 to for Question one solution");
        System.out.println("Enter 6 to for Question one solution");
        System.out.println("Enter 7 to for Question one solution");
        System.out.println("Enter 8 to for Question one solution");
        System.out.println("Enter 9 to for Question one solution");
        System.out.println("Enter 10 to for Question one solution");
        System.out.println("Enter 11 to for Question one solution");
        System.out.println("Enter 12 to for Question one solution");
        System.out.println("Enter 13 to for Question one solution");
        System.out.println("Enter 14 to for Question one solution");
        System.out.println("Enter 15 to for Question one solution");
        System.out.println("Enter 16 to for Question one solution");
        System.out.println("Enter 17 to for Question one solution");
        System.out.println("Enter 18 to for Question one solution");
        System.out.println("Enter 19 to for Question one solution");
        System.out.println("Enter 20 to for Question one solution");

        Scanner s = new Scanner(System.in);

        int choose = s.nextInt();
        
        

        
    
    switch (choose) {
            case 1:
                Question_1 _1 = new Question_1();
                System.out.println("Enter the start number :");
                int start = s.nextInt();
                System.out.println("Enter the end number :");
                int end = s.nextInt();
                
                System.out.println("The prime number between "+start+" and "+end+" are :"+_1.primeCount(start, end));
                break;
            
            
            case 2:
                Question_2 _2 = new Question_2();
                int a[] = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};

                System.out.println(_2.isMadhavArray(a));
                break;
            case 3:
                Question_3 _3 = new Question_3();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;

            default:

        }

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

    System.out.println (obj.isMadhavArray

(a));

    }

}
