package com.kosta.day03;
import java.util.*;

public class Prob1 {

	public static void main(String[] args) {
		int count= 0;
		double sum= 0;
		
		System.out.print("[��  �Է��� ������ ������ -1�� �Է�] ������ �Է��Ͻʽÿ� :");
		
		for(;;) {
		Scanner sc= new Scanner(System.in);
		double num= sc.nextDouble();
		
		if(num==-1)
			break;
		
		count++;
		sum+=num;
		System.out.print("������ �Է��Ͻʽÿ� :");
		}
		
		double avg= sum/count;

		System.out.println("�Էµ� �������� ��: "+count);
		System.out.println("�������� ���(double value): "+avg);
		System.out.println("�������� ���(int value): "+(int)avg);
	}

}
