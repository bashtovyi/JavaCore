package edu.primitive;

public class Task7107 {

	public static void main(String[] args) {
		int[] array = { 1, 4, 5, 5 };
		boolean flag = false;
		int x = 5;
		int foundElementIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == x) {
				flag = true;
				foundElementIndex = i;
				break;
			}
		}

		if (flag) {
			System.out.println("Yes. Found " + foundElementIndex);
		} else {
			System.out.println("No found");
		}
	}

}
