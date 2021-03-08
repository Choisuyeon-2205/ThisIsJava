package com.kosta.day10;

import java.util.Objects;

public class ObjectTest2 {

	public static void main(String[] args) {
		Long start1= System.currentTimeMillis();
		Long start2= System.nanoTime();
		System.out.println(start1); //����ð� ���(�и�������)
		System.out.println(start2);
		
		for(int i=0; i<1000000000; i++) {
			
		}
		
		System.out.println(System.currentTimeMillis()); //����ð� ���(�и�������)
		System.out.println(System.nanoTime());
		System.out.println("====�ɸ��ð�====");
		System.out.println(end1-start1+"�и�������");
		System.out.println(end2-start2+"�и�������");
		
		if(method2()) {
			System.out.println("null�̱���");
			//�Լ� ������ return;
			//���α׷� ����
			System.exit(0); //�Ϲ������� �������ᰡ 0�̴�.
		}else{
			System.out.println("null�̾ƴϴ�.");
		}
		
		System.out.println("main END");
	}

	private static boolean method2() {
		Book b1= null;
		System.out.println(b1 == null);
		
		System.out.println(Objects.isNull(b1)); //null�̴�?
		
		return Objects.isNull(b1);
		
	}

	private static void method1() {
		Book b1= new Book("�̰��� �ڹٴ�.",2000, true);
		Book b2= new Book("�̰��� �ڹٴ�.",2000, true);
		
		//Objects.equals: ��ü�� equals����
		boolean result= Objects.equals(b1, b2);
		System.out.println(result);
	}

}
