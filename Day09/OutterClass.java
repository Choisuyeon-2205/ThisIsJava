package com.kosta.day09;

public class OutterClass extends Object implements Comparable<OutterClass>{
	//1.field: non-static(������), static(�޸�)
	//2.constructor
	//3.method: non-static, static
	//4.static block
	//5. inner class, inner interface
	class InnerClass{ //�ν��Ͻ� Ŭ����
		
	}
	
	static class InnerClass2{ //static Ŭ����
		
	}
	
	void test() {
		class InnerClass3{ //local Ŭ����
			InnerClass innerclass= new InnerClass();
		}
	}

	@Override
	public int compareTo(OutterClass o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
