package com.kosta.day07;

public class BookTest {

	public static void main(String[] args) {
		print(new JavaBook("�̰��� �ڹٴ�", 30000));
		print(new SpringBook("SpringBook",35000));

	}
	
	public static void print(Book b) {
		b.printList();
		b.answerExample();
	}

}
