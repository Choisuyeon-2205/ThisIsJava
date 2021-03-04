package com.kosta.day02;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		int num;
		int result;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. :");
		num= sc.nextInt();
		sc.close();
		
		if(num<2||num>9) {
			System.out.println("잘못된 숫자입니다. 10보다 작은 수를 입력하세요.");
			return;
		}
		
		for(int i=1;i<=num;i++) {
			result= pactorial(i);
			System.out.println(i+"!= "+result);
		}

	}

	private static int pactorial(int n) {
		if(n<=1)
			return 1;
		else
			return n* pactorial(n-1);
	}

}