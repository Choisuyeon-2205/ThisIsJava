package com.kosta.day03;

import java.util.Arrays;

//[배열의 내용]3, 24, 1, 55, 17, 43, 5
//[클래스 실행결과]1, 3, 5, 17, 24, 43, 55

public class LAB3 {

	public static void main(String[] args) {
		int temp=0;
		int[] num= {3,24,1,55,17,43,5};
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				
				}
			}
		}
		
		System.out.println(Arrays.toString(num));
		
		
		

	}

}
