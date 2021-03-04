package com.kosta.day03;

public class LAB2 {

	public static void main(String[] args) {
		int num1= Integer.parseInt(args[0]);
		int num2= Integer.parseInt(args[1]);
		
		System.out.println(abs(num1,num2));
	}

	private static int abs(int num1, int num2) {
		int result;
		
		result= (num1-num2<0)?Math.abs(num1-num2):(num1-num2);
		

		return result;
	}

}
