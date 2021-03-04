package com.kosta.day02;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		int num;
		int result;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���. :");
		num= sc.nextInt();
		sc.close();
		
		if(num<2||num>9) {
			System.out.println("�߸��� �����Դϴ�. 10���� ���� ���� �Է��ϼ���.");
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