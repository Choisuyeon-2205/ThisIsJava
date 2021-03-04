package com.kosta.day02;
import java.util.Scanner;
//java.util 패키지에 있는 Scanner 클래스를 반복문이라는 class에서 사용허락

public class 반복문 {

	public static void main(String[] args) {
		//사용자가 키보드로 값을 입력하고 입력된 숫자까지의 합계를 출력한다.
		//System.out: 표준출력(모니터)
		//System.in: 표준입력(키보드)
		//Scanner class: 표준 입출력을 쉽게 하도록 도와주는 utility
		
		//java.lang 패키지에 들어있는 class는 무조건 사용가능
		//다른 패키지에 들어있는 class들은 import하고 사용한다.
		
		int num=0;
		Scanner sc= new Scanner(System.in);
		
		for(;;){
			
			System.out.print("숫자 입력>>>");
			num= sc.nextInt();
			
			if(num==0) {
				System.out.println("종료");
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
	//함수: 기능, 동작
	//파라미터(argument), 인자

	private static void sum4(int limit) {
		//1~100까지 더하기
				int sum=0;
				int su;
				
				for(su=1; su<=limit; su++) {
					sum+=su;
				}
				
				System.out.println("합계는 "+sum+"입니다.");
		
	}

	private static void sum3() {
		//1~10까지 더하기(dowhile)
		int sum=0;
		int su=1;
		
		do {
			sum+=su;
			su++;
		}while(su<=10);
		
		System.out.println("합계는 "+sum+"입니다.");
		
	}

	private static void sum2() {
		//1~10까지 더하기(while)
		int sum=0;
		int su=1;
		
		while(su<=10) {
			sum+=su;
			su++;
		}
		
		System.out.println("합계는 "+sum+"입니다.");
		
	}

	private static void sum() {
		//1~10까지 더하기
		int sum=0;
		int su;
		
		for(su=1; su<=10; su++) {
			sum+=su;
		}
		
		System.out.println("합계는 "+sum+"입니다.");
		
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
		// 1.초기값 설정 (1번 반드시 수행됝다.)
		// 2.조건문 체크해서 조건에 맞으면 계속 looping, 조건에 안맞으면 빠지게 됌
		// 3.for안에 있는 문장들 수행
		// 4.증감 수행
		// 5.2번으로간다.
		for(int i=0; i<5; i++) {
			System.out.println(i+":Hello");
		}
		System.out.println("for end-------");
		
		int i=1;
		for(;;) {
			if(i>5) {
				System.out.println("for문장을 나갑니다.");
				break;
			}
			System.out.println(i+":Hello");
			i++;
		}
	}

}
