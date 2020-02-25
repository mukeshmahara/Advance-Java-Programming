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
class Counter{
    int num;
//Function for calculating the next perfect number 
    public double next_Perfect_Square(int n) {
        this.num = n + 1;
        double var = Math.ceil(Math.sqrt(num));
        double square = var * var;
        while (num < square) {
            num++;
        }
        return num;
    }
}
public class Next_Perfect_Square {
    
    public static void main(String[] args){
        Counter c = new Counter();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
        int input = s.nextInt();
        System.out.println("The next perfect square number after "+input+" is :"+c.next_Perfect_Square(input));
        
    }
    
}
