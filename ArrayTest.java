package com.kosta.day03;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] arr1= {{30,30,30,30},{40,40,40,40},{50,50,50,50}};
		int[][] arr2= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] arr3= new int[3][4];
		
		sub(arr1,arr2,arr3);
		prn(arr3);		
	
	}
	
	public static void sub(int[][] a, int[][] b, int[][] c){
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				c[i][j]=a[i][j]-b[i][j];
			}
		}
	}
	
	public static void prn(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	
	}

}
