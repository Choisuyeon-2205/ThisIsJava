package com.kosta.day04;
/*
 * >java MethodTest
 * MethodTest�� byte code�� method������ load
 * static���� ����, �޼ҵ尡 �޸𸮿� �ö�´�.
 * static���� �޼ҵ�, ������ new �ÿ� �ö󰣴�.
 */
//�޼ҵ� overloading: �޼ҵ� �̸��� ���� �Ű����� ����� �ٸ���.

public class MethodTest {
	int gas;
	
	//1. �Ķ���� ����, return�� ����
	void sum() {
		System.out.println("1.�Ķ���� ����, return ����");
	}
	
	//2. �Ű������� �ְ�, return�� ����
	void sum(int a, int b) {
		System.out.println("2.�Ķ���� ����, return ����");
		System.out.println(a+b);
		System.out.println("----------------------------");
	}
	
	//2. �Ű������� �ְ�, return�� ����
	void sum(String a, String b) {
		System.out.println("2.�Ķ���� ����, return ����");
		System.out.println(a+b);
		System.out.println("----------------------------");
	}
	
	//3. �Ű������� �ְ�, return�� ����
		double sum(double a, double b, double c) {
			System.out.println("3. �Ű������� �ְ�, return�� ����");
			return a+b+c;
		}
		
		boolean isLeftGas(int aa) { //�Ű�����
			int bb;
			if(gas==0)
				return false;
			return true;
			
		}
	
	public static void main(String[] args) {
		
		MethodTest aa= new MethodTest();
		aa.sum();
		aa.sum(10,20);
		aa.sum("�ڹ�","���α׷���");
		double result= aa.sum(10.5,20.5,30.5);
		System.out.println("result= "+result);
		
		boolean b= aa.isLeftGas(1000);
		System.out.println(b);
		

	}

}
