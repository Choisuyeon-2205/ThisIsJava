package com.kosta.day08;

//interface=> 상수 + 추상메소드
//abstract class => 일반 클래스+ 추상메소드
public interface Volume {
	//상수
	public static final String TITLE="볼륨";
	String TITLE2="볼륨2";
	
	//추상메소드
	void volumeUp(int level);
	void volumeDown(int level);
	
	//interface에 추상메소드가 추가되면 implement를 받은 class에 영향을 미친다.
	//즉," 추상에서도 반드시 구현한다."
	//3. default method8전에서 추가됨
	// 구현된 class에서 재정의 가능
	default void close() {
		System.out.println("Volume interface 구현한 모든 class에 적용된다.");
	}
	//4. static method 8버전에서 추가됌
	static void volumeInfo() {
			System.out.println("Volume interface의 method");
		}
	}
	
