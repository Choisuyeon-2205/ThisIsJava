package com.kosta.day07.lab;

public class TV implements Volume{
	int VolLevel;
	
	public void TV() {

	}

	@Override
	public void volumeUp(int level) {
		this.VolLevel+= level;
		System.out.println("TV ������ "+level+"��ŭ �����Ͽ�, "+this.VolLevel+"�Դϴ�.");
		
	}

	@Override
	public void volumeDown(int level) {
		if(this.VolLevel-level<0) {
			this.VolLevel=0;
			System.out.println("TV ������ 0���� �����Ǿ����ϴ�.");
		}else {
			this.VolLevel-= level;
			System.out.println("TV ������ "+level+"��ŭ �����Ͽ�, "+this.VolLevel+"�Դϴ�.");
		}
		
	}

}
