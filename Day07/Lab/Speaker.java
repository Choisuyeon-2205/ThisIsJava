package com.kosta.day07.lab;

//extends: class ��ӹ޴´�.
//implements: interface�� �����Ѵ�.
public class Speaker implements Volume{
	int VolLevel;
	
	public void Speaker() {

	}

	@Override
	public void volumeUp(int level) {
		if(this.VolLevel+level>100) {
			this.VolLevel=100;
			System.out.println(getClass().getSimpleName()+" ������ 100���� �����Ǿ����ϴ�.");
		}else {
			this.VolLevel+= level;
			System.out.println(getClass().getSimpleName()+" ������ "+level+"��ŭ �����Ͽ�, "+this.VolLevel+"�Դϴ�.");
		}
	}

	@Override
	public void volumeDown(int level) {
		if(this.VolLevel-level<0) {
			this.VolLevel=0;
			System.out.println(getClass().getSimpleName()+" ������ 0���� �����Ǿ����ϴ�.");
		}else {
			this.VolLevel-= level;
			System.out.println(getClass().getSimpleName()+" ������ "+level+"��ŭ �����Ͽ�, "+this.VolLevel+"�Դϴ�.");
		}
	}

}
