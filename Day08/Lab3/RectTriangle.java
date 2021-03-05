package com.kosta.day08.lab3;

public class RectTriangle extends Shape{
	
	double width;
	double height;

	public RectTriangle(double w, double h) {
		super(3);
		width=w;
		height=h;
	}

	@Override
	public double getArea() {
		return (width*height)/2;
	}

	@Override
	public double getPerimeter() {
		return width+height+Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2));
	}

}
