package com.kosta.day10;

import java.util.Comparator;

public class BookDescendingComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// descending..... 제목과 descending, 가격으로 ascending
		int result= o2.getTitle().compareTo(o1.getTitle()); //제목 descending
		if(result==0) { //제목이 같을 때
			return o1.getPrice() - o2.getPrice(); //가격으로 ascending
		}
		return 0;
	}
	

}
