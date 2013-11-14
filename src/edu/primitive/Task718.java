package edu.primitive;

public class Task718 {

	public static void main(String[] args) {
		int[] array1 = { 1, 3, 4, 5, 6, 7 };
		int[] array2 = { -1, 4, 5, 6, 7 };

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.print(array1[i] + " ");
				}
			}

		}

	}

}
