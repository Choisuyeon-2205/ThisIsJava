package com.kosta.day08;

public class OuterClass {
	//1. field
	static int sql;
	int java;
	//2. constructor
	//3. method
	void test(final String param,String param2) {
		String localVar="메소드 내의 지역변수...내부 class에서 사용시 수정불가";
		String localVar2="메소드 내의 지역변수... 내부사용안함";
		localVar2= "수정가능";
		param2= "수정가능";
		//변경 불가...localVar="aaa";
		//변경 불가... param="aaa";
		//5. inner class... local inner class: method안에 있다.
		//----method 내에서만 사용가능
		class LocalClass{
			int price=1000;
			//불가 static int price2= 2000;
			void printPrice() {
				System.out.println("Local instance 메소드: "+ price);
				System.out.println(param);
				System.out.println(localVar);
				//불가 param="aaa";
				//불가 localVar="aaa";
			}
			/*불가
			static void printPrice2() {
				System.out.println("Local instance메소드: "+price);
			} */
			
		}
		LocalClass local= new LocalClass();
		System.out.println(local.price);
		local.printPrice();
	}
	//4. static block
	
	//5. inner class... instance inner class
	class InnerClass{
		int a= 10; //인스턴스 변수
		
		InnerClass(){
			System.out.println("InnerClass 생성자");
		}
		//static int b= 20; 불가
		void test() {
			System.out.println("InnerClass instance method");
			System.out.println("outter의 instance 변수... java점수="+java);
			System.out.println("outter의 static 변수... sql점수="+sql);
		}
		//불가
//		static void test2() {
//			System.out.println("InnerClass instance method");
//		}
		
	}
	
	//5. inner class... static inner class
	static class StaticInnerClass{
		int score=100;
		static String grade= "A학점";
		
		StaticInnerClass(){
			System.out.println("StaticInnerClass의 생성자");
		}
		
		void printScore() {
			System.out.println("instance method: "+score);
			//불가 System.out.println("outter의 instance 변수... java점수="+java);
			System.out.println("outter의 static 변수... sql점수="+sql);
		}
		
		static void printGrade() {
			System.out.println("static method: "+grade);
			//불가 System.out.println("outter의 instance 변수... java점수="+java);
			System.out.println("outter의 static 변수... sql점수="+sql);
		}
		
	}

}
