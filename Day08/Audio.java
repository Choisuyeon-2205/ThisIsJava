package com.kosta.day08;

public class Audio implements RemoteControl {

	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("Audio 전원을 켠다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio전원을 끈다.");

	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Audio [volume=").append(volume).append("]");
		return builder.toString();
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VAULE)
			this.volume= RemoteControl.MAX_VAULE;
		else if(volume<RemoteControl.MIN_VAULE)
			this.volume= RemoteControl.MIN_VAULE;
		else
			this.volume= volume;
		System.out.println("현재 볼륨은 "+this.volume);

	}

}
