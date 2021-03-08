package com.kosta.day14;

import java.util.*;
import java.util.Map.Entry;

import com.kosta.day13.model.CustomerDTO;

public class CollectionTest4 {
	public static void main(String[] args) {
		method2();
	}
	
	private static void method2() {
		//Map<Car, CustomerDTO> datas= new HashMap<>(); //hashcode(), equals() ±¸Çö
		TreeMap<Car, CustomerDTO> datas= new TreeMap<>(); 
		datas.put(new Car("ABC¸ðµ¨",1000) , new CustomerDTO(100,"°í°´1","123","¼­¿ï"));
		datas.put(new Car("DDD¸ðµ¨",5000) , new CustomerDTO(100,"°í°´2","444","¼­¿ï"));
		datas.put(new Car("EEE¸ðµ¨",2000) , new CustomerDTO(100,"°í°´4","122","ºÎ»ê"));
		datas.put(new Car("ZZZ¸ðµ¨",7000) , new CustomerDTO(100,"°í°´3","777","¼­¿ï"));

		{
			Entry<Car, CustomerDTO> entry= datas.firstEntry();
			System.out.println(entry); //Å°=°ª
			System.out.println("Å°: "+ entry.getKey());
			System.out.println("°ª: "+ entry.getValue());
			
			entry= datas.lowerEntry(new Car("EEE¸ðµ¨",2000));
			System.out.println("lowerEntry: "+ entry);
			entry= datas.higherEntry(new Car("EEE¸ðµ¨",2000));
			System.out.println("higherEntry: "+ entry);
		}

		System.out.println("====================================");

		for(Entry<Car, CustomerDTO> entry: datas.entrySet()) {
			System.out.println("Å°: "+ entry.getKey());
			System.out.println("°ª: "+ entry.getValue());
		}
		
		System.out.println("****************************************");

		NavigableMap<Car, CustomerDTO> desc= datas.descendingMap();
		for(Entry<Car, CustomerDTO> entry: desc.entrySet()) {
			System.out.println("Å°: "+ entry.getKey());
			System.out.println("°ª: "+ entry.getValue());
		}
	}

	private static void method1() {
		Map<String, Integer> datas= new TreeMap<>();

		datas.put("È«±æµ¿", 100);
		datas.put("È«±æµ¿", 90); //°°ÀºÅ°°¡ ÀÌ¹Ì Á¸ÀçÇÏ¸é µ¤¾î¾²±â
		datas.put("¹Ú±æµ¿", 10);
		datas.put("±è±æµ¿", 20);
		datas.put("ÃÖ±æµ¿", 30);

		System.out.println(datas);
	}
}
