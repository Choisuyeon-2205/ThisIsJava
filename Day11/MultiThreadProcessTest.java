package com.kosta.day11;

public class MultiThreadProcessTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"시작");
		
		//MultiThread 사용하기
		//1. thread를 상속받은 class를 이용 -> alphabetThread(대문자 출력)
		//2. runnable interface를 구현한 class 이용 -> alphabetThread2(소문자 출력)
		Thread t1= new AlphabetThread();
		Runnable r1= new AlphabetThread2();
		Thread t2= new Thread(r1);
		Thread t3= new AlphabetThread();
		
		t1.setName("대문자1");
		t2.setName("소문자1");
		t3.setName("대문자2");
		
		t1.start(); //run이 자동 실행된다.
		t2.start(); 
		t3.start(); 
		
		//main은 숫자 출력
		for(int c=1; c<=26; c++) {
			System.out.print(c+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println();
		
		System.out.println(Thread.currentThread().getName()+"끝");
	}

}
