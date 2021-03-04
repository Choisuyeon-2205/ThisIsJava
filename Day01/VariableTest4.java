package com.kosta.day01;

public class VariableTest4 {

	public static void main(String[] args) {
		// 자바의 기본타입 8가지
		// 데이터타입 (데이터성격)
		//1.정수(byte(1) < short(2) < int(4) < long(8))
		//                char(2)<-음수가 없음
		//2.실수(float(4) < double(8))
		//3.논리(boolean)
		
		byte b= 127;
		short s= 32767;
		char c= 65535;
		int i= 2147483647; //4 바이트, default: int
		long lo= 2147483648L; //L, l 표시해주기
		float f= 3.14f;
		double d= 3.14; //default: double
		boolean bo= 10>20; //false|true
		System.out.println(bo);
		
		i++;
		System.out.println(i);
		
		//data의 형변환: 자동|강제(명시적)
		//1.자동(큰방=작은값)
		byte aa= 127;
		short ss= 100;
		int ii= aa;
		ii= ss;
		double dd= ii;
		char cc='A'; //65
		cc= 'a'; //97
		
		// ss = cc; short랑 char끼리 형변환이 안됌
		ii= cc;
		
		System.out.println(dd);
		System.out.println(ii);
		
		//2. 강제형변환
		//범위를 벗어나면 값이 손실된다.
		byte b2= 100;
		int i2= 100;
		
		// i2= b2; (자동형변환)
		b2= (byte)i2;
		System.out.println(b2);
		System.out.println(i2);
		
		char c2= (char)i2;
		System.out.println(c2);
		System.out.println(i2);
		
		System.out.println('A');
		System.out.println((int)'A');
		
		
		
		
	}

}
