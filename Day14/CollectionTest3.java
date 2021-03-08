package com.kosta.day14;

import java.util.*;

import com.kosta.day13.model.CustomerDTO;

public class CollectionTest3 {
	public static void main(String[] args) {
		method4();
	}

	private static void method4() {
		TreeSet<CustomerDTO> datas= new TreeSet<>();
		datas.add(new CustomerDTO(10,"��1","12","����"));
		datas.add(new CustomerDTO(2,"��2","22","�λ�"));
		datas.add(new CustomerDTO(13,"��3","23","����"));
		datas.add(new CustomerDTO(24,"��4","88","�λ�"));
		datas.add(new CustomerDTO(24,"��4","88","����"));
		System.out.println(datas.size()+"��");

//		while(!datas.isEmpty()) {
//			CustomerDTO cust= datas.pollFirst();
//			System.out.println(cust);
//			System.out.println(datas.size()+"��");
//		}
		
		//������������ sorting �ϱ�!
		NavigableSet<CustomerDTO> descendingSet= datas.descendingSet();
		
		for(CustomerDTO s: descendingSet) {
			System.out.println(s);
		}
		System.out.println("===============================");
		//��������
		NavigableSet<CustomerDTO> asc= descendingSet.descendingSet();
		for(CustomerDTO s: asc) {
			System.out.println(s);
		}
		
	}

	private static void method3() {
		TreeSet<CustomerDTO> datas= new TreeSet<>();
		datas.add(new CustomerDTO(1,"��1","12","�λ�"));
		datas.add(new CustomerDTO(2,"��2","22","����"));
		datas.add(new CustomerDTO(3,"��3","23","����"));
		datas.add(new CustomerDTO(4,"��4","88","�λ�"));
		datas.add(new CustomerDTO(4,"��4","88","����"));
		
		//ù��° item
		System.out.println("ù��° item: "+datas.first());
		
		//������ item
		System.out.println("������ item: "+datas.last());
				
		
		for(CustomerDTO s:datas) {
			System.out.println(s);
		}
	}

	private static void method2() {
		//String���̾ �ƽ�Ű�ڵ� ���� �������� �����Ѵ�.
		Set<String> datas= new TreeSet<>();
		datas.add("��");
		datas.add("ȭ");
		datas.add("��");
		datas.add("��");
		datas.add("��");
		for(String s:datas) {
			System.out.println(s);
		}
		
	}

	private static void method1() {
		//TreeSet�� ���� ���� �� binary tree �̿�, ũ�� ��, ũ�� ������, ������ ���ʿ� ����
		// ���� hashset���� �ӵ��� ��������, ���ĵ� ����� ����Ѵ�.
		
		TreeSet<Integer> datas= new TreeSet<>();
		datas.add(100);
		datas.add(50);
		datas.add(70);
		datas.add(30);
		datas.add(30);
		
		//ù��° item
		System.out.println("ù��° item: "+datas.first());

		//������ item
		System.out.println("������ item: "+datas.last());

		//���غ��� ���� item
		System.out.println("���غ��� ���� item: "+ datas.lower(50));
		//���غ��� ū item
		System.out.println("���غ��� ū item: "+ datas.higher(50));
		
		//floor: �����ϰų� ��
		System.out.println("���غ��� ���ų� ���� item: "+ datas.floor(50));
		//ceiling: �����ϰų� ��
		System.out.println("���غ��� ���ų� ū item: "+ datas.ceiling(50));
		
		System.out.println("====��ü ���====");
		for(Integer i: datas) {
			System.out.println(i);
		}
	}
}
