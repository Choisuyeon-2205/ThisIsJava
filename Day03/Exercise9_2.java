package com.kosta.day03;

import java.util.Scanner;

public class Exercise9_2 {

	public static void main(String[] args) {
		boolean run= true;
		int studentNum=0;
		int[] scores=null;
		Scanner scanner= new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.�л���| 2.�����Է�| 3.��������Ʈ| 4.�м�| 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����> ");
			
			int selectNo= scanner.nextInt();
			
			if(selectNo==1) {
				System.out.print("�л���> ");
				studentNum= scanner.nextInt();
				
			}else if(selectNo==2) {
				scores= new int[studentNum];
				for(int i=0; i<studentNum; i++) {
					System.out.print("score["+i+"]> ");
					scores[i]= scanner.nextInt();
				}
			}else if(selectNo==3) {
				for(int i=0; i<studentNum; i++) {
					System.out.println("score["+i+"]: "+scores[i]);
				}
			}else if(selectNo==4) {
				
				int sum=0;
				int max=0;
				double avg=0;
				int count=0;
				
				for(int i=0; i<studentNum; i++) {
					if(max<scores[i]) {
						max=scores[i];
					}
					sum+=scores[i];
					count++;
				}
				avg= sum/(double)count;
				System.out.println("�ְ� ����: "+max);
				System.out.println("��� ����: "+avg);
				
			}else if(selectNo==5) {
				run= false;
			}
		}

		System.out.println("���α׷� ����");

	}

}
