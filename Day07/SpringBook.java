package com.kosta.day07;

public class SpringBook extends Book{

	public SpringBook(String title, int price) {
		super(title, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printList() {
		System.out.println("������å�� �����Դϴ�.");
		
	}

	@Override
	public void answerExample() {
		System.out.println("������å�� ����Ǯ���Դϴ�.");
		
	}

}
