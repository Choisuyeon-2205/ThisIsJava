package com.kosta.day02;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년 월을 입력하세요(ex.2000 2)");
		int year;
		int month;
		int lastDay=31;
		year = sc.nextInt();
		month= sc.nextInt();
        
		if (month==2) {
			if(((year%4==0)&&(year%100!=0))||(year%400==0))
				lastDay=29;
			else
				lastDay=28;
		}else if(month==4||month==6||month==9||month==11) {
			lastDay=30;
		}
		
		System.out.println(year+"년"+month+"일"+"의 마지막 날짜는 "+lastDay+"입니다.");
		
		
	}

}
