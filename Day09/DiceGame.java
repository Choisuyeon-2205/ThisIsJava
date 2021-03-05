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
		System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result1);

		int result2 = game.countSameEye(-10);
		System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result2);


	}
	int countSameEye(int n) {
		//try~ catch: ����ó��
		try {
			//throw: ���� ���� �߻�
			if(n<0) throw new IllegalArgumentException("Ƚ���� ���� �Ұ�");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		//����
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
