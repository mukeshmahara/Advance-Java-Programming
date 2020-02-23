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
public class Question_7 {

    public int stantonMeasure(int[] a) {
        int oneCount = 0, occurCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                oneCount++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == oneCount) {
                occurCount++;
            }
        }

        return occurCount;

    }

    public static void main(String[] args) {
        Question_7 _7 = new Question_7();
//        int[] a={1};
        //int[] a = {1, 4, 3, 2, 1, 2, 3, 2};
        int[] a = {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4};
        System.out.println("" + _7.stantonMeasure(a));
    }

}
