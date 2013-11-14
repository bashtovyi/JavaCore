package edu.primitive;

public class Task7106 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 5, 4 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for (int i = 1; i < array.length - 1; i++) {
			array[i] = (array[i - 1] + array[i + 1]) / 2;
		}
		
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
