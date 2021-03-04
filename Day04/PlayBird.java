package com.kosta.day04;

public class PlayBird {

	public static void main(String[] args) {
		Duck duck= new Duck();
		Sparrow sparrow= new Sparrow();
		
		duck.setName("꽥꽥이");
		sparrow.setName("짹쨱");
		
		duck.fly();
		duck.sing();
		System.out.println("오리의 이름은 "+duck.name+" 입니다.");
		sparrow.fly();
		sparrow.sing();
		System.out.println("참새의 이름은 "+sparrow.name+" 입니다.");
	

	}

}
