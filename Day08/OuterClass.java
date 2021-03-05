package com.kosta.day08;

public class OuterClass {
	//1. field
	static int sql;
	int java;
	//2. constructor
	//3. method
	void test(final String param,String param2) {
		String localVar="�޼ҵ� ���� ��������...���� class���� ���� �����Ұ�";
		String localVar2="�޼ҵ� ���� ��������... ���λ�����";
		localVar2= "��������";
		param2= "��������";
		//���� �Ұ�...localVar="aaa";
		//���� �Ұ�... param="aaa";
		//5. inner class... local inner class: method�ȿ� �ִ�.
		//----method �������� ��밡��
		class LocalClass{
			int price=1000;
			//�Ұ� static int price2= 2000;
			void printPrice() {
				System.out.println("Local instance �޼ҵ�: "+ price);
				System.out.println(param);
				System.out.println(localVar);
				//�Ұ� param="aaa";
				//�Ұ� localVar="aaa";
			}
			/*�Ұ�
			static void printPrice2() {
				System.out.println("Local instance�޼ҵ�: "+price);
			} */
			
		}
		LocalClass local= new LocalClass();
		System.out.println(local.price);
		local.printPrice();
	}
	//4. static block
	
	//5. inner class... instance inner class
	class InnerClass{
		int a= 10; //�ν��Ͻ� ����
		
		InnerClass(){
			System.out.println("InnerClass ������");
		}
		//static int b= 20; �Ұ�
		void test() {
			System.out.println("InnerClass instance method");
			System.out.println("outter�� instance ����... java����="+java);
			System.out.println("outter�� static ����... sql����="+sql);
		}
		//�Ұ�
//		static void test2() {
//			System.out.println("InnerClass instance method");
//		}
		
	}
	
	//5. inner class... static inner class
	static class StaticInnerClass{
		int score=100;
		static String grade= "A����";
		
		StaticInnerClass(){
			System.out.println("StaticInnerClass�� ������");
		}
		
		void printScore() {
			System.out.println("instance method: "+score);
			//�Ұ� System.out.println("outter�� instance ����... java����="+java);
			System.out.println("outter�� static ����... sql����="+sql);
		}
		
		static void printGrade() {
			System.out.println("static method: "+grade);
			//�Ұ� System.out.println("outter�� instance ����... java����="+java);
			System.out.println("outter�� static ����... sql����="+sql);
		}
		
	}

}
