package com.kosta.day02;

import java.util.Scanner;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run= true;
		int speed= 0;
		int keyCode= 0;
		Scanner sc= new Scanner(System.in);
		
		while(run) {
		
				System.out.println("------------");
				System.out.println("1.증속");
				System.out.println("2.감속");
				System.out.println("3.중지");
				System.out.println("------------");
				System.out.print("선택>>");
			
			keyCode= sc.nextInt(); //키보드의 키를 읽음
			
			if(keyCode==1) { //1을 읽었을 경우
				speed++;
			}else if(keyCode==2) {  //2를 읽었을 경우
				speed--;
			}else if(keyCode==3) { //3을 읽었을 경우
				run= false;
			}
			
			System.out.println("현재 속도="+speed);
			
		}
		
		System.out.println("프로그램 종료");
	}

}
