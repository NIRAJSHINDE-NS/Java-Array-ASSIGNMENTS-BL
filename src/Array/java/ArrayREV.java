package Array.java;

import java.util.Scanner;

public class ArrayREV {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of integers in array:- ");
		int n = sc.nextInt();
		int[] arrayrev = new int[n];

		System.out.println("Enter " + arrayrev.length + " integer values:");

		for (int i = 0; i < arrayrev.length; i++) {
			arrayrev[i] = sc.nextInt();
		}
		
		System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arrayrev.length-1; i >= 0; i--) {  
            System.out.print(arrayrev[i] + " ");  
        }  
	}
}
