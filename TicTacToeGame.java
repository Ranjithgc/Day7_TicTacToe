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
	 * uc2: allow the palyer to choose a letter X or O
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

	/**
	 * uc3:to display the current board
	 */
	public void show() {
		System.out.println("\n" + board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("-------------");
		System.out.println("\n" + board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("------------");
		System.out.println("\n" + board[7] + " | " + board[8] + " | " + board[9]);
	}

	/**
	 * uc4: insert letter between the index 0-9
	 */
	public static void move(char letter) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index for user between 0-9");
		int index = sc.nextInt();
		try {
			if (board[index] == ' ') {
				board[index] = letter;
			} else {
				System.out.println("not empty");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
		}
	}	

	/**
	 * uc5: checking the free space before making the desired move
	 */
	private static boolean isSpaceFree(int index) {
		try {
			return board[index] == ' ';
		} catch (ArrayIndexOutOfBoundsException e) {

		}
		return false;
	}	
	
	/**
	 * uc6: do a toss to check who plays first
	 */
	public static int toss() {

		Random random = new Random();
		int value = 1 + random.nextInt(2 - 1 + 1);
		if (value == 1) {
			System.out.println("User will play first");
			return value;
		} else {
			System.out.println("Computer will play first ");
			return value;
		}
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
		t1.show();
		move(player);
		t1.show();
		isSpaceFree(player);
		int first = toss();
		if (first == 1) {
			move(player);
		} else {
			move(player);
		}
		System.out.println("Current Board:");
		t1.show();
	}
}