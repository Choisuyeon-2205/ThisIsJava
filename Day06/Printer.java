package com.kosta.day06;

/*
 * 
 * @author KOSTA
 * method의 overloading: 이름 같고 매개변수 사양이 다르다.
 * 
 */

public class Printer {

	public void println(int num) {
		System.out.println("int: "+ num);
		println(true);
	}
	
	public void println(boolean num) {
		System.out.println("boolean: "+ num);
	}
	
	public void println(double num) {
		System.out.println("double: "+ num);
	}
	
	public void println(String s) {
		System.out.println("String: "+ s);
	}
}
