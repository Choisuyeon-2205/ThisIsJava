package com.kosta.day04;

public class Coffee {
	//field: instance����-object���� ����,
	//       class����-class���� ����, static�����!!!!
	String menu_name;
	int price;
	static int count; //instance���� �����ϴ� �����̴�.
	
	Coffee(String menu){
		this(menu,1000);
	}
	
	Coffee(String menu_name, int price){
		System.out.println("�����մϴ�.");
		this.menu_name= menu_name;
		this.price= price;
		count++;
	}
	
	
	
	void print() {
		System.out.println("-------�ֹ���------");
		System.out.println("�޴�: "+menu_name);
		System.out.println("����: "+price);
		System.out.println("-----------------");
	}
	
	//instance �޼ҵ�
	int getCount() {
		System.out.println(menu_name);
		return count;
	}
	
	//class �޼ҵ�
	static int getCount2() {
		//��� �Ұ� System.out.println(menu_name); static ������ ���ٰ���@@
		return count;
	}
	

}
