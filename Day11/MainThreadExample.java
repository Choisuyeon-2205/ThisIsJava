package com.kosta.day11;

public class MainThreadExample {

	public static void main(String[] args) {
		Calculator cal= new Calculator();
		
		Thread t1= new User1("user1 ������", cal);
		Thread t2= new User2("user2 ������", cal);
		
		t1.start();
		t2.start();
	}
}
