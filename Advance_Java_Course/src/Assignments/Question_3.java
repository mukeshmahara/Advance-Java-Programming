/*
 * An array is defined to be inertial if the following conditions hold:
 a. it contains at least one odd value
 b. the maximum value in the array is even
 c. every odd value is greater than every even value that is not the maximum value. 

 So {11, 4, 20, 9, 2, 8} is inertial because 
 a. it contains at least one odd value
 b. the maximum value in the array is 20 which is even
 c. the two odd values (11 and 9) are greater than all the      
 even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}. 

 However, {12, 11, 4, 9, 2, 3, 10} is not inertial because it fails condition (c), i.e., 10 (which is even) is greater 9 (which is odd) but 10 is not the maximum value in the array.
 Write a function called isIntertial that accepts an integer array and returns 1 if the array is inertial; otherwise it returns 0. 

 the function signature is 
 int isInertial(int[ ] a) 

 Some other examples: 
 if the input array is              return                          reason
 {1}                                0           fails condition (a) - the maximum value must be even
 {2}                                0           fails condition (b) - the array must contain at least one odd value.
 {1, 2, 3, 4}                       0           fails condition (c) - 1 (which is odd) is not greater than all even values other than the maximum (1 is less than 2 which is not the maximum)
 {1, 1, 1, 1, 1, 1, 2}              1           there is no even number other than the maximum. Hence, there can be no other even values  that are greater than 1.
 {2, 12, 4, 6, 8, 11}               1           11, the only odd value is greater than all even values except 12 which is the maximum value in the array.
 {2, 12, 12, 4, 6, 8, 11}           1           same as previous, i.e., it is OK if maximum value occurs more than once.
 {-2, -4, -6, -8, -11}              0           -8, which is even, is not the maximum value but is greater than -11 which is odd
 {2, 3, 5, 7}	0                               the maximum value is odd
 {2, 4, 6, 8, 10}                   0           there is no odd value in the array.


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
