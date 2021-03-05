package com.kosta.day08;

public class ClassRoomTest {

	public static void main(String[] args) {
		method3();

	}

	private static void method3() {
		//3. local inner class
		ClassRoom cc= new ClassRoom();
		cc.test("가산", "KOSTA");
		
	}

	private static void method2() {
		System.out.println(ClassRoom.Chair.title6);
		ClassRoom.Chair cc= new ClassRoom.Chair();
		System.out.println(cc.title5);
		
	}

	private static void method1() {
		//1.instance inner class 연습
		ClassRoom.Desk desk= new ClassRoom().new Desk();
		System.out.println(desk.title3);
		
	}

}
