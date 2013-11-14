package edu.primitive;

public class Task7103 {
	public static void main(String[] arg) {
		int[] array = { 1, 2, 3, 5, 2, 1 };
		boolean flag = true;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array[array.length - 1 - i]) {
				flag = false;
				break;
			}
		}
		System.out.println();
		if (flag) {
			System.out.print("Симетричен");
		} else {
			System.out.print("Не симметричен");
		}
	}
}
