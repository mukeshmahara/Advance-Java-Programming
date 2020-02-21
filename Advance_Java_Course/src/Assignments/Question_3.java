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
public class Question_3 {

    public void isInertial(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
//                int b = a[j];

                if (a[i] % 2 == 0) {
                    if (a[j] < a[i]) {
                        a[1]=a[i];   
                    }
                }
            }
        }
        System.out.println("The greatest even number is:"+a[1]);
             

    }
    public static void main(String[] args) {
        
        int[] a = {2, 4, 8, 20, 23, 27, 30};

        Question_3 q = new Question_3();
        q.isInertial(a);
    }

}
