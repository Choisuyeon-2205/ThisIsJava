package com.kosta.day04;

public class Duck {
	String name;
	int legs;
	double length;
	
	void fly(){
		System.out.println("����(�в���)�� ���� �ʽ��ϴ�.");
	}
	
	void sing(){
		System.out.println("����(�в���)�� �Ҹ����� ��ϴ�.");
	}
	
	void setName(String name){
		this.name=name;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", legs=" + legs + ", length=" + length + "]";
	}
	
	

}
