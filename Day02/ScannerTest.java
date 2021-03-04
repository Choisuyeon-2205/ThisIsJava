package com.kosta.day02;
import java.util.*;

public class ScannerTest {

	public static void main(String[] args) {
		method1();

	}

	private static void method1() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("이름>>");
		String name= sc.next();
		
		System.out.print("나이>>");
		int age= sc.nextInt();
		
		sc.nextLine();  //한줄을 버려줘야됌
		
		System.out.print("주소>>");
		String addr= sc.nextLine();
		
		System.out.println("이름은 "+name+", 나이는 "+ age+"입니다.");
		System.out.println("주소는 "+addr+"입니다.");
		
	}

}
