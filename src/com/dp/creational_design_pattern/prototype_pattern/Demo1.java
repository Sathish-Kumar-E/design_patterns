package com.dp.creational_design_pattern.prototype_pattern;

import java.util.List;
import java.util.ArrayList;


interface Prototype<T> {
	public T clone();
}


class GamePiece implements Prototype<GamePiece> {
	private String color;
	private int position;
	
	public GamePiece(String color, int position) {
		this.color = color;
		this.position = position;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public String getColor() {
		return color;
	}

	public int getPosition() {
		return position;
	}
	
	@Override
	public GamePiece clone() {
		return new GamePiece(this.color, this.position);
	}
	
	@Override
	public String toString() {
		return "GamePiece [color=" + color + ", position=" + position + "]";
	}
}


class GameBoard implements Prototype<GameBoard> {
	private List<GamePiece> pieces = new ArrayList<>();
	
	public void addPiece(GamePiece piece) {
		pieces.add(piece);
	}
	
	public List<GamePiece> getPieces() {
		return pieces;
	}
	
	public void showBoardState() {
		for(GamePiece piece : pieces) {
			System.out.println(piece);
		}
	}
	
	@Override
	public GameBoard clone() {
		GameBoard newBoard = new GameBoard();
		for(GamePiece piece : pieces) {
			newBoard.addPiece(piece.clone()); // Deep Copy
											  // Shallow Copy - newBoard.addPiece(piece);
		}
		return newBoard;
	}
}


//Game Client
public class Demo1 {
	public static void main(String[] args) {
		GameBoard gameBoard = new GameBoard();
		gameBoard.addPiece(new GamePiece("Red", 1));
		gameBoard.addPiece(new GamePiece("Blue", 5));
		System.out.println("Current Board State");
		System.out.println("-------------------");
		gameBoard.showBoardState();
		
		// Checkpoint this state
		GameBoard copiedBoard = gameBoard.clone(); // Decoupled
		
		System.out.println("\nCopied Board State");
		System.out.println("------------------");
		copiedBoard.showBoardState();
	}
}

