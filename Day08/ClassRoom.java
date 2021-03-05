package com.kosta.day08;

public class ClassRoom {
	String title="instance변수";
	static String title2= "static변수";
	
	//1.instance inner class
	class Desk{
		String title3="instance inner class...instance변수";
		// 불가능 ... (static) String title4= "static변수";
		
	}
	//2.static inner class
	static class Chair{
		String title5="static inner class...instance변수";
		static String title6= "static inner class...static변수";
		
	}
	//3.local inner class
	void test(final String param, String param2) {
		 final String title8="local변수";
		 String title9="local변수";
		 //불가... param= "변수 수정";
		 param2="변수 수정";
		 //불가...title8="변수 수정";
		 title9="변수 수정";
		 
		 class Computer{
				String title7="local inner class...instance변수";
				//불가능... static String title8= "local inner class...static변수";
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
