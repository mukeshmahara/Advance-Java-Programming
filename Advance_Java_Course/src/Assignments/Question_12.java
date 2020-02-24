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
public class Question_12 {
    private int count;

	public int isNUnique(int[] a, int n) {
		count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > n)
				continue;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > n)
					continue;
				if ((a[i] + a[j]) == n)
					count++;
				if (count > 1) {
					return 0;
				}
			}

		}
		if (count == 1)
			return 1;
		else
			return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question_12 q = new Question_12();
		int a[] = {7, 3, 3, 2, 4};
		System.out.println(q.isNUnique(a, 8));
	}
    
}
