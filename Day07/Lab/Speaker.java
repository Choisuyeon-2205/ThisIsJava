package com.kosta.day07.lab;

//extends: class 상속받는다.
//implements: interface를 구현한다.
public class Speaker implements Volume{
	int VolLevel;
	
	public void Speaker() {

	}

	@Override
	public void volumeUp(int level) {
		if(this.VolLevel+level>100) {
			this.VolLevel=100;
			System.out.println(getClass().getSimpleName()+" 볼륨이 100으로 설정되었습니다.");
		}else {
			this.VolLevel+= level;
			System.out.println(getClass().getSimpleName()+" 볼륨이 "+level+"만큼 증가하여, "+this.VolLevel+"입니다.");
		}
	}

	@Override
	public void volumeDown(int level) {
		if(this.VolLevel-level<0) {
			this.VolLevel=0;
			System.out.println(getClass().getSimpleName()+" 볼륨이 0으로 설정되었습니다.");
		}else {
			this.VolLevel-= level;
			System.out.println(getClass().getSimpleName()+" 볼륨이 "+level+"만큼 감소하여, "+this.VolLevel+"입니다.");
		}
	}

}
