package com.kosta.day13.Ex;

import java.util.function.*;

public class LambdaExamplePrac {
	private static int[] scores= {10,50,3};
	
	public static int maxOrMin(int[] scores, IntBinaryOperator operator) {
		int result= scores[0];
		for(int score: scores) {
			result= operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		int max= maxOrMin(scores,(a, b) ->{
					if(a>b) return a;
					return b;
				});
		System.out.println("최대값: "+max);
		
		int min= maxOrMin(scores,(a, b) ->{
			if(a>b) return b;
			return a;
		});
		System.out.println("최소값: "+min);
	}

}
