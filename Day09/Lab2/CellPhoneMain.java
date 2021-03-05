package com.kosta.day09.lab2;

class CellPhone{
	private String model;
	private double battery;
	
	public CellPhone(String model) {
		this.model = model;
	}
	
	void call(int time) {
		System.out.println("통화 시간: "+ time);
		if(time<0) throw new IllegalArgumentException("통화시간 입력오류");
		
		if((this.battery-time*0.5)>=0)
			this.battery-=time*0.5;
		else
			this.battery=0;
		
	}
	
	void charge(int time) {
		System.out.println("충전 시간: "+ time);
		if(time<0) throw new IllegalArgumentException("충전시간 입력오류");
		
		if((this.battery+time*3)<=100)
			this.battery+=time*3;
		else
			this.battery=100;
	}

	public void printBattery() {
		System.out.println("남은 배터리 양: "+battery);
	}

	@Override
	public boolean equals(Object otherObject) {
		if(otherObject==null) return false;
			
		return otherObject instanceof CellPhone && ((CellPhone) otherObject).model==model;
	}
	
}

public class CellPhoneMain {
	 
	public static void main(String[] args) { 
		CellPhone myPhone = new CellPhone("SCH-600");
		
		myPhone.charge( 20 );  //20분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300분간 통화를 한다.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40분간 통화를 한다.
		myPhone.printBattery();
		
		try {
			myPhone.call( -20 );  //통화시간이 잘못 입력되었다.
		} catch(IllegalArgumentException e) {
			System.out.println( e.getMessage() ); 
		} 
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		if( myPhone.equals(yourPhone) ) {
			System.out.println("동일 모델입니다.");
		} else {
			System.out.println("다른 모델입니다.");
		} 
	} 
}
