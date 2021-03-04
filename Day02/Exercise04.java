package com.kosta.day02;

public class Exercise04 {

	public static void main(String[] args) {
		int dice, dice2;
		
		for(;;) {
			dice= (int)(Math.random()*6)+1;
			dice2= (int)(Math.random()*6)+1;
			
			System.out.println("("+dice+","+dice2+")");
			
			if(dice+dice2==5)
				break;
		}
		

	}

}
