package com.kosta.day08;

interface SuperInterface{
	void method5();
	
}

interface A extends SuperInterface{
	void method1();
	void method2();
}

interface B{
	void method3();
	void method4();
}

class 구현class implements A,B{

	@Override
	public void method3() {
		System.out.println("구현class의 method3");
		
	}

	@Override
	public void method4() {
		System.out.println("구현class의 method4");
		
	}

	@Override
	public void method1() {
		System.out.println("구현class의 method1");
		
	}

	@Override
	public void method2() {
		System.out.println("구현class의 method2");
		
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		
	}
		
}

class 구현class2 implements A,B{

	@Override
	public void method3() {
		System.out.println("구현class2의 method3");
		
	}

	@Override
	public void method4() {
		System.out.println("구현class2의 method4");
		
	}

	@Override
	public void method1() {
		System.out.println("구현class2의 method1");
		
	}

	@Override
	public void method2() {
		System.out.println("구현class2의 method2");
		
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		
	}
		
}

public class InterfaceTest {
	public static void main(String[] args) {
		infoPrint(new 구현class());
		infoPrint(new 구현class2());
		
		infoPrint(makeAnonymous());
		infoPrintB(makeAnonymousB());
		
	}


	private static A makeAnonymous() {
		return new A() {
			@Override
			public void method1() {
				System.out.println("익명 method1");

			}

			@Override
			public void method2() {
				System.out.println("익명 method2");

			}

			@Override
			public void method5() {
				// TODO Auto-generated method stub
				
			}
		};
	}

	private static B makeAnonymousB() {
		return new B() {
			@Override
			public void method3() {
				System.out.println("익명 method3");

			}

			@Override
			public void method4() {
				System.out.println("익명 method4");

			}
		};
	}


	private static void infoPrint(A aa) {
		aa.method1();
		aa.method2();
		aa.method5();
		
		if(aa instanceof B) {
			B bb= ((B)aa);
			bb.method3();
			bb.method4();
		}
		System.out.println("**************************");
	}
	
	private static void infoPrintB(B aa) {
		aa.method3();
		aa.method4();
		
		if(aa instanceof A) {
			A bb= ((A)aa);
			bb.method1();
			bb.method2();
			bb.method5();
		}
		System.out.println("**************************");
	}

}
