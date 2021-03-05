package com.kosta.day07;

public class SpringBook extends Book{

	public SpringBook(String title, int price) {
		super(title, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printList() {
		System.out.println("스프링책의 목차입니다.");
		
	}

	@Override
	public void answerExample() {
		System.out.println("스프링책의 예제풀이입니다.");
		
	}

}
