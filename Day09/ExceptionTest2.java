package com.kosta.day09;

//>java ExceptionTest2 10 3
//자동으로 예외 발생 -> 예외처리를 하지않았다면 자바가상머신(JVM)에 간다 
//JVM이 예외객체를 만들어준다.
//프로그램 중단

public class ExceptionTest2 {

	public static void main(String[] args) {
		// 명령행 매개변수 2개를 받아서 사칙연산 수행한다.
		//+,-,*,/,%
		//13,7,30,3,1
		try {
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		} catch(ArrayIndexOutOfBoundsException e) {
			//jvm이 만들어 준 예외객체를 받는다. => 처리
			System.out.println("예외처리:"+e.getMessage());
		} catch(NumberFormatException e) {
			//jvm이 만들어 준 예외객체를 받는다. => 처리
			System.out.println("예외처리:"+e.getMessage());
		} catch(ArithmeticException e) {
			//jvm이 만들어 준 예외객체를 받는다. => 처리
			System.out.println("예외처리:"+e.getMessage());
		}
		System.out.println("------main END------");
	}

}

//예외처리
//1) 내가한다.: try~catch~finally
//2)