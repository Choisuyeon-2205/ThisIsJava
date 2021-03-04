package com.kosta.day04;

import java.io.InputStream;
import java.util.Scanner;

public class ClassTest {

	public static void main(String[] args) {
		//1. 객체 참조변수 선언
		String s1,s2,s3,s4;
		//2. 객체 생성
		s1= new String();
		s2= new String("자바");
		byte[] b = {65,66,67};
		char[] c= {'a','b','c','d'};
		s3= new String(b);
		s4= new String(c);
		
		//3. 객체 사용
		System.out.println("*"+s1+"*");
		System.out.println("*"+s2+"*");
		System.out.println("*"+s3+"*");
		System.out.println("*"+s4+"*");
		
		InputStream aa= System.in; //표준입력 얻기(키보드)
		//aa.read();
		Scanner sc= new Scanner(aa);
		String s= sc.nextLine();
		System.out.println("당신의 입력은 "+s);
	}
	

}
