package com.kosta.day03;

public class EnumTest2 {

	public static void main(String[] args) {
		Week w;
		w= Week.SUNDAY; //���
		System.out.println(w);
		System.out.println(w== Week.SUNDAY); //���
		System.out.println(w.ordinal()); 
		System.out.println(w.name());
		System.out.println(w.name()=="SUNDAY"); //���ڿ� �� (�ּҰ� ���ƾ���)
		System.out.println(w.name().equals("SUNDAY")); 
		String s= w.name();
		Week ww=Week.valueOf("SUNDAY");
		Week ww2=Week.valueOf("MONDAY");
		
		System.out.println("����:"+ww.compareTo(ww2));
		
		System.out.println(Week.valueOf("SUNDAY")); 
		
		
		Week[] arr= Week.values();
		for(Week aa:arr) {
			System.out.println(aa);
			System.out.println(aa.ordinal());
			System.out.println(aa.name());
			System.out.println("-------------");
		}

	}

}
