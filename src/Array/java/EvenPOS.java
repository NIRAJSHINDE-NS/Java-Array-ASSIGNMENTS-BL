package Array.java;

import java.util.Scanner;

public class EvenPOS {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of integers in array:- ");
		int n = sc.nextInt();
		int[] arraymin = new int[n];

		System.out.println("Enter " + arraymin.length + " integer values:");

		for (int i = 0; i < arraymin.length; i++) {
			arraymin[i] = sc.nextInt();
		}

		for (int i = 1; i < arraymin.length; i = i + 2) {
			System.out.println("The element on even position is : ");
			System.out.println(arraymin[i]);
		}

	}

}
