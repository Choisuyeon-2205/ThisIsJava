package com.kosta.day07.lab;

public class Radio implements Volume{
	int VolLevel;
	
	public void Radio() {
		
	}

	@Override
	public void volumeUp(int level) {
		this.VolLevel+= level;
		System.out.println(getClass().getSimpleName()+" ������ "+level+"��ŭ �����Ͽ�, "+this.VolLevel+"�Դϴ�.");
	}

	@Override
	public void volumeDown(int level) {
			this.VolLevel-= level;
			System.out.println(getClass().getSimpleName()+" ������ "+level+"��ŭ �����Ͽ�, "+this.VolLevel+"�Դϴ�.");
	}

}
