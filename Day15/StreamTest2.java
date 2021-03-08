package com.kosta.day15;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {
	static Student[] arr= { 
			new Student("È«±æµ¿",100),
			new Student("½Å¿ë±Ç",80),
			new Student("±èÀÚ¹Ù",90),
	};
	static List<Student> alist= Arrays.asList(arr);
	

	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		Stream<Student> stream= alist.stream();
		//Function<Student, Integer> f1 = aa-> aa.getScore();
		ToIntFunction<Student> f2= aa-> aa.getScore();
		
		IntStream is= stream.mapToInt(f2);
		System.out.println(is.average().getAsDouble());
		
		alist.
	}

}
