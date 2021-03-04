package com.kosta.day02;

public class ifTest {

	public static void main(String[] args) {
		//randomTest();
		randomTest2();
		
	}

	private static void randomTest2() {
		// 무작위 수 만들기
		int dice= (int)(Math.random()*6)+1;
		System.out.println(dice);
		//짝수인지? 홀수인지? 판단
		String result;
		if(dice%2==1)
			result="홀수";
		else
			result="짝수";
		
		System.out.println(dice+"===>"+ result);
		System.out.println(dice+"===>"+(dice%2==0?"짝수입니다.":"홀수입니다."));
		
		System.out.println(result+"입니다.");
		
	}

	private static void randomTest() {
		// Math: 수학공식에서 필요한 기능들을 모아놓은 class
		System.out.println(Math.PI);
		System.out.println(Math.random()); //0<=random<1
		System.out.println((int)(Math.random()*10)+1); //1<=random<=10
		//1<=로또<=45
		System.out.println((int)(Math.random()*45)+1); //1<=random<=45
		
	}

}
