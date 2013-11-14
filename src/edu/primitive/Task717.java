package edu.primitive;

public class Task717 {

	public static void main(String[] args) {
		int[] firstArray = { 1, 2, 3, 4, 5, 5, 8 };
		int[] secondArray = { 3, 4, 5, 6, 7 };

		for (int i = 0; i < firstArray.length; i++) {
			for (int j = 0; j < firstArray.length; j++) {
				if (firstArray[i] == firstArray[j] && i != j) {
					firstArray[i] = -1;
				}
			}
			if (firstArray[i] != -1) {
				System.out.print(firstArray[i] + " ");
			}
		}

		for (int i = 0; i < secondArray.length; i++) {
			boolean isUnique = false;
			for (int j = 0; j < firstArray.length; j++) {
				if (secondArray[i] == firstArray[j]) {
					isUnique = true;
					break;
				}
			}
			if (!isUnique) {
				System.out.print(secondArray[i] + " ");
			}

		}

	}
}
