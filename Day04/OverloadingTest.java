package com.kosta.day04;

public class OverloadingTest {
	public static void sum(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void sum(String a,String b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		sum(10,20);
		sum("�ڹ�","���α׷�");

	}

}
