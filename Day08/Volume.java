package com.kosta.day08;

//interface=> ��� + �߻�޼ҵ�
//abstract class => �Ϲ� Ŭ����+ �߻�޼ҵ�
public interface Volume {
	//���
	public static final String TITLE="����";
	String TITLE2="����2";
	
	//�߻�޼ҵ�
	void volumeUp(int level);
	void volumeDown(int level);
	
	//interface�� �߻�޼ҵ尡 �߰��Ǹ� implement�� ���� class�� ������ ��ģ��.
	//��," �߻󿡼��� �ݵ�� �����Ѵ�."
	//3. default method8������ �߰���
	// ������ class���� ������ ����
	default void close() {
		System.out.println("Volume interface ������ ��� class�� ����ȴ�.");
	}
	//4. static method 8�������� �߰���
	static void volumeInfo() {
			System.out.println("Volume interface�� method");
		}
	}
	
