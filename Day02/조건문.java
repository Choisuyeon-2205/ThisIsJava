package com.kosta.day02;

public class ���ǹ� {

	public static void main(String[] args) {
		//ifTest();
		//ifElseTest();
		ifElseIfTest();
	}

	private static void ifElseIfTest() {
		int score= 100;
		char grade= 'F';
		//90~ : A
		//80~ : B
		//70~ : C
		//60~ : D
		//0~  :F
		
		if (score>=90) {
			System.out.println("�����ߴ�...A");
			if(score>=95) {
				grade='+';
			}else {
				grade='-';
			}
		}else if(score>=80) {
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else if(score>=60) {
			grade='D';
		}
//			else {
//			grade='F';
//		}
		System.out.println("����� ������ "+grade);
		
	}

	private static void ifElseTest() {
		int score= 100;
		if (score>=60) {
			//������ ����� ���� ��츸 ����
			System.out.println("�հ�");
		}else {
			//������ ����� ������ ��츸 ����
			System.out.println("���հ�");
		}
		
		//3�׿�����
		System.out.println(score>=60?"�հ�":"���հ�");
		
		System.out.println("ifelse end");
		
	}

	private static void ifTest() {
		int score= 50;
		//���ǹ��� ���๮�� ���������̸� �ݵ�� ���� ����Ѵ�.
		if (score>=90) {
			System.out.println("�հ�");
			System.out.println("�����մϴ�.");
	    }
		if (score>=90)
			System.out.println("�հ�");
		
		System.out.println(score>=90?"�հ�":"");
		
		System.out.println("if ��~");

    }
}
