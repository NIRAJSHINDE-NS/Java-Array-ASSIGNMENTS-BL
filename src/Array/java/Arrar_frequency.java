package Array.java;

public class Arrar_frequency {
	public static void main(String[] args) {

		int[] array_freq = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };

		int[] frequency = new int[array_freq.length];
		int vis = -1;
		for (int i = 0; i < array_freq.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array_freq.length; j++) {
				if (array_freq[i] == array_freq[j]) {
					count++;
					// To avoid counting same element again
					frequency[j] = vis;
				}
			}
			if (frequency[i] != vis)
				frequency[i] = count;
		}
		System.out.println(" Element -- Frequency");

		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != vis)
				System.out.println("    " + array_freq[i] + "    --   " + frequency[i]);
		}
	}

}
