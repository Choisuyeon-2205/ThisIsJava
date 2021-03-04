package com.kosta.day04;

/*
 * Modifier
 * 1)public: 모든 패키지에서 접근이 가능하다.
 * 2)protected
 * 3)생략(default): 같은 package 내에서만 접근이 가능하다.
 * 4)private: 같은 class 내에서만 접근이 가능하다.(정보은닉)
 */

public class NoteBook {
	//멤버변수: instance변수, class변수
	private String macAddress;
	public String model;
	public int price;
	public static int count;
	
	//생성자 메서드
	public NoteBook(String macAddress, String model, int price) {
		super();
		this.macAddress = macAddress;
		this.model = model;
		this.price = price;
		count++;
	}
	
	//일반 메서드
	String getMacAddress(){
		return macAddress.substring(0,3)+"*****";
	}
	
	void setMacAddress(String macAddress) {
		this.macAddress=macAddress;
	}
	
	static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "NoteBook [macAddress=" + macAddress + ", model=" + model + ", price=" + price + "]";
	}
	
	
	
	
}
