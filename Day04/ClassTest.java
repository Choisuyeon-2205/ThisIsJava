package com.kosta.day04;

import java.io.InputStream;
import java.util.Scanner;

public class ClassTest {

	public static void main(String[] args) {
		//1. ��ü �������� ����
		String s1,s2,s3,s4;
		//2. ��ü ����
		s1= new String();
		s2= new String("�ڹ�");
		byte[] b = {65,66,67};
		char[] c= {'a','b','c','d'};
		s3= new String(b);
		s4= new String(c);
		
		//3. ��ü ���
		System.out.println("*"+s1+"*");
		System.out.println("*"+s2+"*");
		System.out.println("*"+s3+"*");
		System.out.println("*"+s4+"*");
		
		InputStream aa= System.in; //ǥ���Է� ���(Ű����)
		//aa.read();
		Scanner sc= new Scanner(aa);
		String s= sc.nextLine();
		System.out.println("����� �Է��� "+s);
	}
	

}
