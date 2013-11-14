package edu.primitive;

public class Chess {

	public static void main(String[] args) {
		int[][] chessBoard = new int[8][8];

		boolean cell = true;
		for (int i = 0; i < chessBoard.length; i++) {
			for (int j = 0; j < chessBoard.length; j++) {
				if (cell) {
					chessBoard[i][j] = 1;
					cell = false;
				} else {
					cell = true;
				}
			}
			if (cell) {
				cell = false;
			} else {
				cell = true;
			}
		}

		for (int i = 0; i < chessBoard.length; i++) {
			System.out.println();
			for (int j = 0; j < chessBoard[i].length; j++) {
				System.out.print(chessBoard[i][j] + " ");
			}
		}
		System.out.println();

	}

}
