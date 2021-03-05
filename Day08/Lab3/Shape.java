package com.kosta.day08.lab3;

public abstract class Shape {
	private int numSides;
	
	public Shape(int numSides){
		this.numSides= numSides;
	}

	public int getNumSides() {
		return numSides;
	}
	
	//getter�� return���� �ִ�.
	//abstract�� ���ǰ� �ְ� ������ ����.
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
