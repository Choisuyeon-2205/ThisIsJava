package com.kosta.day04;

public class NoteBookTest {

	public static void main(String[] args) {
		
		String s= new String("�ڹ�");
		System.out.println(s);
		
		System.out.println(NoteBook.getCount()+"�� ����..�޼�������");
		//private�� �ܺ� ���� �Ұ�
		//System.out.println(NoteBook.count+"�� ����..field����");
		
		NoteBook n1= new NoteBook("abc12345","�׷�123",150);
		NoteBook n2= new NoteBook("ggg12345","�Ｚ456",250);
		NoteBook n3= new NoteBook("hhh12345","LG123",100);
		
		System.out.println(NoteBook.getCount()+"�� ����... �޼�������");
		
		System.out.println(n1.getMacAddress());
		n1.setMacAddress("ABCD12345");
		System.out.println(n1.getMacAddress());
		
		System.out.println(n1.toString());

	}

}
