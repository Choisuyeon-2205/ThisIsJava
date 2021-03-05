package com.kosta.day07;

// abstract class(�߻� Ŭ����): abstract method�� �ϳ� �̻� �����Ѵ�.
// abstract method(�߻� �޼ҵ�): �Լ��� ���Ǵ� ������ ������ ����.
// �� class�� ��ӹ��� �ڽ��� �ݵ�� �����Ѵ�.

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
	
	//-----------------�԰�-------------------
	//������ ���ϴ�
	public abstract double getArea(); //���Ǵ� �ְ� ������ ����. (�߻�޼ҵ�)
	//� �������� �������� �ʾƼ� ���� ���ϱⰡ �Ұ����ϴ�.
	
	//�ѷ��� ���ϴ�
	public abstract double getPerimeter();
		//� �������� �������� �ʾƼ� �ѷ� ���ϱⰡ �Ұ����ϴ�.
	
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
