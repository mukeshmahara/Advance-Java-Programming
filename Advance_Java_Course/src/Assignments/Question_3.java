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

    private int max, oddIndex, evenIndex;
    private int[] oddArray, evenArray;
    private int evenMax, oddMin, evenCount;

    Question_3() {
        max = 0;
        oddIndex = 0;
        evenIndex = 0;
        evenMax = 0;
        evenCount = 0;
    }

    public int isInertial(int[] array) {
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
////                int b = a[j];
//
//                if (a[i] % 2 == 0) {
//                    if (a[j] < a[i]) {
//                        a[1]=a[i];   
//                    }
//                }
//            }
//        }
//        System.out.println("The greatest even number is:"+a[1]);
        int i;
        // check for odd element
        for (i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                break;
            }
        }
        if (i == array.length) {
            return 0;
        }
        // find maximum value in array
        for (i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            // count total even element in array
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        // if maximum value is not an even value then return 0
        if (max % 2 != 0) {
            return 0;
        }
        oddArray = new int[array.length - evenCount];
        evenArray = new int[evenCount];

        // find even and odd element and put them in a separate array
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                // put all the even value except the maximum even value
                if (array[i] != max) {
                    evenArray[evenIndex] = array[i];
                    evenIndex++;
                }

            } else {
                oddArray[oddIndex] = array[i];
                oddIndex++;
            }

        }
        // find the maximum value in a even array
        // find the minimum value in a odd array

        oddMin = oddArray[0];
        for (i = 0; i < array.length; i++) {
            if (i < evenCount) {
                if (evenArray[i] > evenMax) {
                    evenMax = evenArray[i];
                }
            }
            if (i > 0 && i < (array.length - evenCount)) {
                if (oddArray[i] < oddMin) {
                    oddMin = oddArray[i];
                }
            }
        }
        if (oddMin > evenMax) {
            return 1;
        }

        return 0;

    }

    public static void main(String[] args) {

//        int[] a = {2, 4, 8, 20, 23, 27, 30};
//
//        Question_3 q = new Question_3();
//        q.isInertial(a);
        Question_3 i = new Question_3();
//		int[] a = { 11, 4, 20, 9, 2, 8 };// inertial array
//        int[] a = { 12, 11, 4, 9, 2, 3, 10};// non-inertial array
        int[] a = {2, 4, 6, 8, 10};// non-inertial array
        System.out.println(i.isInertial(a));
    }

}
