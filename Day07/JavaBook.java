package com.kosta.day07;

public class JavaBook extends Book{

	public JavaBook(String title, int price) {
		super(title, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printList() {
		System.out.println("�ڹ�å�� �����Դϴ�.");
		
	}

	@Override
	public void answerExample() {
		System.out.println("�ڹ�å�� ����Ǯ���Դϴ�.");
		
	}

}
