package edu.primitive;

public class Task722 {

	public static void main(String[] args) {
		int[] array = { 1, 4, 2, 4, 5, 7, 6 };
		int n = 3; // 1 4 2
		int m = 4; // 4 5 7 6
		// исходный массив
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		// m меняем с n
		for (int j = 0; j < m; j++) {
			int swap = array[array.length - 1];
			for (int i = array.length - 1; i > 0; --i) {
				if (i != 0) {
					array[i] = array[i - 1];
				}
			}
			array[0] = swap;
			//
		}

		// результатирующий массив
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
