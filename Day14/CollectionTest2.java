package com.kosta.day14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import com.kosta.day13.Student;
import com.kosta.day13.model.CustomerDTO;

public class CollectionTest2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		method7();

	}
	
	private static void method7() throws FileNotFoundException, IOException {
		Properties pro= new Properties();
		String fname= "src/com/kosta/day14/oracleInfo.properties";
		pro.load(new FileReader(fname));
		for(Entry entry :pro.entrySet()) {
			System.out.println("Ű:"+ entry.getKey());
			System.out.println("��:"+ entry.getValue());
			System.out.println("-----------------------------");
		}
	}

	private static void method6() {
		Properties datas= System.getProperties(); //eclipseȯ��
		for(Entry entry :datas.entrySet()) {
			System.out.println("Ű:"+ entry.getKey());
			System.out.println("��:"+ entry.getValue());
			System.out.println("-----------------------------");
		}
		
	}

	private static void method5() {
		Map<String,String> datas= System.getenv(); //os��ȯ��
		for(Entry<String, String> entry :datas.entrySet()) {
			System.out.println("Ű:"+ entry.getKey());
			System.out.println("��:"+ entry.getValue());
			System.out.println("-----------------------------");
		}
		
	}

	private static void method4() {
		// properties
		Properties datas= new Properties();
		datas.put("�ڹ�", "�̰��� �ڹٴ�");
		datas.put("SQL", "SQL����");
		datas.put("HTML", "web����");
		for(Entry<Object, Object> entry :datas.entrySet()) {
			System.out.println("�л� Ű:"+ entry.getKey());
			System.out.println("�� ��:"+ entry.getValue());
			System.out.println("-----------------------------");
		}
	}

	private static void method3() {
		Map<Student, CustomerDTO> datas= new Hashtable<>();
		datas.put(new Student("�л�1","��", 100), new CustomerDTO(1, "��1", "02-1234-5678", "seoul"));
		datas.put(new Student("�л�2","��", 100), new CustomerDTO(1, "��1", "02-1234-5678", "seoul"));
		datas.put(new Student("�л�3","��", 100), new CustomerDTO(1, "��1", "02-1234-5678", "seoul"));
		
		// �������
		//datas.clear();
		
		//1�� �����
		CustomerDTO cust = datas.remove(new Student("�л�1","��", 100));
		System.out.println(cust+"�� ������");
		
		System.out.println("##################");
		
		for(Entry<Student,CustomerDTO> entry: datas.entrySet()) {
			System.out.println("�л� Ű:"+ entry.getKey());
			System.out.println("�� ��:"+ entry.getValue());
			System.out.println("-----------------------------");
		}
	}

	private static void method2() {
		Map<String, Integer> datas= new HashMap();

		datas.put("ȫ�浿", 100);
		datas.put("ȫ�浿", 90); //����Ű�� �̹� �����ϸ� �����
		datas.put("�ڱ浿", 90);
		datas.put("��浿", 20);
		datas.put("�ֱ浿", 30);
		
		//Ű�� �ִ���?
		System.out.println(datas.containsKey("�ڱ浿2"));
		//���� �ִ���?
		System.out.println(datas.containsValue(90));
		
		Collection<Integer> scores= datas.values();
		int sum=0;
		for(Integer i :scores) {
			sum+=i;
		}
		System.out.println("������ "+ sum);
	}

	private static void method1() {
		//Map Interface ���� class: HashMap, TreeMap, Properties, ...
		//Ű�� ���� ������ �̷�����ִ�. (Map.Entry)
		Map<String, Integer> datas= new HashMap();

		datas.put("ȫ�浿", 100);
		datas.put("ȫ�浿", 90); //����Ű�� �̹� �����ϸ� �����
		datas.put("�ڱ浿", 10);
		datas.put("��浿", 20);
		datas.put("�ֱ浿", 30);

		System.out.println(datas);

		//key�� �̿��ؼ� ���� ��´�.
		int val= datas.get("ȫ�浿");
		System.out.println("val="+val);

		//��� Ű�� ���
		Set<String> keys= datas.keySet();
		for(String key:keys) System.out.println(key+"-->"+datas.get(key));
		System.out.println("-------------------------");

		for(String key: datas.keySet()) {
			System.out.println(key+"-->"+datas.get(key));

			System.out.println("**************************");
			Set<Entry<String,Integer>> entrys= datas.entrySet(); //entry�� ����մ� set
			Iterator<Entry<String,Integer>> iter= entrys.iterator();
			
			while(iter.hasNext()) {
				Entry<String,Integer> entry= iter.next();
				System.out.println("Ű:"+entry.getKey());
				System.out.println("��:"+entry.getValue());
				
			System.out.println("============================");
			for(Entry<String,Integer> ent:datas.entrySet()) {
				System.out.println("Ű:"+ent.getKey());
				System.out.println("��:"+ent.getValue());
			}
	
			}
		}
	}

}
