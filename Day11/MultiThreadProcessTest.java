package com.kosta.day11;

public class MultiThreadProcessTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"����");
		
		//MultiThread ����ϱ�
		//1. thread�� ��ӹ��� class�� �̿� -> alphabetThread(�빮�� ���)
		//2. runnable interface�� ������ class �̿� -> alphabetThread2(�ҹ��� ���)
		Thread t1= new AlphabetThread();
		Runnable r1= new AlphabetThread2();
		Thread t2= new Thread(r1);
		Thread t3= new AlphabetThread();
		
		t1.setName("�빮��1");
		t2.setName("�ҹ���1");
		t3.setName("�빮��2");
		
		t1.start(); //run�� �ڵ� ����ȴ�.
		t2.start(); 
		t3.start(); 
		
		//main�� ���� ���
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
		
		System.out.println(Thread.currentThread().getName()+"��");
	}

}
