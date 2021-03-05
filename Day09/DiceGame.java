package com.kosta.day09;

import com.kosta.day09.lab1.Dice;

class Dice {
	int size;
	Dice(int size){
		this.size = size;
	}
	int play(){
		int number = (int)(Math.random() * size) + 1;
		return number;
	}
}

public class DiceGame {
	public static void main(String args[]){
		DiceGame game = new DiceGame ();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);


	}
	int countSameEye(int n) {
		//try~ catch: 예외처리
		try {
			//throw: 예외 강제 발생
			if(n<0) throw new IllegalArgumentException("횟수는 음수 불가");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		//구현
		int count=0;
		Dice dice1= new Dice(8);
		Dice dice2= new Dice(8);
		
		for(int i=0; i<n; i++) {
			if(dice1.play() == dice2.play())
				count++;
		}
		
		return count;
	}
}
