package com.kosta.day09.lab2;

class CellPhone{
	private String model;
	private double battery;
	
	public CellPhone(String model) {
		this.model = model;
	}
	
	void call(int time) {
		System.out.println("��ȭ �ð�: "+ time);
		if(time<0) throw new IllegalArgumentException("��ȭ�ð� �Է¿���");
		
		if((this.battery-time*0.5)>=0)
			this.battery-=time*0.5;
		else
			this.battery=0;
		
	}
	
	void charge(int time) {
		System.out.println("���� �ð�: "+ time);
		if(time<0) throw new IllegalArgumentException("�����ð� �Է¿���");
		
		if((this.battery+time*3)<=100)
			this.battery+=time*3;
		else
			this.battery=100;
	}

	public void printBattery() {
		System.out.println("���� ���͸� ��: "+battery);
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
		
		myPhone.charge( 20 );  //20�а� ������ �Ѵ�.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50�а� ������ �Ѵ�.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
		try {
			myPhone.call( -20 );  //��ȭ�ð��� �߸� �ԷµǾ���.
		} catch(IllegalArgumentException e) {
			System.out.println( e.getMessage() ); 
		} 
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		if( myPhone.equals(yourPhone) ) {
			System.out.println("���� ���Դϴ�.");
		} else {
			System.out.println("�ٸ� ���Դϴ�.");
		} 
	} 
}
