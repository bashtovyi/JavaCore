package edu.primitive;

public class Task7102 {

	public static void main(String[] args) {
		int count = 0;
		int[] array = { 1, 0, 5, 0 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count = count + 1;
			}
		}
		System.out.println(count);

	}
}
