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
public class Question_8 {
    public int sumFactor(int[] a)
        {
            int sum = 0, sumfactor = 0;

            for (int i = 0; i < a.length; i++)
            {
                sum += a[i];
            }

            for (int i = 0; i < a.length; i++)
            {
                if (a[i] == sum) sumfactor++;

            }
            return sumfactor;
        }

    public static void main(String[] args){
        Question_8 _8 =new Question_8();
        int[] a= {3, 0, 2, -5, 0};
//        int[] a= {9, -3, -3, -1, -1};
//        int[] a= {{0, 0, 0}};
        System.out.println(""+_8.sumFactor(a));
                
    }
}
