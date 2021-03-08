package com.kosta.day11;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest {

	public static void main(String[] args) {
		//method1();
		method3();

	}
	
	private static void method3() {
		Car[] arr= new Car[5];
		arr[0]= new Car("A",5000);
		arr[1]= new Car("C",3000);
		arr[2]= new Car("B",4000);
		arr[3]= new Car("E",2000);
		arr[4]= new Car("D",1000);
		
		
		print("before: ",arr);
		Arrays.sort(arr);
		print("1st after: ",arr);
		
		Arrays.sort(arr,new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				return o2.getPrice()-o1.getPrice();
			}
			
		});
		
		print("2nd after(desending sort): ",arr);
		
		int result= Arrays.binarySearch(arr, new Car("B",4000));
		System.out.println(result+"번째");
		
	}

	private static void print(String message, Car[] arr) {
		System.out.println("============="+message+"===============");
		for(Car c: arr) {
			System.out.println(c);
		}
		
	}

	private static void method2() {
		Character[] arr= {'J','A','V','A'};
		System.out.println(Arrays.binarySearch(arr, 'V')+"번째");
		System.out.println(Arrays.binarySearch(arr, 'J')+"번째");
		
	}

	private static void method1() {
		Character[] arr= {'J','A','V','A'};
		Character[] arr2= Arrays.copyOf(arr, arr.length-1);
		Character[] arr3= new Character[arr.length];
		
		System.out.println("원본(arr): "+Arrays.toString(arr));
		System.out.println("복사(arr2): "+Arrays.toString(arr2));
		
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		System.out.println("복사(arr3): "+Arrays.toString(arr3));
		
		System.out.println(Arrays.equals(arr, arr2));
		System.out.println(Arrays.equals(arr, arr3));
		
		Arrays.sort(arr);
		System.out.println("sort: "+Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println("desc sort: "+Arrays.toString(arr));
		
		Arrays.sort(arr3, new CharDescending());
		System.out.println("desc sort: "+Arrays.toString(arr));
	}

}

class CharDescending implements Comparator<Character>{
	

	@Override
	public int compare(Character o1, Character o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
}

