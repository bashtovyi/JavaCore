package edu.primitive;

public class Task7100 {
	// 1,9,3,2,
	// 1,9<->3

	public static void main(String[] args) {
		int[] array = { 1, 10, 5, 4554, -1312 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int swap = array[j + 1];
					array[j + 1] = array[j];
					array[j] = swap;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

	}
}
