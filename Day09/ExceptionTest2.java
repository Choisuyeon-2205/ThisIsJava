package com.kosta.day09;

//>java ExceptionTest2 10 3
//�ڵ����� ���� �߻� -> ����ó���� �����ʾҴٸ� �ڹٰ���ӽ�(JVM)�� ���� 
//JVM�� ���ܰ�ü�� ������ش�.
//���α׷� �ߴ�

public class ExceptionTest2 {

	public static void main(String[] args) {
		// ����� �Ű����� 2���� �޾Ƽ� ��Ģ���� �����Ѵ�.
		//+,-,*,/,%
		//13,7,30,3,1
		try {
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		} catch(ArrayIndexOutOfBoundsException e) {
			//jvm�� ����� �� ���ܰ�ü�� �޴´�. => ó��
			System.out.println("����ó��:"+e.getMessage());
		} catch(NumberFormatException e) {
			//jvm�� ����� �� ���ܰ�ü�� �޴´�. => ó��
			System.out.println("����ó��:"+e.getMessage());
		} catch(ArithmeticException e) {
			//jvm�� ����� �� ���ܰ�ü�� �޴´�. => ó��
			System.out.println("����ó��:"+e.getMessage());
		}
		System.out.println("------main END------");
	}

}

//����ó��
//1) �����Ѵ�.: try~catch~finally
//2)