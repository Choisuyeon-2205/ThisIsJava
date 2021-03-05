package com.kosta.day07.lab;

public class TV implements Volume{
	int VolLevel;
	
	public void TV() {

	}

	@Override
	public void volumeUp(int level) {
		this.VolLevel+= level;
		System.out.println("TV 볼륨이 "+level+"만큼 증가하여, "+this.VolLevel+"입니다.");
		
	}

	@Override
	public void volumeDown(int level) {
		if(this.VolLevel-level<0) {
			this.VolLevel=0;
			System.out.println("TV 볼륨이 0으로 설정되었습니다.");
		}else {
			this.VolLevel-= level;
			System.out.println("TV 볼륨이 "+level+"만큼 감소하여, "+this.VolLevel+"입니다.");
		}
		
	}

}
