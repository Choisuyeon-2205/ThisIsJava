package com.kosta.day08.lab3;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		//�迭: �ϳ��� �̸����� ���� ������ �������� ���� �����ϱ� ���� ���Ӱ����� ����� �ڷᱸ��
		//����: �ӵ��� ������.
		//����: ������ �˾ƾ� ��������
		Shape[] arr= new Shape[5];
		arr[0]= new Rectangle(10,20);
		arr[1]= new Rectangle(10,20);
		
		//Collection= List, Set, Map, Interface
		//List: ������ �ִ�. �ߺ��� ����Ѵ�. �ʱⰪ�� ������ default������ŭ �����ȴ�.(10��)
		//������ ������ �ڵ����� ������ �߰��ȴ�.
		List<Rectangle> alist= new ArrayList<>();
		alist.add(new Rectangle(10,20));
		alist.add(new Rectangle(10,20));
		System.out.println(alist.size());
		
		for(Rectangle r :alist) {
			System.out.println(r.getArea());
			System.out.println(r.getPerimeter());
		}
	}
}
