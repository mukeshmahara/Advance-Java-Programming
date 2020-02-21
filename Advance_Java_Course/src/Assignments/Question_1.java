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
public class Question_1 {
    
    //Program for counting the prime number between the two number provided by the user
    public int primeCount(int start,int end){
        int count=0;
        for(int i=start;i<=end;i++){
            int var=2;
            if(i%var==0){
                var++;
                
            }
            else{
                count++;
                
                
            }

        }
        return count;
    }
    
    public static void main(String[] args){
        Question_1 q = new Question_1();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the start point number:");
        int start =s.nextInt();
        System.out.println("Enter the end point number :");
        int end = s.nextInt();
        q.primeCount(start, end);
        
        System.out.println("The prime number between "+ start+" and "+end+" are : "+q.primeCount(start, end)+ " prime numbers");
        
    }
    
}
