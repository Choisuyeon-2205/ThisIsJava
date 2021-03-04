package com.kosta.day01;

public class VariableTest2 {

	//1.멤버변수..... 자동초기화된다.
	static int speed;
	//2.메소드 (예)메인 함수
	//3.static block
	//4.instance block
	//5.inner class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지역변수는 반드시 초기화 해야한다.
		int speed2;
		System.out.println("aaaaaa");
		speed ++; //1 증가한다.
		speed = speed +1;
		speed += 1;
		speed2= 100;
		
		System.out.println(speed);
		System.out.println(speed2);
	
		int a=100;
		{
			//int a=10;
			System.out.println("a="+ a);
		}
		// System.out.println("a="+ a);
		//a는 블럭안에서만 쓸 수 있다.! 지역변수

		
	}

}
