package com.kosta.day11;

public class JoinExample {

	public static void main(String[] args) {
		SumThread t= new SumThread();
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1~100���� �հ�: "+t.getSum());

	}

}
