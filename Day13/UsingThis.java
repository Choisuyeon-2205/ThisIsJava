package com.kosta.day13;

@FunctionalInterface
interface ThisTestInterface{
	void test();
}

public class UsingThis {
	int a= 10;
	String java= "outter �ڹ�";
	
	class Inner{
		int b= 20;
		String java= "inner �ڹ�";
		
		void method(int score) { //�Ķ���͵� local ����
			String grade= "A����"; //local ����
			
			//score= 88; �����ϸ� ���� class���� ���Ұ�(final Ư��)
			//String grade= "B����"; �����ϸ� ���� class���� ���Ұ�(final Ư��)
			
			ThisTestInterface kim= () -> {
				System.out.println("outter���� ����: "+a);
				System.out.println("outter���� ����: "+UsingThis.this.a);
				System.out.println("inner���� ����: "+b);
				System.out.println("inner���� ����: "+this.b);
				System.out.println(java);
				System.out.println(UsingThis.this.java);
				System.out.println(this.java);
				//score= 88; �����Ұ�
				//grade="C"; �����Ұ�
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
