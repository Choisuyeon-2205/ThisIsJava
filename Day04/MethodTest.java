package com.kosta.day04;
/*
 * >java MethodTest
 * MethodTest의 byte code가 method영역에 load
 * static붙은 변수, 메소드가 메모리에 올라온다.
 * static없는 메소드, 변수는 new 시에 올라간다.
 */
//메소드 overloading: 메소드 이름이 같고 매개변수 사양이 다르다.

public class MethodTest {
	int gas;
	
	//1. 파라미터 없음, return값 없음
	void sum() {
		System.out.println("1.파라미터 없음, return 없음");
	}
	
	//2. 매개변수가 있고, return값 없음
	void sum(int a, int b) {
		System.out.println("2.파라미터 있음, return 없음");
		System.out.println(a+b);
		System.out.println("----------------------------");
	}
	
	//2. 매개변수가 있고, return값 없음
	void sum(String a, String b) {
		System.out.println("2.파라미터 있음, return 없음");
		System.out.println(a+b);
		System.out.println("----------------------------");
	}
	
	//3. 매개변수가 있고, return값 있음
		double sum(double a, double b, double c) {
			System.out.println("3. 매개변수가 있고, return값 있음");
			return a+b+c;
		}
		
		boolean isLeftGas(int aa) { //매개변수
			int bb;
			if(gas==0)
				return false;
			return true;
			
		}
	
	public static void main(String[] args) {
		
		MethodTest aa= new MethodTest();
		aa.sum();
		aa.sum(10,20);
		aa.sum("자바","프로그래밍");
		double result= aa.sum(10.5,20.5,30.5);
		System.out.println("result= "+result);
		
		boolean b= aa.isLeftGas(1000);
		System.out.println(b);
		

	}

}
