package com.kosta.day07;

public class JavaBook extends Book{

	public JavaBook(String title, int price) {
		super(title, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printList() {
		System.out.println("자바책의 목차입니다.");
		
	}

	@Override
	public void answerExample() {
		System.out.println("자바책의 예제풀이입니다.");
		
	}

}
