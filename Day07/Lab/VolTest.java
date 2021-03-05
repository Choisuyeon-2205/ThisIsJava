package com.kosta.day07.lab;

//Volume: 상위 class, interface 모두 가능
//하위가 상위에 들어갈 수 있다. 자동형변환 가능

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
