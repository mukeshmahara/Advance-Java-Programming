/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
//Define an array to be trivalent if all its elements are one of three different values.
//For example, {22, 19, 10, 10, 19, 22, 22, 10} is trivalent because all elements are 
//either 10, 22, or 19. However, the array {1, 2, 2, 2, 2, 2, 2} is not trivalent
//because it contains only two different values (1, 2). 
//The array {2, 2, 3, 3, 3, 3, 2, 41, 65} is not trivalent because
//it contains four different values (2, 3, 41, 65). 
//
//Write a function named isTrivalent that returns 1 if its array argument is trivalent, otherwise it returns 0.
package Assignments;

import java.sql.Array;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Question_15 {

    int[] trivalent_arr = {0, 0, 0};

    public void trivalent(int arr[]) {
        System.out.println("my custom array length :" + arr.length);
        System.out.println("Trivalent _array_length :"+this.trivalent_arr.length+"\n\n");
        
        System.out.println("ok");
        
        for (int i = 0; i < trivalent_arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
                if (trivalent_arr[i]==arr[j]) {
                    break;
                }
                else{
                    trivalent_arr[i] = arr[j];
                    
                    
                    
                }
                      
                
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {2, 2, 4, 8, 2, 8, 2, 2, 4,8};
        Question_15 q15 = new Question_15();
        q15.trivalent(arr);
    }

}
