package com.capgemini.snakeandladdergame;

public class SnakeAndLadderGame {
	
	public static void main(String[] args) {
		
		//Variable
		int position = 0;
		int dieRoll = 0;
		
		System.out.println("Single player game begins with start position : "+position);
		
		//Die Rolling
		while (dieRoll == 0) {
			
			dieRoll = (int)(Math.floor(Math.random() * 10) % 7);
		}
	}
}
