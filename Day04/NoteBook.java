package com.kosta.day04;

/*
 * Modifier
 * 1)public: ��� ��Ű������ ������ �����ϴ�.
 * 2)protected
 * 3)����(default): ���� package �������� ������ �����ϴ�.
 * 4)private: ���� class �������� ������ �����ϴ�.(��������)
 */

public class NoteBook {
	//�������: instance����, class����
	private String macAddress;
	public String model;
	public int price;
	public static int count;
	
	//������ �޼���
	public NoteBook(String macAddress, String model, int price) {
		super();
		this.macAddress = macAddress;
		this.model = model;
		this.price = price;
		count++;
	}
	
	//�Ϲ� �޼���
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
