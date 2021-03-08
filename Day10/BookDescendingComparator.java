package com.kosta.day10;

import java.util.Comparator;

public class BookDescendingComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// descending..... ����� descending, �������� ascending
		int result= o2.getTitle().compareTo(o1.getTitle()); //���� descending
		if(result==0) { //������ ���� ��
			return o1.getPrice() - o2.getPrice(); //�������� ascending
		}
		return 0;
	}
	

}
