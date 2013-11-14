package edu.primitive;

public class Task724 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 4, 6, 16, 11, 45, 6, 22, 4 };
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
