package com.kosta.day13;

interface Arg1Interface{
	void print(int num);
}

interface Arg2Interface{
	int print(int num, int num2);
}




public class LambdaExample2 {

	public static void main(String[] args) {
		//method1();
		//method2();
		method3();
	}

	private static void method3() {
		Arg2Interface aa= (su1, su2)-> su1+su2;
		
		int result= aa.print(100, 200);
		System.out.println("result= "+result);
	}

	private static void method2() {
		Arg2Interface aa= (su1, su2)->{
			System.out.println("su1= "+su1);
			System.out.println("su2= "+su2);
			return su1+su2;
		};
		int result= aa.print(100, 200);
		System.out.println("result= "+result);
		
	}

	private static void method1() {
		Arg1Interface a= (su) -> {
			System.out.println(su+10);
			System.out.println(su-10);
		};
		a.print(5);
	}
}
