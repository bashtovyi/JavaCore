package edu.primitive;

public class Task799 {

	public static void main(String[] args) {
		int[] array = { 10, 2, -7, 6, -7, -7, 10 };
		int max = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				count = 1;
			} else {
				if (array[i] == max) {
					count = count + 1;
				}

			}
		}

		System.out.println(count);
	}

}
