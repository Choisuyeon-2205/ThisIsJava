package com.kosta.day08;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void turnOn() {
		System.out.println("SmartTelevision class�� turnOn �޼ҵ�");

	}

	@Override
	public void turnOff() {
		System.out.println("SmartTelevision class�� turnOff �޼ҵ�");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("SmartTelevision class�� setVolume �޼ҵ�");

	}

	@Override
	public void search(String url) {
		System.out.println(url+" �� �˻��մϴ�.");
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SmartTelevision [toString()=").append(super.toString()).append("]");
		return builder.toString();
	}
	
	

}
