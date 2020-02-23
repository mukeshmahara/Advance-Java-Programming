/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

/**
 *
 * @author Dell 9. It is a fact that there exist two numbers x and y such that
 * x! + y! = 10!. Write a method named solve10 that returns the values x and y
 * in an array.
 *
 * The notation n! is called n factorial and is equal to n * n-1 * n-2 * ... 2 *
 * 1, e.g., 5! = 5*4*3*2*1 = 120.
 *
 * the function prototype is int[ ] solve10() where the length of the returned
 * array is 2.
 *
 *
 * Please be sure that the method solve10 returns an array, a, with two elements
 * where a[0] == x, a[1] == y and x! + y! = 10!.
 *
 *
 */
public class Question_9 {

    private int[] coord;
    private boolean solved = false;

    Question_9() {
        coord = new int[2];
    }

    public int[] factorial() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((fact(i) + fact(j)) == 3628800) {
                    coord[0] = i;
                    coord[1] = j;
                    return coord;
                }
                System.out.println("i= " + i + " and j= " + j);
            }
        }
        return coord;

    }

    private int fact(int a) {
        int num = 1;
        for (int i = a; i > 0; i--) {
            num *= i;
        }
        return num;
    }

    public static void main(String[] args) {
        Question_9 _9 = new Question_9();
        int[] coord = _9.factorial();
        System.out.println(coord[0] + " , " + coord[1]);
    }

}
