package com.kosta.day10;

import java.util.Arrays;

public class PersonTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		sample1();

	}

	private static void sample3() {
		
		Car car1= new Car("SM7",4000);
		Car car2= new Car("SM7",4000);
		String[] phone1= new String[] {"010-2222-3333","02-4444-5555"};
		String[] phone2= new String[] {"010-2222-3333","02-4444-5555"};
		
		Person p1= new Person("ȫ�浿", 20, car1, phone1);
		Person p3= new Person("ȫ�浿", 20, car2, phone2);
		
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());
		
	}

	private static void sample2() {
		Car car= new Car("SM7",4000);
		
	}

	private static void sample1() throws CloneNotSupportedException {
		Car car1= new Car("SM7",4000);
		Car car2= new Car("SM7",4000);
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		String[] phone1= {"010-2222-3333","02-4444-5555"};
		String[] phone2= {"010-2222-3333","02-4444-5555"};
		Person p1= new Person("ȫ�浿", 20, car1, phone1);
		Person p3= new Person("ȫ�浿", 20, car2, phone2);
		Person p4= p3;
		p3.setName("�ڰ���");
		System.out.println(p3);
		System.out.println(p4);
		System.out.println("---------------------");
		
		//����: ������ ������ ������ ��ü�� ������ ��ġ�� �ʴ´�. ������ ������ �����Ѵ�.
		//���� ������ implements Cloneable, clone() �޼ҵ� �߰�
		//���� ������ clone() �޼ҵ忡�� �ڵ� �߰��� �ʿ�ȴ�.
		
		Person p5= (Person) p3.clone();
		p3.setName("��浿");
		p3.setAge(50);
		//�űԻ����ؼ� �����ϴ� ���� ������ ��
//		p3.setCar(new Car("���� ��",1000));
//		p3.setPhone(new String[] {"1234","5678"});
		//������ �ƴ��� Ȯ��
		p3.getCar().setModel("������");
		p3.getPhone()[0]="0000";
		System.out.println(p3);
		System.out.println(p5);
		System.out.println("---------------------");
		
		
		Person p2= new Person("��浿", 30,  new Car("�׷���",5000), new String[] {"010-6666-7777","02-1234-5555"});
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p1.equals(p3)?"��������,���̰���,������,��":"�̸��ٸ�");
	}

}
