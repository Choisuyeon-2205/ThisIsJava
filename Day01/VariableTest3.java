package com.kosta.day01;

public class VariableTest3 {

	public static void main(String[] args) {
		byte a= 127; //1byte= 8bits���
		System.out.println("byte: -128~127 ����: "+ a);
		short b= 32767;  //2byte= 16bits���
		System.out.println("short: -32768~32767 ����: "+b); 
		char c= 'A';  //0~65535
		System.out.println("char: "+c); 
		int d= 2147483647; //4byte= 32bits���
		System.out.println("int: -2147483648~2147483647 ����: "+d); 
		d ++;
		System.out.println(d);
		
		//3 -> 0011 ----> ���� ���ϱ� 1100 +1 ==> 1���ϱ� 1101
		//-3 -> 1101
		//0 -> 0000

	}

}
