package com.kosta.day06;

//class: object�� ����� Ʋ�̴�. template, �����
/*
 object: class�� �̿��ؼ� ���� ������ ��ü�̴�.
 */
public class Car {
	//1. �������(field): non-static(instance ����), static(class ����)
	private int speed; //private: ��������, �ܺ� ���� �Ұ�
	private boolean stop;
	private static int count;  //object ���� ����
	private final int year; //instance ����, final=> �ѹ��� setting ����, ���� �Ұ�, (���� ��, ���� ��)
	private static final String COMPANY="�����ڵ���"; //���
	
	//2.������... new�ÿ� �ڵ�ȣ��Ǵ� �޼���
	public Car() {
		//year= 2021; //instance ����=> �ڵ� �ʱ�ȭ: speed=0, stop=false; 
		//�������� overloading ��� �� �ϳ��� �����ڰ� �ٸ� �����ڸ� ȣ���� �� ���
		this(0,false,2021);
	}

	public Car(int speed, boolean stop, int year) {
		super();
		//�Ű������� ��������� �̸� �浹 �� �����ϱ� ���� ���
		this.speed = speed;
		this.stop = stop;
		this.year = year;
		count++;
		
		System.out.println(this.getClass().getSimpleName()+"����");
	}
	
	//3. �Ϲ� �޼���
	//getter, setter
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public static int getCount() {
		return count;
	}

	/*private static void setCount(int count) {
		Car.count = count;
	}*/

	public int getYear() {
		return year;
	}

	//static method: ��ü �������� ȣ�� ����
	public static String getCompany() {
		return COMPANY;
	}
	
	public void print() {
		System.out.println("------Car����------");
		System.out.println("speed: "+this.speed);
		System.out.println("stop: "+stop);
		System.out.println("year: "+year);
		System.out.println("count: "+count);
		System.out.println("company: "+COMPANY);
	}

	
	//4.instance block, static block;
	{
		System.out.println("instance ������ ���� ����ȴ�.");
		System.out.println("***********************");
	}
	
	static {
		System.out.println("class�� load�ÿ� ����ȴ�.");
		System.out.println("######################");
	}
	//5.
	
}
