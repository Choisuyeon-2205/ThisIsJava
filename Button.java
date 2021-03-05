package com.kosta.day09;

import javax.swing.ButtonModel;

class MessageListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("MessageListener�� Ŭ���Ѵ�.");	
	}
}

class CallListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("CallListener�� Ŭ���Ѵ�.");	
	}
}

public class Button {
	OnClickListener listener;
	
	void setListener(OnClickListener listener) {
		//�����̸��̶� ���ƾ� ����
		this.listener= listener;
	}
	
	//�Ϲݸ޼ҵ�
	void touch() {
		listener.onClick();
	}
	//inner interface --- Button Ŭ���������� ��������
	interface OnClickListener{
		void onClick();
	}

}
