package com.kosta.day09;

public class ExceptionTest {

	public static void main(String[] args) {
		method8();
		System.out.println("main END");

	}

	private static void method8() {
		try {
			int a=10/1;
			int [] arr = new int[5];
			arr[4]= 100;
			String s= "JAVA";
			System.out.println(s.length());
			Object obj= new String("�ڹ�");
			String str= (String)obj;
			Integer i= (Integer)obj; //cast ����
		}catch (ArithmeticException e) {
			System.out.println("0���� ���� �� ����");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("index���� ���");
		}catch (NullPointerException e) {
			System.out.println("null ���� �Ұ�");
		}catch (ClassCastException e) {
			System.out.println("����ȯ ����");
		}catch (Exception e) {
			System.out.println("��Ÿ ���ܹ߻�: "+e.getMessage());
		}finally {
			System.out.println("�ݵ�� �����Ѵ�.");
		}
		
	}

	private static void method7() {
		// ����ó��
		//1) �����Ѵ�.: try~catch~finally
		//2) ���ѱ��.
		try {
			System.out.println("���ܹ߻� ���ɼ��ִ� �����");
			int a= 10/0;
			System.out.println("�� ������ �������� �ʴ´�.");
		} catch (Exception e) {
			System.out.println("���ܹ߻� �� �����Ѵ�.");
		} finally {
			System.out.println("�׻� �����Ѵ�.");
			//�ڿ��ݳ��ڵ带 �Ѵ�. ex) DB�ݱ�, ���ϴݱ� ��
		}
		
	}

	private static void method6() {
		String s= new String("�ڹ�");
		//�ڵ�����ȯ
		Object s2= new String("�ڹ�");
		//��������ȯ
		try{
			String s3= (String)s2;
			Integer i= (Integer)s2; //����� ���� => instance of�� Ȯ���� ����O
		}catch(ClassCastException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void method5() {
		int[] arr= new int[5];
		try {
		System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace(); //������ ���� ��Ȳ�� ������
			System.out.println(e.getMessage());
		}
	}

	private static void method4() {
		try {
			String s= "�ڹ�";
			System.out.println(s.length()+"����");
			s= null;
			System.out.println(s.length()+"����");
		}catch(NullPointerException e) {
			System.out.println("null�� �����Ұ�");
		}

	}

	private static void method3() {
		//Exception�� ���� 2����: ������ �� ����, ���� �� ����(Runtime Exception)
		
		try {
			Class.forName("com.kosta.day09.Button");  //Button�� �޸𸮿� �÷���(������ �� ����)
			System.out.println("load ����");
		} catch (ClassNotFoundException e) {
			System.out.println("class load ����");
			e.printStackTrace();
		}
		
		
	}

	private static void method2() {
		int a=10;
		int b=0;
		try {
			//���ܹ߻� ���ɼ��� �ִ� �����
			System.out.println(a/b);
		}catch(ArithmeticException aa){
			System.out.println("0���� ������ �Ұ�");
		}
	}

	//������ �߻����� �ʵ��� �������� �߰��� ���� üũ
	//��������+ ����ó�������� ���δ�... �����ڵ� �ƴϴ�.
	//Exception���: ��������, ����ó�������� �и��Ѵ�.
	//�����߻� ��, ���α׷��� ������������ ������� �ʰ� �ϱ����ؼ� ����Ѵ�.
	private static void method1() {
		int a=10;
		int b=0;
		
		if(b==0) {
			System.out.println("������ ���� 0�� �� �� �����ϴ�.");
			return; //ȣ���� ������ ���ư���.
		}
		System.out.println(a/b);
	}

}
