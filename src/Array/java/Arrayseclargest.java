package Array.java;

import java.util.Arrays;

public class Arrayseclargest {
	static void secondlargest(int arr[], int arr_size) {
		int i ;

		if (arr_size < 2) {
			System.out.printf(" Invalid Input ");
			return;
		}

		Arrays.sort(arr);

		for (i = arr_size - 2; i >= 0; i--) {

			if (arr[i] != arr[arr_size - 1]) {
				System.out.printf("The second largest " + "element is %d\n", arr[i]);
				return;
			}
		}

		System.out.printf("There is no second " + "largest element\n");
	}

	public static void main(String[] args) {
		int arr[] = { 12, 35, 1, 10, 34, 1 };
		int n = arr.length;
		secondlargest(arr, n);
	}

}
