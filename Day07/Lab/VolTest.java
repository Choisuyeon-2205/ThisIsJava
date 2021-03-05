package com.kosta.day07.lab;

//Volume: ���� class, interface ��� ����
//������ ������ �� �� �ִ�. �ڵ�����ȯ ����

public class VolTest {
	
	public static void method(Volume[] volList) {
		
		for(Volume v: volList){
			for(int j = 1; j <= 3; j++){
				v.volumeUp(200);
			}
			for(int j = 1; j <= 3; j++){
				v.volumeDown(300);
			}
		}
		
	}
	
	public static void main(String args[]){
		Volume[] v = new Volume[3];
		makeVolume(v);	
		method(v);
		
	}

	private static void makeVolume(Volume[] v) {
		v[0] = new Speaker();
		v[1] = new Radio();
		v[2] = new TV();
	}
}
