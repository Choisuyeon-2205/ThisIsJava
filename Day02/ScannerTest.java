package com.kosta.day02;
import java.util.*;

public class ScannerTest {

	public static void main(String[] args) {
		method1();

	}

	private static void method1() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("�̸�>>");
		String name= sc.next();
		
		System.out.print("����>>");
		int age= sc.nextInt();
		
		sc.nextLine();  //������ ������߉�
		
		System.out.print("�ּ�>>");
		String addr= sc.nextLine();
		
		System.out.println("�̸��� "+name+", ���̴� "+ age+"�Դϴ�.");
		System.out.println("�ּҴ� "+addr+"�Դϴ�.");
		
	}

}
