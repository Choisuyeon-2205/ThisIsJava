package com.kosta.day08.lab3;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		//배열: 하나의 이름으로 같은 종류의 여러개의 값을 저장하기 위한 연속공간을 만드는 자료구조
		//장점: 속도가 빠르다.
		//단점: 갯수를 알아야 생성가능
		Shape[] arr= new Shape[5];
		arr[0]= new Rectangle(10,20);
		arr[1]= new Rectangle(10,20);
		
		//Collection= List, Set, Map, Interface
		//List: 순서가 있다. 중복을 허용한다. 초기값이 없으면 default갯수만큼 생성된다.(10개)
		//공간이 없으면 자동으로 공간이 추가된다.
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
