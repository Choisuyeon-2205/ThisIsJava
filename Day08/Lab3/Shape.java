package com.kosta.day08.lab3;

public abstract class Shape {
	private int numSides;
	
	public Shape(int numSides){
		this.numSides= numSides;
	}

	public int getNumSides() {
		return numSides;
	}
	
	//getter는 return값이 있다.
	//abstract는 정의가 있고 구현은 없다.
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
