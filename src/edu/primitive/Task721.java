package edu.primitive;

public class Task721 {

	public static void main(String[] args) {
		int[] array = new int[100];
		int index = 0;
		int i = 1;

		while (index < array.length) {
			if (i % 13 == 0 || i % 17 == 0) {
				array[index] = i;
				index = index + 1;

			}
			i = i + 1;
		}

		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.print("Натуральных чисел " + index);

	}

}
