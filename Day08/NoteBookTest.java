package com.kosta.day08;

public class NoteBookTest {

	public static void main(String[] args) {
		NoteBook aa= new NoteBook();
		Volume bb= new NoteBook();
		
		method1(aa);
		method1(bb);
		

	}

	private static void method1(Volume vv) {
		vv.volumeUp(100);
		vv.volumeDown(20);
		((NoteBook)vv).test();
		System.out.println(Volume.TITLE);
		vv.close();
		Volume.volumeInfo();
	}

}
