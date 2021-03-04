package com.kosta.day02;

public class 조건문 {

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
			System.out.println("참잘했다...A");
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
		System.out.println("당신의 학점은 "+grade);
		
	}

	private static void ifElseTest() {
		int score= 100;
		if (score>=60) {
			//조건의 결과가 참인 경우만 실행
			System.out.println("합격");
		}else {
			//조건의 결과가 거짓인 경우만 실행
			System.out.println("불합격");
		}
		
		//3항연산자
		System.out.println(score>=60?"합격":"불합격");
		
		System.out.println("ifelse end");
		
	}

	private static void ifTest() {
		int score= 50;
		//조건문에 실행문이 여러문장이면 반드시 블럭을 사용한다.
		if (score>=90) {
			System.out.println("합격");
			System.out.println("축하합니다.");
	    }
		if (score>=90)
			System.out.println("합격");
		
		System.out.println(score>=90?"합격":"");
		
		System.out.println("if 끝~");

    }
}
