/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advance_java_course;
import Assignments.*;

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
        Question_1  primecounter;
        primecounter = new Question_1 ();
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the start number :");
        int start =s.nextInt();
        
        System.out.println("Enter the end number :");
        int end = s.nextInt();
        System.out.println("The number of prime number between "+start+" and "+end+" is "+primecounter.primeCount(start, end));
    
        //Question 2
        
    
    }

}
