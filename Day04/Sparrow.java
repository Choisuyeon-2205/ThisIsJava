package com.kosta.day04;

public class Sparrow {
	String name;
	int legs;
	double length;
	
	void fly(){
		System.out.println("Âü»õ(Â±Â±)°¡ ³¯¶ó´Ù´Õ´Ï´Ù.");
	}
	
	void sing(){
		System.out.println("Âü»õ(Â±Â±)°¡ ¼Ò¸®³»¾î ¿ó´Ï´Ù.");
	}
	
	void setName(String name){
		this.name=name;
	}

	@Override
	public String toString() {
		return "Sparrow [name=" + name + ", legs=" + legs + ", length=" + length + "]";
	}
}
