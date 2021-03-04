package com.kosta.day04;

public class NoteBookTest {

	public static void main(String[] args) {
		
		String s= new String("자바");
		System.out.println(s);
		
		System.out.println(NoteBook.getCount()+"대 있음..메서드접근");
		//private는 외부 접근 불가
		//System.out.println(NoteBook.count+"대 있음..field접근");
		
		NoteBook n1= new NoteBook("abc12345","그램123",150);
		NoteBook n2= new NoteBook("ggg12345","삼성456",250);
		NoteBook n3= new NoteBook("hhh12345","LG123",100);
		
		System.out.println(NoteBook.getCount()+"대 있음... 메서드접근");
		
		System.out.println(n1.getMacAddress());
		n1.setMacAddress("ABCD12345");
		System.out.println(n1.getMacAddress());
		
		System.out.println(n1.toString());

	}

}
