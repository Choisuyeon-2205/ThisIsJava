package com.kosta.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadTest {
	
	//vector: ����ȭ ����... �����ڿ��� ���������尡 �����Ѵ�.
	// arraylist�� ����ȭ �����ȵ�
	public static void main(String[] args) {
//		List<String> alist = new ArrayList<>();
		List<String> alist = new Vector<>();
		
		MyThreadA t1= new MyThreadA ("A������", alist);
		MyThreadB t2= new MyThreadB("B������", alist);
	
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
