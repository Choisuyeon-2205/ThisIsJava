package com.kosta.day02;

public class ifTest {

	public static void main(String[] args) {
		//randomTest();
		randomTest2();
		
	}

	private static void randomTest2() {
		// ������ �� �����
		int dice= (int)(Math.random()*6)+1;
		System.out.println(dice);
		//¦������? Ȧ������? �Ǵ�
		String result;
		if(dice%2==1)
			result="Ȧ��";
		else
			result="¦��";
		
		System.out.println(dice+"===>"+ result);
		System.out.println(dice+"===>"+(dice%2==0?"¦���Դϴ�.":"Ȧ���Դϴ�."));
		
		System.out.println(result+"�Դϴ�.");
		
	}

	private static void randomTest() {
		// Math: ���а��Ŀ��� �ʿ��� ��ɵ��� ��Ƴ��� class
		System.out.println(Math.PI);
		System.out.println(Math.random()); //0<=random<1
		System.out.println((int)(Math.random()*10)+1); //1<=random<=10
		//1<=�ζ�<=45
		System.out.println((int)(Math.random()*45)+1); //1<=random<=45
		
	}

}
