package com.kosta.day14;

import java.util.*;
import java.util.Map.Entry;

import com.kosta.day13.model.CustomerDTO;

public class CollectionTest4 {
	public static void main(String[] args) {
		method2();
	}
	
	private static void method2() {
		//Map<Car, CustomerDTO> datas= new HashMap<>(); //hashcode(), equals() ����
		TreeMap<Car, CustomerDTO> datas= new TreeMap<>(); 
		datas.put(new Car("ABC��",1000) , new CustomerDTO(100,"��1","123","����"));
		datas.put(new Car("DDD��",5000) , new CustomerDTO(100,"��2","444","����"));
		datas.put(new Car("EEE��",2000) , new CustomerDTO(100,"��4","122","�λ�"));
		datas.put(new Car("ZZZ��",7000) , new CustomerDTO(100,"��3","777","����"));

		{
			Entry<Car, CustomerDTO> entry= datas.firstEntry();
			System.out.println(entry); //Ű=��
			System.out.println("Ű: "+ entry.getKey());
			System.out.println("��: "+ entry.getValue());
			
			entry= datas.lowerEntry(new Car("EEE��",2000));
			System.out.println("lowerEntry: "+ entry);
			entry= datas.higherEntry(new Car("EEE��",2000));
			System.out.println("higherEntry: "+ entry);
		}

		System.out.println("====================================");

		for(Entry<Car, CustomerDTO> entry: datas.entrySet()) {
			System.out.println("Ű: "+ entry.getKey());
			System.out.println("��: "+ entry.getValue());
		}
		
		System.out.println("****************************************");

		NavigableMap<Car, CustomerDTO> desc= datas.descendingMap();
		for(Entry<Car, CustomerDTO> entry: desc.entrySet()) {
			System.out.println("Ű: "+ entry.getKey());
			System.out.println("��: "+ entry.getValue());
		}
	}

	private static void method1() {
		Map<String, Integer> datas= new TreeMap<>();

		datas.put("ȫ�浿", 100);
		datas.put("ȫ�浿", 90); //����Ű�� �̹� �����ϸ� �����
		datas.put("�ڱ浿", 10);
		datas.put("��浿", 20);
		datas.put("�ֱ浿", 30);

		System.out.println(datas);
	}
}
