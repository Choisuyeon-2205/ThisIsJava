package com.kosta.day13.Ex;

import java.util.function.*;

public class LambdaEx {
	private static Student[] students= {
			new Student("ȫ�浿", 90, 96),
			new Student("�ſ��", 95, 93)
	};
	
	//avg() �޼ҵ� �ۼ�
	public static double avg(ToIntFunction<Student> f) {
		int sum=0;
		
		for(Student s: students) {
			sum+= f.applyAsInt(s);
		}
		
		return (double)sum/students.length;
	}

	public static void main(String[] args) {
		double englishAvg= avg(s-> s.getEnglishScore());
		System.out.println("���� ��� ����: "+ englishAvg);
		
		double mathAvg= avg(s-> s.getMathScore());
		System.out.println("���� ��� ����: "+ mathAvg);
		

	}
	
	public static class Student{
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}
		
		
		
		
	}
}
