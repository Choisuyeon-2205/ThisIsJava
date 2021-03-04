package com.kosta.day01;

public class VariableTest {
	
	static int speed; //전역변수는 초기화하지 않아도 오류가 나지 않는다.
	static double speed2;

	//main이 없으면 직접 실행이 불가하다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("speed="+ speed);
		System.out.println("speed2="+ speed2);
		
		System.out.println("\n변수는?");
		System.out.println("기억장소이름이다.");
		
		//10을 저장한다.
		//1. 변수 선언
		int a;
		//2. 변수에 값을 할당한다.
		a= 10;
		//3. 값을 읽어서 출력한다.
		System.out.println(10);
		System.out.println(a);
		
		//선언+ 할당
		int score= 100; //=은 대입 연산자
		score= score+10;
		score+= 10; //복합대입연산자
		//문자+ 숫자=> 문자 (연결연산자)
		System.out.println("\n점수는 "+score);
		
		int value= 10;
		int result= value+10; //초기화하지 않은 변수는 사용할 수 없다. =>local variable(지역변수) 반드시 초기화 해야한다.
		System.out.println(result);


	}

}
