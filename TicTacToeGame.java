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

	/*
	 * uc2 allow the palyer to choose a letter X or O
	 */
	public static char chooseLetter(char userChoose) {
		char computerChoose = ' ';
		if (userChoose == 'X' || userChoose == 'x') {
			computerChoose = 'O';
		} else if (userChoose == 'O' || userChoose == 'o') {
			computerChoose = 'X';
		} else {
			System.out.println("Invalid character");
		}
		return computerChoose;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Tic Tac Toe Game");
		TicTacToeGame t1 = new TicTacToeGame();
		t1.createEmptyBoard();
		System.out.println("Board is Initialized");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter");
		char player = sc.next().charAt(0);
		char computer = chooseLetter(player);
		System.out.println("player Symbol :" + player);
		System.out.println("computer symbol: " + computer);
	}
}