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
		
		System.out.println("���� ���� ������ "+ max);
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
		String s = bo.apply("�ڹ�", "���α׷�");
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
		System.out.println("����� "+result);
		
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
		System.out.println("����� "+result);
		
	}

	private static void method5() {
		BooleanSupplier supplier= () -> 10>20;	
		System.out.println(supplier.getAsBoolean());
		
	}

	private static void method4() {
		// ������(Supplier) interface
		Supplier<String> supplier= ()-> "���ڸ� �����մϴ�.";
		System.out.println(supplier.get());
	}
	
	private static void method3() {
		// ������(Supplier) interface
		Supplier<String> supplier= () -> {
			System.out.println("�Ķ���ʹ� ���� return�� �ִ�.");
			return "���ڸ� �����մϴ�.";
		};
		String s= supplier.get();
		System.out.println(s);
	}

	private static void method2() {
		// �Һ���(consumer) interface
		//�������̽��� �̹� ��������־ ������ �ϸ� �� 
		BiConsumer<String,Person> consumer= (a,b) ->{
			System.out.println("�Ķ���� 2�� �޾Ƽ� �����Ѵ�.");
			System.out.println("���� ��: "+a);
			System.out.println("���� ��: "+b);
		}; 
		consumer.accept("�ڹ����α׷���", new Person("ȫ�浿"));
		
	}

	private static void method1() {
		// �Һ���(consumer) interface
		//�������̽��� �̹� ��������־ ������ �ϸ� �� 
		Consumer<String> consumer= a ->{
			System.out.println("�Ķ���� 1�� �޾Ƽ� �����Ѵ�.");
			System.out.println("���� ��: "+a);
		}; 
		consumer.accept("�ڹ����α׷���");
		
	}

}
