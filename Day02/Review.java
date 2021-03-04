package com.kosta.day02;
/*
 * 2021.02.16 �ּ���
 * ����
 * 1. Review.java �ҽ��ۼ�
 * 2. ������(byte code�� ����, binary code�� �ƴ�, �߰����, Assembly ��� ���)
 * 3. JVM�� ���� >java Review
 * -> 01110000110
 * 
 */

public class Review {

	public static void main(String[] args) {
		//main�� �ڹٰ���ӽ��� �ڵ�����
		System.out.println("main ����");
		//dataTypeTest();
		castTest();
		System.out.println("main ��");
	}

	private static void castTest() {
		int i;
		char c='A';
		i= c;
		System.out.println(i);
		
		c= (char)i;
		c++;
		System.out.println(c);
		
	}

	private static void dataTypeTest() {
		// �⺻��: byte(1), short(2), char(2), int(4), long(8)
		//       float(4), double(8)
		//       boolean(1)
		// Wrapper class: �⺻��+��� ==> class
		// ����: data����, ����, ��
		// 1. ��������
		int javaScore;
		long aa= Integer.MAX_VALUE+1L;
		double pi= 3.14;
		float pi2= 3.14f;
		
		// 2. �� �Ҵ�(����)
		javaScore=100;
		// 3. ���
		System.out.println(javaScore+10);
		System.out.println(aa);
		System.out.println(pi);
		System.out.println(pi2);
		
		
	}

}
