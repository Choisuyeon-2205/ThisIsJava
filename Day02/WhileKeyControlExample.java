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
				System.out.println("1.����");
				System.out.println("2.����");
				System.out.println("3.����");
				System.out.println("------------");
				System.out.print("����>>");
			
			keyCode= sc.nextInt(); //Ű������ Ű�� ����
			
			if(keyCode==1) { //1�� �о��� ���
				speed++;
			}else if(keyCode==2) {  //2�� �о��� ���
				speed--;
			}else if(keyCode==3) { //3�� �о��� ���
				run= false;
			}
			
			System.out.println("���� �ӵ�="+speed);
			
		}
		
		System.out.println("���α׷� ����");
	}

}
