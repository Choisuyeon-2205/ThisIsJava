package com.kosta.day14;

import java.util.List;

public class MyThreadB extends Thread{
	List<String> list;

	public MyThreadB(String name, List<String> list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		for(int i=0; true; i++) {
			list.add(i+"Ãß°¡");
		}
	}


}
