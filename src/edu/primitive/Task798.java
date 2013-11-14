package edu.primitive;

public class Task798 {

	public static void main(String[] args) {

		int[] array = { -1, 2, 3, -11, 5, 9 };
		int max = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];

			}
		}
		System.out.println(max);

	}

}
