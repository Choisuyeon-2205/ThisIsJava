package com.kosta.day03;

import java.util.Arrays;

//�迭

public class �迭���� {

	//����� �Ű�����
	//>java �迭���� 100 200
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		System.out.println(args.length+"�� parameter�� ����");
		System.out.println(args[0]);
		System.out.println(args[1]);
		//���ڿ�-> ���ڷ� ����
		//String class= ���(�޼���)+�Ӽ�(����)
		//Integer class= ���(�޼���)+�Ӽ�(����)
		int su1= Integer.parseInt(args[0]);
		int su2= Integer.parseInt(args[1]);
		
		System.out.println(su1+su2);
		System.out.println(su1-su2);
		System.out.println(su1*su2);
		System.out.println(su1/su2);
		System.out.println(su1%su2);

	}

	private static void method3() {
		//�迭 ������ ���� ������ �ʼ��̴�.
		//�ڵ��ʱ�ȭ, null
		String[] arr= new String[5];
		String[] arr2= {"java","sql","html5","css3","javascript"};
		String[] arr3= new String[]
				{"java","sql","html5","css3","javascript"};
		String[] arr4;
		arr4= new String[]{"java","sql","html5","css3","javascript"};
		String[] arr5;
		//�Ұ� arr5={"java","sql","html5","css3","javascript"};
		
		for(int i=0; i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		
		//Ȯ��FOR, ���� for
		for(String s:arr4) {
			System.out.println(s);
			
		}
	}

	private static void method2() {
		int[] arr;
		arr= new int[10];
		
		for(int i=0;i<arr.length;i++)
			System.out.print(i+"��°:"+arr[i]+"\t");
		
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		//�⺻���� �ƴѰ��� null�� �ʱ�ȭ
		String[] arr2= new String[5];
		System.out.println(Arrays.toString(arr2));
		
		//����+����+�ʱ�ȭ
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
		//1.�迭��������
		int[] score1;
		double score2[];
		boolean[] pass;
		
		//2.�迭����...�ڵ� �ʱ�ȭ �ȴ�.
		score1= new int[30];
		score2= new double[5];
		pass= new boolean[30];
		
		//3.�迭���
		//index(÷��)�� 0���� ����, 30��
		System.out.println(score1.length);
		System.out.println(score2.length);
		System.out.println("*"+score1[0]+"*");
		
	}

}
