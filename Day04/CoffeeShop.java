package com.kosta.day04;

public class CoffeeShop {

	public static void main(String[] args) {
		
		System.out.println(Coffee.count+"�� �ֹ���");
		
		Coffee order1= new Coffee("�Ƹ޸�ī��",2000);
		Coffee order2= new Coffee("ī���",3000);
		Coffee order3= new Coffee("������Ŀ��");
		
		order1.print();
		order2.print();
		order3.print();
		
		System.out.println(Coffee.count+"�� �ֹ���");
		
		System.out.println(order1.getCount());
		System.out.println(Coffee.getCount2());
		

	}

}
