package edu.primitive;

public class MultiArrays {

	public static void main(String[] args) {
		int[][] doubleArray = new int[4][4];

		for (int i = 0; i < doubleArray.length; i++) {
			for (int j = 0; j < doubleArray[i].length; j++) {
				if (i < j) {
					doubleArray[i][j] = 0;
				} else {
					doubleArray[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < doubleArray.length; i++) {
			for (int j = 0; j < doubleArray[i].length; j++) {
				System.out.print(doubleArray[i][j] + " ");
			}
			System.out.println();
		}

	}

}
