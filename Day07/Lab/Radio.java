package com.kosta.day07.lab;

public class Radio implements Volume{
	int VolLevel;
	
	public void Radio() {
		
	}

	@Override
	public void volumeUp(int level) {
		this.VolLevel+= level;
		System.out.println(getClass().getSimpleName()+" 볼륨이 "+level+"만큼 증가하여, "+this.VolLevel+"입니다.");
	}

	@Override
	public void volumeDown(int level) {
			this.VolLevel-= level;
			System.out.println(getClass().getSimpleName()+" 볼륨이 "+level+"만큼 증가하여, "+this.VolLevel+"입니다.");
	}

}
