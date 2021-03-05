package com.kosta.day08;

public class Television implements RemoteControl {

	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("TV Àü¿øÀ» ÄÒ´Ù.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV Àü¿øÀ» ²ö´Ù.");

	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Television [volume=").append(volume).append("]");
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
		System.out.println("ÇöÀç º¼·ýÀº "+this.volume);

	}

}
