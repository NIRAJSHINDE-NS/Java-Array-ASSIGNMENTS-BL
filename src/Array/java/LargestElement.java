package Array.java;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of integers in array:- ");
		int n = sc.nextInt();
		int[] arraymax = new int[n];

		System.out.println("Enter " + arraymax.length + " integer values:");

		for (int i = 0; i < arraymax.length; i++) {
			arraymax[i] = sc.nextInt();
		}

		int max = arraymax[0];
		for (int i = 0; i < arraymax.length; i++) {
			if (arraymax[i] > max)
				max = arraymax[i];
		}
		System.out.println("Largest element are: " + max);
	}

}
