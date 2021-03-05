package com.kosta.day08;

public class NoteBook implements Volume{

	int volLevel;
	
	void test() {
		System.out.println("---����� ����----");
		System.out.println(TITLE);
		volumeUp(100);
		volumeDown(10);
		
		
		Volume.volumeInfo();
	}
	
	
	@Override
	public void close() {
		// default method�� ���� class���� �����ǰ� �����ϴ�.
		System.out.println(getClass().getSimpleName()+"close�Լ� ������");
	}


	@Override
	public void volumeUp(int level) {
		volLevel+= level;
		System.out.println(getClass().getSimpleName()+":"+volLevel);
	}
	
	@Override
	public void volumeDown(int level) {
		volLevel-= level;
		System.out.println(getClass().getSimpleName()+":"+volLevel);
	}
}
