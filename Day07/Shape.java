package com.kosta.day07;

// abstract class(추상 클래스): abstract method가 하나 이상 존재한다.
// abstract method(추상 메소드): 함수의 정의는 있으나 구현은 없다.
// 이 class를 상속받은 자식이 반드시 구현한다.

public abstract class Shape {
	private String color;
	private String type;
	
//	public Shape() {
//		
//	}
	
	public Shape(String color, String type) {
		this.color = color;
		this.type = type;
	}
	
	//-----------------규격-------------------
	//면적을 구하다
	public abstract double getArea(); //정의는 있고 구현은 없다. (추상메소드)
	//어떤 도형인지 결정되지 않아서 면적 구하기가 불가능하다.
	
	//둘레를 구하다
	public abstract double getPerimeter();
		//어떤 도형인지 결정되지 않아서 둘레 구하기가 불가능하다.
	
	//--------------------------------------
		
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return color+" "+type;
	}
	
	
	
}
