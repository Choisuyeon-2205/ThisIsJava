package com.kosta.day02;
import java.util.Scanner;
//java.util ��Ű���� �ִ� Scanner Ŭ������ �ݺ����̶�� class���� ������

public class �ݺ��� {

	public static void main(String[] args) {
		//����ڰ� Ű����� ���� �Է��ϰ� �Էµ� ���ڱ����� �հ踦 ����Ѵ�.
		//System.out: ǥ�����(�����)
		//System.in: ǥ���Է�(Ű����)
		//Scanner class: ǥ�� ������� ���� �ϵ��� �����ִ� utility
		
		//java.lang ��Ű���� ����ִ� class�� ������ ��밡��
		//�ٸ� ��Ű���� ����ִ� class���� import�ϰ� ����Ѵ�.
		
		int num=0;
		Scanner sc= new Scanner(System.in);
		
		for(;;){
			
			System.out.print("���� �Է�>>>");
			num= sc.nextInt();
			
			if(num==0) {
				System.out.println("����");
				break;
			}
		
			sum4(num);
		
		}
		
		sc.close();
		//forTest();
		//whileTest();
		//doWhileTest();
		//sum();
		//sum2();
		//sum3();
		
	}
	//�Լ�: ���, ����
	//�Ķ����(argument), ����

	private static void sum4(int limit) {
		//1~100���� ���ϱ�
				int sum=0;
				int su;
				
				for(su=1; su<=limit; su++) {
					sum+=su;
				}
				
				System.out.println("�հ�� "+sum+"�Դϴ�.");
		
	}

	private static void sum3() {
		//1~10���� ���ϱ�(dowhile)
		int sum=0;
		int su=1;
		
		do {
			sum+=su;
			su++;
		}while(su<=10);
		
		System.out.println("�հ�� "+sum+"�Դϴ�.");
		
	}

	private static void sum2() {
		//1~10���� ���ϱ�(while)
		int sum=0;
		int su=1;
		
		while(su<=10) {
			sum+=su;
			su++;
		}
		
		System.out.println("�հ�� "+sum+"�Դϴ�.");
		
	}

	private static void sum() {
		//1~10���� ���ϱ�
		int sum=0;
		int su;
		
		for(su=1; su<=10; su++) {
			sum+=su;
		}
		
		System.out.println("�հ�� "+sum+"�Դϴ�.");
		
	}

	private static void doWhileTest() {
		int i=0;
		do {
			System.out.println(i+":Hello");
			i++;
		}while(i<5);
		
		System.out.println("do while end");
	}

	private static void whileTest() {
		for(int i=0;i<5;i++) {
			System.out.println(i+":Hello");
		}
		
		int i=0;
		while(i<5) {
			System.out.println(i+":Hello");
			i++;
		}
		
		System.out.println("while end");
	}

	private static void forTest() {
		
		System.out.println("for start-------");
		// 1.�ʱⰪ ���� (1�� �ݵ�� �����ܴ�.)
		// 2.���ǹ� üũ�ؼ� ���ǿ� ������ ��� looping, ���ǿ� �ȸ����� ������ ��
		// 3.for�ȿ� �ִ� ����� ����
		// 4.���� ����
		// 5.2�����ΰ���.
		for(int i=0; i<5; i++) {
			System.out.println(i+":Hello");
		}
		System.out.println("for end-------");
		
		int i=1;
		for(;;) {
			if(i>5) {
				System.out.println("for������ �����ϴ�.");
				break;
			}
			System.out.println(i+":Hello");
			i++;
		}
	}

}
