package com.kosta.day06;

public class CarTest {

	public static void main(String[] args) {
		System.out.println(Car.getCompany());
		System.out.println(Car.getCount());
		
		Car c1= new Car();
		//instance method »£√‚
		System.out.println(c1.getSpeed());
		c1.print();
		
		Car c2= new Car(100,true,2020);
		c2.print();

	}

}
