package com.kosta.day06.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		Child c= new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		c.method1();
		c.parentPrint();

	}

}
