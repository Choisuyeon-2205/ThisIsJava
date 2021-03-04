package com.kosta.day13;

import java.util.function.*;
import com.kosta.day12.Person;

interface LongToDoubleFunction2{
	double applyAsDouble(long num);
}

public class LambdaExample3 {

	public static void main(String[] args) {
		method11();

	}
	
	private static void method11() {
		int[] scores= {100,30,70,200,99};
		int max= 0;
		
		IntBinaryOperator f = (a,b) -> {
			if(a>b) 
				return a;
			return b;
		};
		
		for(int i=0; i<scores.length; i++) {
			max= f.applyAsInt(scores[i], max);
		}
		
		System.out.println("가장 높은 정수는 "+ max);
	}

	private static void maxOrMin(IntBinaryOperator ibo) {
		int result = ibo.applyAsInt(10, 20);
		System.out.println("result= "+result);
	}
	
	private static void method10() {
		maxOrMin((a,b) -> {
			if(a>=b) return a;
			return b;
		});
		
		
		
	}

	private static void method9() {
		BinaryOperator<String> bo= (a,b)-> a+b;
		String s = bo.apply("자바", "프로그램");
		System.out.println(s);
	}

	private static void method8() {
		LongToDoubleFunction f= (a)-> a*Math.PI;
		double d= f.applyAsDouble(100);
		System.out.println(d);
		
		LongToDoubleFunction2 f2= (a)-> a*Math.PI;
		double d2= f.applyAsDouble(100);
		System.out.println(d2);
		
	}

	private static void method7() {
		BiFunction<Integer, Integer, String> f= (num1, num2) -> {
			String grade= "F";
			int a= num1+ num2;
			
			if(a>=90) grade="A";
			else if(a>=80) grade="B";
			else if(a>=70) grade="C";
			else if(a>=60) grade="D";
			return grade;
		};
		String result = f.apply(40,40);
		System.out.println("결과는 "+result);
		
	}
	
	private static void method6() {
		Function<Integer,String> f= (a) -> {
			String grade= "F";
			if(a>=90) grade="A";
			else if(a>=80) grade="B";
			else if(a>=70) grade="C";
			else if(a>=60) grade="D";
			return grade;
		};
		String result = f.apply(99);
		System.out.println("결과는 "+result);
		
	}

	private static void method5() {
		BooleanSupplier supplier= () -> 10>20;	
		System.out.println(supplier.getAsBoolean());
		
	}

	private static void method4() {
		// 공급자(Supplier) interface
		Supplier<String> supplier= ()-> "문자를 공급합니다.";
		System.out.println(supplier.get());
	}
	
	private static void method3() {
		// 공급자(Supplier) interface
		Supplier<String> supplier= () -> {
			System.out.println("파라미터는 없고 return만 있다.");
			return "문자를 공급합니다.";
		};
		String s= supplier.get();
		System.out.println(s);
	}

	private static void method2() {
		// 소비자(consumer) interface
		//인터페이스가 이미 만들어져있어서 구현만 하면 됌 
		BiConsumer<String,Person> consumer= (a,b) ->{
			System.out.println("파라미터 2개 받아서 실행한다.");
			System.out.println("받은 값: "+a);
			System.out.println("받은 값: "+b);
		}; 
		consumer.accept("자바프로그래밍", new Person("홍길동"));
		
	}

	private static void method1() {
		// 소비자(consumer) interface
		//인터페이스가 이미 만들어져있어서 구현만 하면 됌 
		Consumer<String> consumer= a ->{
			System.out.println("파라미터 1개 받아서 실행한다.");
			System.out.println("받은 값: "+a);
		}; 
		consumer.accept("자바프로그래밍");
		
	}

}
