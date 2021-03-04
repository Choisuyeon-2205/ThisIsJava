package com.kosta.day03;

import java.util.Arrays;

//배열

public class 배열연습 {

	//명령행 매개변수
	//>java 배열연습 100 200
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		System.out.println(args.length+"개 parameter가 들어옴");
		System.out.println(args[0]);
		System.out.println(args[1]);
		//문자열-> 숫자로 변경
		//String class= 기능(메서드)+속성(변수)
		//Integer class= 기능(메서드)+속성(변수)
		int su1= Integer.parseInt(args[0]);
		int su2= Integer.parseInt(args[1]);
		
		System.out.println(su1+su2);
		System.out.println(su1-su2);
		System.out.println(su1*su2);
		System.out.println(su1/su2);
		System.out.println(su1%su2);

	}

	private static void method3() {
		//배열 생성시 개수 지정은 필수이다.
		//자동초기화, null
		String[] arr= new String[5];
		String[] arr2= {"java","sql","html5","css3","javascript"};
		String[] arr3= new String[]
				{"java","sql","html5","css3","javascript"};
		String[] arr4;
		arr4= new String[]{"java","sql","html5","css3","javascript"};
		String[] arr5;
		//불가 arr5={"java","sql","html5","css3","javascript"};
		
		for(int i=0; i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		
		//확장FOR, 향상된 for
		for(String s:arr4) {
			System.out.println(s);
			
		}
	}

	private static void method2() {
		int[] arr;
		arr= new int[10];
		
		for(int i=0;i<arr.length;i++)
			System.out.print(i+"번째:"+arr[i]+"\t");
		
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		//기본형이 아닌경우는 null로 초기화
		String[] arr2= new String[5];
		System.out.println(Arrays.toString(arr2));
		
		//선언+생성+초기화
		int[] arr3= new int[] {100,99,88,50,10};
		int[] arr4= {100,99,88,50,10};
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		int total=0;
		for(int i=0;i<arr3.length;i++) {
			total+=arr3[i];
		}
		System.out.println(total);
		
	}

	private static void method1() {
		//1.배열변수선언
		int[] score1;
		double score2[];
		boolean[] pass;
		
		//2.배열생성...자동 초기화 된다.
		score1= new int[30];
		score2= new double[5];
		pass= new boolean[30];
		
		//3.배열사용
		//index(첨자)는 0부터 시작, 30개
		System.out.println(score1.length);
		System.out.println(score2.length);
		System.out.println("*"+score1[0]+"*");
		
	}

}
