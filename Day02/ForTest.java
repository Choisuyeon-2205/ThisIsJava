package com.kosta.day02;

public class ForTest {

	public static void main(String[] args) {
	
		//test1();
		test2();
		//test3();

	}

	private static void test3() {
		//4단일때 중단
		
		outerFor:for(int dan=2;dan<=9;dan++) {
			for(int gop=2;gop<=9;gop++) {
				if(dan==4)
					break outerFor;
				System.out.println(dan+"*"+gop+"="+dan*gop+"\t");
			}
		}
		
		
	}

	private static void test2() {
		for(int dan=2;dan<=9;dan++) {
			for(int gop=2;gop<=9;gop++) {
				if(dan==4)
					break;
				System.out.println(dan+"*"+gop+"="+dan*gop+"\t");
			}
		}
		
	}

	private static void test1() {
		for(int gop=1;gop<=9;gop++) {
			for(int dan=2;dan<=9;dan++) {
				if(dan==4)
					continue;
				System.out.print(dan+"*"+gop+"="+dan*gop+"\t");
			}
			System.out.println();
		}

		
	}
}
