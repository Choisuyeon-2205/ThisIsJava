package com.kosta.day03;

public class �������� {

	public static void main(String[] args) {
		//sample();
		//sample2();
		sample3();

	}
	
	private static void sample3() {
		// �������� �Ϲ������� null�� �ʱ�ȭ
		// null: ���ǵ� �ٰ� ����. ������ ���� ����.
		String s= null;
		System.out.println(s);
		
		System.out.println(s==null);
		System.out.println(s.length());
		
	}

	private static void sample2() {
		//���������� �ݵ�� �ʱ�ȭ�ϰ� ����Ѵ�.
		int a=0;
		double d= 0.0;
		boolean b;
		
		System.out.println(a+d);
		
	}

	private static void sample() {
		String s1="ȫ�浿"; //�����Ͻ� ���� => 1~2�� �ּҰ� ����
		String s2="ȫ�浿";
		String s3= new String("ȫ�浿");//����� ����=> 3-4�� �ٸ�
		String s4= new String("ȫ�浿"); 
		
		System.out.println(s1==s2); //�ּҰ� ����.
		System.out.println(s3==s4); //�ּҰ� �ٸ���.
		System.out.println(s1.equals(s4)); //������ ����.
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		
	}

}
