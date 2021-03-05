package com.kosta.day08;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass aa= new MyClass(new Television());
		MyClass bb= new MyClass(new Audio());
		MyClass cc= new MyClass(new SmartTelevision());
		
		aa.methodA();
		bb.methodA();
		cc.methodA();
		
		aa.setRC(new SmartTelevision());
		bb.setRC(new SmartTelevision());
		cc.setRC(new SmartTelevision());
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
	}

}
