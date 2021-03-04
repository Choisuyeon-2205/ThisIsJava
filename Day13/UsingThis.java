package com.kosta.day13;

@FunctionalInterface
interface ThisTestInterface{
	void test();
}

public class UsingThis {
	int a= 10;
	String java= "outter 자바";
	
	class Inner{
		int b= 20;
		String java= "inner 자바";
		
		void method(int score) { //파라미터도 local 변수
			String grade= "A학점"; //local 변수
			
			//score= 88; 수정하면 내부 class에서 사용불가(final 특성)
			//String grade= "B학점"; 수정하면 내부 class에서 사용불가(final 특성)
			
			ThisTestInterface kim= () -> {
				System.out.println("outter변수 접근: "+a);
				System.out.println("outter변수 접근: "+UsingThis.this.a);
				System.out.println("inner변수 접근: "+b);
				System.out.println("inner변수 접근: "+this.b);
				System.out.println(java);
				System.out.println(UsingThis.this.java);
				System.out.println(this.java);
				//score= 88; 수정불가
				//grade="C"; 수정불가
				System.out.println("score= "+ score);
				System.out.println("grade= "+ grade);
			};
			kim.test();
		}
	}
	
	public static void main(String[] args) {
		UsingThis.Inner inn= new UsingThis().new Inner();
		inn.method(99);
	}
}
