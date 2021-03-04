package com.kosta.day03;

import java.util.Arrays;

public class 다차원배열 {

	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		//method5();
		method7();

	}
	
	//값의 전달
	private static void method7() {
		int a=100;
		System.out.println("before: "+a);
		method8(a);
		System.out.println("After: "+a);
		
		
	}

	private static void method8(int num) {
		num= 300;
		System.out.println(num);
		
	}

	private static void method5() {
		int[] arr1= new int[] {100,99,70,88,95};
		System.out.println("arr1 before: "+Arrays.toString(arr1));
		method6(arr1);
		System.out.println("arr1 After: "+Arrays.toString(arr1));
		
	}

	private static void method6(int[] scores) {
		scores[0]= 300;
		System.out.println("scores: "+Arrays.toString(scores));
		
		
	}

	private static void method4() {
		int[] arr1= new int[] {100,99,70,88,95};
		int[] arr2= new int[arr1.length];
		int[] arr3= new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		int[] arr4= Arrays.copyOf(arr1, arr1.length);
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]= arr1[i];
		}
	
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	
		
	}

	private static void method3() {
		String[][] arr={{"자바","SQL","WEB"},{"HTML5","CSS3","JS"}};
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length;col++) {
				System.out.println(arr[row][col]+"\t");
			}
			System.out.println();
		}
		
		//주소를 넣는다. 같은 주소를 참조한다. 내용 복사 X
		String[][] arr2= arr;
		arr2[0][0]= "JAVA";
		System.out.println(arr2[0][0]);
		System.out.println(arr[0][0]);
	}

	private static void method2() {
		String[][] arr;
		arr= new String[3][]; //배열 갯수(행)은 필수다!
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]);
			arr[i]= new String[i+4];
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void method1() {
		int[][] arr;
		int arr2[][];
		int[] arr3[];
		
		arr= new int[2][3];  //행마다 열 수가 같을 때
		arr2= new int[2][];
		arr2[0]= new int[3]; //행마다 열 수가 다를 때
		arr2[1]= new int[4];
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println(); //줄바꾸기
		}
		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
		
		
	}

}
