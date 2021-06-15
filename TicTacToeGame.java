package com.bridgelabz.tictactoegame;

public class TicTacToeGame {

	static char[] board = new char[10];

	/**
	 * uc1 creating EmptyBoard of size 10
	 */
	public void createEmptyBoard() {
		try {
			for (int i = 1; i <= board.length; i++) {
				board[i] = ' ';
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Tic Tac Toe Game");
		TicTacToeGame t1 = new TicTacToeGame();
		t1.createEmptyBoard();
		System.out.println("Board is Initialized");
	}
}