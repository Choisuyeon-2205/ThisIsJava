package com.kosta.day06;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService service1= ShopService.getInstance();
		ShopService service2= ShopService.getInstance();
		
		if(service1==service2)
			System.out.println("���� ��ü�̴�.");
		else
			System.out.println("�ٸ� ��ü�̴�.");

	}

}
