package edu.primitive;

public class Task7104 {

	public static void main(String[] args) {
		int[] array = { -1, 4, -2, 4, 5, 10, 10000 };
		
		// исходный массив
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		int swap = array[array.length - 1];
		for (int i = array.length - 1; i > 0; --i) {
			if (i != 0) {
				array[i] = array[i - 1];
			}
		}
		array[0] = swap;
		
		// результатирующий массив
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
