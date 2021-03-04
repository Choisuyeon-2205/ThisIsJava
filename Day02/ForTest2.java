package com.kosta.day02;

public class ForTest2 {
	//break: 중단, switch, for, while, do while
	//가장 가까운 반복문 빠지기
	//중첩 반복문을 빠지려면 label(이름)을 준다.
	
	public static void test2() {
		//continue 문장 연습
		for(int i=1; i<=10; i++) {
			if(i==3) {
				continue; //아래 문장들을 무시해라
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
