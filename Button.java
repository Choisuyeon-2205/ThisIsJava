package com.kosta.day09;

import javax.swing.ButtonModel;

class MessageListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("MessageListener를 클릭한다.");	
	}
}

class CallListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("CallListener를 클릭한다.");	
	}
}

public class Button {
	OnClickListener listener;
	
	void setListener(OnClickListener listener) {
		//변수이름이랑 같아야 좋음
		this.listener= listener;
	}
	
	//일반메소드
	void touch() {
		listener.onClick();
	}
	//inner interface --- Button 클래스에서만 쓰기위함
	interface OnClickListener{
		void onClick();
	}

}
