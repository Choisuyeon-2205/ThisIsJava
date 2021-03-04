package com.kosta.day01;

public class VariableTest3 {

	public static void main(String[] args) {
		byte a= 127; //1byte= 8bits사용
		System.out.println("byte: -128~127 가능: "+ a);
		short b= 32767;  //2byte= 16bits사용
		System.out.println("short: -32768~32767 가능: "+b); 
		char c= 'A';  //0~65535
		System.out.println("char: "+c); 
		int d= 2147483647; //4byte= 32bits사용
		System.out.println("int: -2147483648~2147483647 가능: "+d); 
		d ++;
		System.out.println(d);
		
		//3 -> 0011 ----> 보수 취하기 1100 +1 ==> 1더하기 1101
		//-3 -> 1101
		//0 -> 0000

	}

}
