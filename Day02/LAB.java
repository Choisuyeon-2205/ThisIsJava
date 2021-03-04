package com.kosta.day02;

import java.util.Scanner;

public class LAB {

	public static void main(String[] args) {
		//test1();
		//hokeyGraphics('*',3,true);
		//invert_triangle();
		primePrint();
	}

	private static void primePrint() {
		System.out.print(2+"\t");
		AA: for(int i=3;i<50;i++) {
			for(int na=2;na<i;na++) {
				if(i%na==0) continue AA;
			}
			System.out.print(i+"\t");
		}
		
	}

	private static void invert_triangle() {
		Scanner sc= new Scanner(System.in);
		System.out.println("직각 역삼각형을 출력할 줄 수: ");
		int size= sc.nextInt();
		sc.close();
		
		for(int i=1;i<=size;i++) {
			for(int j=size-i+1;j>=1;j--) {
				System.out.print("*");
				}
		System.out.println();
		}
	}

	private static void hokeyGraphics(char cell, int size, boolean isRect) {
		
		if(isRect) {
			for(int i=1;i<=size;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(cell);
					}
			System.out.println();
			}
		}else {
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					System.out.print(cell);
					}
			System.out.println();
			}
		}
		
	}

	private static void test1() {
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int su= sc.nextInt();
		sc.close();
		
		int start=1;
		
		if(su%2==0) {
			start=0;
		}
		
		int total=0;
		
		for(int i=start;i<=su;i+=2) {
			total+=i;
			System.out.print(i);
			System.out.print(i==su?"= ":"+");
		}
		
		System.out.println(total);
		
	}

}
