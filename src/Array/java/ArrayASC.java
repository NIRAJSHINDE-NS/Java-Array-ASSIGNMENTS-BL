package Array.java;

public class ArrayASC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayasc = new int[] { 5, 2, 8, 7, 1 };
		int temp = 0;

		System.out.println("Elements of original array: ");
		for (int i = 0; i < arrayasc.length; i++) {
			System.out.print(arrayasc[i] + " ");
		}

		for (int i = 0; i < arrayasc.length; i++) {
			for (int j = i + 1; j < arrayasc.length; j++) {
				if (arrayasc[i] > arrayasc[j]) {
					temp = arrayasc[i];
					arrayasc[i] = arrayasc[j];
					arrayasc[j] = temp;
				}
			}
		}

		System.out.println();

		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < arrayasc.length; i++) {
			System.out.print(arrayasc[i] + " ");
		}
	}
}
