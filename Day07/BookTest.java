package com.kosta.day07;

public class BookTest {

	public static void main(String[] args) {
		print(new JavaBook("이것이 자바다", 30000));
		print(new SpringBook("SpringBook",35000));

	}
	
	public static void print(Book b) {
		b.printList();
		b.answerExample();
	}

}
