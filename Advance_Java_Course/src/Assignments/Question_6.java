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
public class Question_6 {

    private int num;
    private int index = 1;

    public int isGuthrieSequence(int[] a) {
        /*	assign first element of array into a variable and generate guthrie sequence.
         if the generated sequence element doesnot equal to the right indexed element
         in a given array then return 0.
         */
        num = a[0];
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            if (a[index] != num) {
                return 0;
            }
            index++;
        }
        return 1;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Question_6 _6 = new Question_6();
        int a[] = {7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1};//This is a GuthrieSequence
//        int a[] = {8, 4, 1};//This is not a GuthrieSequence

        System.out.println("" + _6.isGuthrieSequence(a));
    }

}
