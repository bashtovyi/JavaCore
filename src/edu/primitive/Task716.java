package edu.primitive;

public class Task716 {
	public static void main(String[] args) {
		int[] firstArray = { 1, 0, 0, 0 };
		int[] secondArray = { 3, 5, 7, 7 };
		int firstNumber = 0;
		int secondNumber = 0;

		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(firstArray[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < firstArray.length; i++) {
			int pow = 1;
			for (int j = 0; j < firstArray.length - 1 - i; j++) {
				pow = pow * 10;
			}
			firstNumber = firstNumber + firstArray[i] * pow;
		}

		for (int i = 0; i < secondArray.length; i++) {
			int pow = 1;
			for (int j = 0; j < secondArray.length - 1 - i; j++) {
				pow = pow * 10;
			}
			secondNumber = secondNumber + secondArray[i] * pow;
		}
		
		int result = firstNumber - secondNumber;
		System.out.print(result);

	}
}
