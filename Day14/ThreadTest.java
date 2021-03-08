package com.kosta.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadTest {
	
	//vector: 동기화 지원... 공유자원을 여러스레드가 공유한다.
	// arraylist는 동기화 지원안됨
	public static void main(String[] args) {
//		List<String> alist = new ArrayList<>();
		List<String> alist = new Vector<>();
		
		MyThreadA t1= new MyThreadA ("A스레드", alist);
		MyThreadB t2= new MyThreadB("B스레드", alist);
	
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.stop= true;
	}
}
