package com.kosta.day08;

public class MyClass {
	RemoteControl rc;
	
	public MyClass(RemoteControl rc) {
		this.rc= rc;
	}
	
	void methodA() {
		rc= new Audio();
	}
	
	void setRC(RemoteControl rc) {
		this.rc= new Audio();
	}

}
