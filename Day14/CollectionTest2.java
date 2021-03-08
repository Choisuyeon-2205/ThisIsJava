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
			System.out.println("키:"+ entry.getKey());
			System.out.println("값:"+ entry.getValue());
			System.out.println("-----------------------------");
		}
	}

	private static void method6() {
		Properties datas= System.getProperties(); //eclipse환경
		for(Entry entry :datas.entrySet()) {
			System.out.println("키:"+ entry.getKey());
			System.out.println("값:"+ entry.getValue());
			System.out.println("-----------------------------");
		}
		
	}

	private static void method5() {
		Map<String,String> datas= System.getenv(); //os의환경
		for(Entry<String, String> entry :datas.entrySet()) {
			System.out.println("키:"+ entry.getKey());
			System.out.println("값:"+ entry.getValue());
			System.out.println("-----------------------------");
		}
		
	}

	private static void method4() {
		// properties
		Properties datas= new Properties();
		datas.put("자바", "이것이 자바다");
		datas.put("SQL", "SQL정복");
		datas.put("HTML", "web정복");
		for(Entry<Object, Object> entry :datas.entrySet()) {
			System.out.println("학생 키:"+ entry.getKey());
			System.out.println("고객 값:"+ entry.getValue());
			System.out.println("-----------------------------");
		}
	}

	private static void method3() {
		Map<Student, CustomerDTO> datas= new Hashtable<>();
		datas.put(new Student("학생1","남", 100), new CustomerDTO(1, "고객1", "02-1234-5678", "seoul"));
		datas.put(new Student("학생2","남", 100), new CustomerDTO(1, "고객1", "02-1234-5678", "seoul"));
		datas.put(new Student("학생3","남", 100), new CustomerDTO(1, "고객1", "02-1234-5678", "seoul"));
		
		// 모두제거
		//datas.clear();
		
		//1건 지우기
		CustomerDTO cust = datas.remove(new Student("학생1","남", 100));
		System.out.println(cust+"가 지워짐");
		
		System.out.println("##################");
		
		for(Entry<Student,CustomerDTO> entry: datas.entrySet()) {
			System.out.println("학생 키:"+ entry.getKey());
			System.out.println("고객 값:"+ entry.getValue());
			System.out.println("-----------------------------");
		}
	}

	private static void method2() {
		Map<String, Integer> datas= new HashMap();

		datas.put("홍길동", 100);
		datas.put("홍길동", 90); //같은키가 이미 존재하면 덮어쓰기
		datas.put("박길동", 90);
		datas.put("김길동", 20);
		datas.put("최길동", 30);
		
		//키가 있는지?
		System.out.println(datas.containsKey("박길동2"));
		//값이 있는지?
		System.out.println(datas.containsValue(90));
		
		Collection<Integer> scores= datas.values();
		int sum=0;
		for(Integer i :scores) {
			sum+=i;
		}
		System.out.println("총점은 "+ sum);
	}

	private static void method1() {
		//Map Interface 구현 class: HashMap, TreeMap, Properties, ...
		//키와 값의 쌍으로 이루어져있다. (Map.Entry)
		Map<String, Integer> datas= new HashMap();

		datas.put("홍길동", 100);
		datas.put("홍길동", 90); //같은키가 이미 존재하면 덮어쓰기
		datas.put("박길동", 10);
		datas.put("김길동", 20);
		datas.put("최길동", 30);

		System.out.println(datas);

		//key를 이용해서 값을 얻는다.
		int val= datas.get("홍길동");
		System.out.println("val="+val);

		//모든 키를 얻기
		Set<String> keys= datas.keySet();
		for(String key:keys) System.out.println(key+"-->"+datas.get(key));
		System.out.println("-------------------------");

		for(String key: datas.keySet()) {
			System.out.println(key+"-->"+datas.get(key));

			System.out.println("**************************");
			Set<Entry<String,Integer>> entrys= datas.entrySet(); //entry가 들어잇는 set
			Iterator<Entry<String,Integer>> iter= entrys.iterator();
			
			while(iter.hasNext()) {
				Entry<String,Integer> entry= iter.next();
				System.out.println("키:"+entry.getKey());
				System.out.println("값:"+entry.getValue());
				
			System.out.println("============================");
			for(Entry<String,Integer> ent:datas.entrySet()) {
				System.out.println("키:"+ent.getKey());
				System.out.println("값:"+ent.getValue());
			}
	
			}
		}
	}

}
