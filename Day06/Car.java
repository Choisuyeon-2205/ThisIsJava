package com.kosta.day06;

//class: object를 만드는 틀이다. template, 설계또
/*
 object: class를 이용해서 만든 독립된 개체이다.
 */
public class Car {
	//1. 멤버변수(field): non-static(instance 변수), static(class 변수)
	private int speed; //private: 정보은닉, 외부 접근 불가
	private boolean stop;
	private static int count;  //object 공유 변수
	private final int year; //instance 변수, final=> 한번만 setting 가능, 변경 불가, (생성 시, 선언 시)
	private static final String COMPANY="현대자동차"; //상수
	
	//2.생성자... new시에 자동호출되는 메서드
	public Car() {
		//year= 2021; //instance 변수=> 자동 초기화: speed=0, stop=false; 
		//생성자의 overloading 사용 시 하나의 생성자가 다른 생성자를 호출할 때 사용
		this(0,false,2021);
	}

	public Car(int speed, boolean stop, int year) {
		super();
		//매개변수와 멤버변수가 이름 충돌 시 구별하기 위해 사용
		this.speed = speed;
		this.stop = stop;
		this.year = year;
		count++;
		
		System.out.println(this.getClass().getSimpleName()+"생성");
	}
	
	//3. 일반 메서드
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

	//static method: 객체 생성없이 호출 가능
	public static String getCompany() {
		return COMPANY;
	}
	
	public void print() {
		System.out.println("------Car정보------");
		System.out.println("speed: "+this.speed);
		System.out.println("stop: "+stop);
		System.out.println("year: "+year);
		System.out.println("count: "+count);
		System.out.println("company: "+COMPANY);
	}

	
	//4.instance block, static block;
	{
		System.out.println("instance 생성시 마다 수행된다.");
		System.out.println("***********************");
	}
	
	static {
		System.out.println("class가 load시에 수행된다.");
		System.out.println("######################");
	}
	//5.
	
}
