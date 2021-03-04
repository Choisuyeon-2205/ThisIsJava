package com.kosta.day03;
import java.util.*;

public class Prob1 {

	public static void main(String[] args) {
		int count= 0;
		double sum= 0;
		
		System.out.print("[더  입력할 점수가 없으면 -1을 입력] 점수를 입력하십시오 :");
		
		for(;;) {
		Scanner sc= new Scanner(System.in);
		double num= sc.nextDouble();
		
		if(num==-1)
			break;
		
		count++;
		sum+=num;
		System.out.print("점수를 입력하십시오 :");
		}
		
		double avg= sum/count;

		System.out.println("입력된 점수들의 수: "+count);
		System.out.println("점수들의 평균(double value): "+avg);
		System.out.println("점수들의 평균(int value): "+(int)avg);
	}

}
