package com.kosta.day07;

//Shape�� �߻� class
//Circle�� �߻� class�� ��ӹ޾����Ƿ� �ݵ�� �߻�޼ҵ带 ������ �ǹ��� �ִ�.
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
