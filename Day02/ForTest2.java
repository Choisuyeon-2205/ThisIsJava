package com.kosta.day02;

public class ForTest2 {
	//break: �ߴ�, switch, for, while, do while
	//���� ����� �ݺ��� ������
	//��ø �ݺ����� �������� label(�̸�)�� �ش�.
	
	public static void test2() {
		//continue ���� ����
		for(int i=1; i<=10; i++) {
			if(i==3) {
				continue; //�Ʒ� ������� �����ض�
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		test2();
		System.out.println("------------------");
		
//		AA:for(int dan=2;dan<=9;dan++) {
//			System.out.println(dan+ "----------");
//			
//			for(int gop=1;gop<=9;gop++) {
//				//if(dan==4) break;
//				if(dan==4) break AA;
//				System.out.println(dan+"*"+gop+"="+dan*gop);
//			}
//		}

	}

}
