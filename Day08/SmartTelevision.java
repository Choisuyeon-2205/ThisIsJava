package com.kosta.day08;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void turnOn() {
		System.out.println("SmartTelevision class의 turnOn 메소드");

	}

	@Override
	public void turnOff() {
		System.out.println("SmartTelevision class의 turnOff 메소드");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("SmartTelevision class의 setVolume 메소드");

	}

	@Override
	public void search(String url) {
		System.out.println(url+" 을 검색합니다.");
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SmartTelevision [toString()=").append(super.toString()).append("]");
		return builder.toString();
	}
	
	

}
