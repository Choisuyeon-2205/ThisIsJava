package com.kosta.day14;

import java.util.*;

public class MyThreadA extends Thread{
	List<String> list;
	boolean stop= false;
	
	public MyThreadA(String name, List<String> list) {
		super(name);
		this.list= list;
	}

	@Override
	public void run() {
		while(!stop) {
			synchronized (list) {
				for(String s: list) {
					System.out.println(s+"읽기");
				}
			}

		}
		System.out.println("AThread종료");
	}



}
