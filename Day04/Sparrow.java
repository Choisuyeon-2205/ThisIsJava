package com.kosta.day04;

public class Sparrow {
	String name;
	int legs;
	double length;
	
	void fly(){
		System.out.println("����(±±)�� ����ٴմϴ�.");
	}
	
	void sing(){
		System.out.println("����(±±)�� �Ҹ����� ��ϴ�.");
	}
	
	void setName(String name){
		this.name=name;
	}

	@Override
	public String toString() {
		return "Sparrow [name=" + name + ", legs=" + legs + ", length=" + length + "]";
	}
}
