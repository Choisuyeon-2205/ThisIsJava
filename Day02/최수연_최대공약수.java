package com.kosta.day02;
import java.util.*;

//�ִ� ������� �� ���ڸ� ����� ���ڷ� ����� ��������  0�� �Ǵ� ���� ū �����ǹ��մϴ�. 
//���� ��� 2�� 5�� �ִ� ������� 1�Դϴ�. �ֳ��ϸ�, 1���� 2������ �����߰������� ���� �� �ִ� ���ڴ� 1 ���̱� �����Դϴ�. 
//�ٸ� ����, 5�� 15�� �ִ� �������5�� �˴ϴ�. �޼ҵ��� �̸��� gcd�� �ϸ�, �Ű������� �ΰ��� ������ ������, ���� �ϴ�Ÿ�� ���� �����Դϴ�.
//[�Է°�]2, 55,15250,30
//[������]1510

public class �ּ���_�ִ����� {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("�� ���� �Է��ϼ��� :");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		System.out.println(gcd(num1,num2));
		sc.close();

	}

	private static int gcd(int num1, int num2) {
		// �ִ����� ���ϱ�
		int small, big, gcd = 0;
		
		if(num1==num2) {
			return num1;
		}else if(num1>num2) {
			big=num1;
			small=num2;
		}else {
			big=num2;
			small=num1;
		}
		
		for(int i=small; i>0; i--) {
			if(big%i==0 && small%i==0) {
				gcd=i;
				break;
			}
		}
		
		return gcd;
	}

}
