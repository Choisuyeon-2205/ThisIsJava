package com.kosta.day07;

public class ����������2 {

	public static void main(String[] args){
		//�⺻���� �ڵ� �� ��ȯ: ū�� = ������
		long lo;
		int i= 100;
		lo= i;
		
		//��ü�� �ڵ�����ȯ: �θ� = �ڽ�
		Tire h= new HankookTire();
		Tire k= new KumhoTire();
		use(h);
		use(k);
		use(new HankookTire());
		use(new KumhoTire());

	}
	
	public static void use(Tire tire) {
		System.out.println(tire);
		System.out.println("==============");
	}

}
