package com.kosta.day07;

//Shape은 추상 class
//Circle은 추상 class를 상속받았으므로 반드시 추상메소드를 구현할 의무가 있다.
public class Circle extends Shape{
	int radius;
	double circumference;
	
	public Circle(String color, int radius){
		super(color,"Circle");
		this.radius= radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}

	@Override
	public double getPerimeter() {
		circumference= 2*radius*Math.PI;
		return circumference;
	}

	public int getRadius() {
		return radius;
	}
	
	
}
