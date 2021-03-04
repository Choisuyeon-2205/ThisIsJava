package com.kosta.day02;

public class Switch {

	public static void main(String[] args) {
		int score= (int)(Math.random()*101);
		char grade;
	
		switch(score/10) {
		case 10: 
		case 9: grade='A';
				break;
		case 8: grade='B';
				break;
		case 7: grade='C';
				break;
		case 6: grade='D';
				break;
		default:grade='F';
		
		}

		System.out.println(score+"==>"+grade);

	}

}
