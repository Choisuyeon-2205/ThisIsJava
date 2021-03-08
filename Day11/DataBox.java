package com.kosta.day11;

//���� �����尡 �����ϴ� ������ -(������ thread, �Һ��� thread)
public class DataBox {
	private String data;

	//�Һ���
	public synchronized String getData() {
		if(this.data== null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String returnValue= data;
		System.out.println("�Һ��� �����尡 ���� ������: "+returnValue);
		data=null; //������ �ʱ�ȭ��
		notify();
		return returnValue;
	}
	
	//������
	public synchronized void setData(String data) {
		if(this.data!=null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data = data;
		System.out.println("�����ڰ� ���� ������: "+data);
		notify();
	}
	
	
	

}
