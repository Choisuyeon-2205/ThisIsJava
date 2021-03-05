package com.kosta.day07;

public class 다형성연습2 {

	public static void main(String[] args){
		//기본형의 자동 형 변환: 큰방 = 작은값
		long lo;
		int i= 100;
		lo= i;
		
		//객체의 자동형변환: 부모 = 자식
		Tire h= new HankookTire();
		Tire k= new KumhoTire();
		use(h);
		use(k);
		use(new HankookTire());
		use(new KumhoTire());

	}
	
	public static void use(Tire tire) {
		System.out.println(tire);
		System.out.println("==============");
	}

}
