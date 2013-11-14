package edu.primitive;
// final
public class Task719 {

	public static void main(String[] args) {
		int[] firstArray = { -1, 2, 4, 6, 8, 9 };
		int[] secondArray = { 2, 3, 6, 8, 9, 10, 10 };

		System.out.print("Array 1: ");

		for (int i = 0; i < firstArray.length; i++) {
			boolean isUniqueElement = true;
			for (int j = 0; j < secondArray.length; j++) {
				if (firstArray[i] == secondArray[j]) {
					isUniqueElement = false;
					break;
				}
			}
			if (isUniqueElement) {
				System.out.print(firstArray[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Array 2: ");

		for (int i = 0; i < firstArray.length; i++) {
			boolean isUniqueElement = true;
			for (int j = 0; j < secondArray.length; j++) {
				if (secondArray[i] == firstArray[j]) {
					isUniqueElement = false;
					break;
				}
			}
			if (isUniqueElement) {
				System.out.print(secondArray[i] + " ");
			}
		}
	}
}
