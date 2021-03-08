package com.kosta.day14;
import java.util.*;

import com.kosta.day13.model.CustomerDTO;

public class CollectionTest {

	public static void main(String[] args) {
		method6();
	}
	
	private static void method6() {
		String s1= "ȫ�浿";
		String s2= "ȫ�浿";
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//CustomerDTO Ÿ���� ������ �� �ߺ����� ������ �� ����
		Set<CustomerDTO> datas= new HashSet<>();
		CustomerDTO c1= new CustomerDTO(100,"ȫ�浿","010-7777-8888","����");
		CustomerDTO c2= new CustomerDTO(100,"���ڹ�"
				+ "","010-7777-8888","����");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		datas.add(c1);
		datas.add(new CustomerDTO(200,"��浿","010-6666-8888","���"));
		datas.add(new CustomerDTO(300,"�ڱ浿","010-5555-8888","�뱸"));
		datas.add(new CustomerDTO(400,"���浿","010-4444-8888","�λ�"));
		datas.add(c2);
		
		for(CustomerDTO cust: datas)
			System.out.println(cust);
	}

	private static void method5() {
		//Set interface�� ���� class: HashSet, TreeSet
		//������ ����, �ߺ� �Ұ�, Ű�� ����Ѵ�.
		//�ε���X
		Set<String> datas= new HashSet<>();
		datas.add("������");
		datas.add("ȭ����");
		datas.add("�����");
		datas.add("�����");
		datas.add("�Ͽ���");
		System.out.println(datas.size()+"��");
		
		//1. �Ϲ� for�� �б� ---> X
		//2. ���� for ---> O
		for(String s:datas) {
			System.out.println(s);
		}
		//3. iterator�̿�(�ݺ���)
		Iterator<String> it= datas.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	private static void method4() {
		String[] days= {"��","��","ȭ","��","��","��","��","��","��"};
		String s = Arrays.toString(days);
		System.out.println(s);
		
		List<String> datas= Arrays.asList(days);
		print(datas);
		
		System.out.println(datas.contains("��")?"ok":"no");
		
		//1. �Ϲ� for �б�... for(;;)
		//2. ���� for �б�... for(1�� :collection)
		//3. Iterator �ݺ��� �̿��ؼ� �б�
		Iterator<String> it= datas.iterator();
		while(it.hasNext()) {
			String data= it.next();
			System.out.println(data);
		}
	}

	private static void method3() {
		// List �������̽��� ������ class: Vector
		// ������ �ִ�.
		// �ߺ� ���
		List<String> datas= new Vector<String>(); //����� ���� ������ 10��
		String[] days= {"��","ȭ","��","��","��","��","��","��"};
		for(String d: days) {
			datas.add(d+"����");
		}
		print(datas);
	}
	
	private static void method2() {
		// List �������̽��� ������ class: LinkedList
		// ������ �ִ�.
		// �ߺ� ���
		List<String> datas= new LinkedList<String>(); //����� ���� ������ 10��
		String[] days= {"��","ȭ","��","��","��","��","��","��"};
		for(String d: days) {
			datas.add(d+"����");
		}
		print(datas);

	}

	private static void method1() {
		// List �������̽��� ������ class: ArrayList
		// ������ �ִ�.
		// �ߺ� ���
		List<String> datas= new ArrayList<String>(3); //����� ���� ������ 10��
		String[] days= {"��","ȭ","��","��","��","��","��","��"};
		for(String d: days) {
			datas.add(d+"����");
		}
		
		//�Լ� ����
		String s= datas.get(7);
		System.out.println("7��° �� ��������: "+s);
		
		if(datas.contains("ȭ����")) {
			System.out.println("ȭ���� �����Ѵ�.");
		}
		
		print(datas);
		print2(datas);
		
		//datas.clear();
		
		
	}
	
	private static void print2(List<String> datas) {
		for(int i=0; i<datas.size(); i++)
			System.out.println(i+"��°-->"+datas.get(i));
	}
	
	private static void print(List<String> datas) {
		for(String s: datas)
			System.out.println(s);
	}
}
