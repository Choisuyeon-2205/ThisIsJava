package com.kosta.day01;

public class VariableTest4 {

	public static void main(String[] args) {
		// �ڹ��� �⺻Ÿ�� 8����
		// ������Ÿ�� (�����ͼ���)
		//1.����(byte(1) < short(2) < int(4) < long(8))
		//                char(2)<-������ ����
		//2.�Ǽ�(float(4) < double(8))
		//3.��(boolean)
		
		byte b= 127;
		short s= 32767;
		char c= 65535;
		int i= 2147483647; //4 ����Ʈ, default: int
		long lo= 2147483648L; //L, l ǥ�����ֱ�
		float f= 3.14f;
		double d= 3.14; //default: double
		boolean bo= 10>20; //false|true
		System.out.println(bo);
		
		i++;
		System.out.println(i);
		
		//data�� ����ȯ: �ڵ�|����(�����)
		//1.�ڵ�(ū��=������)
		byte aa= 127;
		short ss= 100;
		int ii= aa;
		ii= ss;
		double dd= ii;
		char cc='A'; //65
		cc= 'a'; //97
		
		// ss = cc; short�� char���� ����ȯ�� �ȉ�
		ii= cc;
		
		System.out.println(dd);
		System.out.println(ii);
		
		//2. ��������ȯ
		//������ ����� ���� �սǵȴ�.
		byte b2= 100;
		int i2= 100;
		
		// i2= b2; (�ڵ�����ȯ)
		b2= (byte)i2;
		System.out.println(b2);
		System.out.println(i2);
		
		char c2= (char)i2;
		System.out.println(c2);
		System.out.println(i2);
		
		System.out.println('A');
		System.out.println((int)'A');
		
		
		
		
	}

}
