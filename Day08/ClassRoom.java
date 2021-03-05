package com.kosta.day08;

public class ClassRoom {
	String title="instance����";
	static String title2= "static����";
	
	//1.instance inner class
	class Desk{
		String title3="instance inner class...instance����";
		// �Ұ��� ... (static) String title4= "static����";
		
	}
	//2.static inner class
	static class Chair{
		String title5="static inner class...instance����";
		static String title6= "static inner class...static����";
		
	}
	//3.local inner class
	void test(final String param, String param2) {
		 final String title8="local����";
		 String title9="local����";
		 //�Ұ�... param= "���� ����";
		 param2="���� ����";
		 //�Ұ�...title8="���� ����";
		 title9="���� ����";
		 
		 class Computer{
				String title7="local inner class...instance����";
				//�Ұ���... static String title8= "local inner class...static����";
				void print() {
					System.out.println(param);
					System.out.println(title8);
				}
		}
		 Computer cc= new Computer();
		 cc.print();
		 System.out.println(cc.title7);
	}

}
