package com.kosta.day09;

public class OutterClass extends Object implements Comparable<OutterClass>{
	//1.field: non-static(힙영역), static(메모리)
	//2.constructor
	//3.method: non-static, static
	//4.static block
	//5. inner class, inner interface
	class InnerClass{ //인스턴스 클래스
		
	}
	
	static class InnerClass2{ //static 클래스
		
	}
	
	void test() {
		class InnerClass3{ //local 클래스
			InnerClass innerclass= new InnerClass();
		}
	}

	@Override
	public int compareTo(OutterClass o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
