package com.kosta.day11;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) {
		method7();

	}

	private static void method8() {
		Date d1= new Date();
		System.out.println();
		
	}

	private static void method7() {
		LocalDate d= LocalDate.now();
		LocalDate d3= d.minusDays(7);
				
		System.out.println("오늘: "+d);
		System.out.println("일주일 전: "+ d3);
		
		System.out.println(d);
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.getMonthValue());
		
		LocalDateTime d2= LocalDateTime.now();
		System.out.println(d2);
		
	}

	private static void method6() {
		String s= "자동차의 모델은 {0}이고 자동차의 가격은 {1}이다.";
		Car car= new Car("모델A",2000);
		String[] obj= {car.getModel(),car.getPrice()+""};
		String result= MessageFormat.format(s,car.getModel(),car.getPrice());
		String result2= MessageFormat.format(s,obj);
		System.out.println(result);
		System.out.println(result2);
		
	}

	private static void method5() {
		String s= "전화는 {1}, 아이디는 {0}";
		String result= MessageFormat.format(s, "hong","010-3333-2222");
		System.out.println(result);
	}

	private static void method4() {
		Date d= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyy/MM/dd hh:mm:ss D/365 E a w/52");
		String s= sdf.format(d);
		System.out.println(s);
		
	}

	private static void method3() {
		int su= 10000000;
		DecimalFormat df= new DecimalFormat("###,###,###");
		String s= df.format(su);
		System.out.println(s);
	}

	private static void method2() {
		Calendar cal= Calendar.getInstance();
		TimeZone tz= TimeZone.getTimeZone("America/Los_Angeles");
		Calendar cal2= Calendar.getInstance(tz);
		
		System.out.println(cal);
		System.out.println(cal2);
		
		System.out.println((cal.get(Calendar.YEAR)));
		System.out.println((cal.get(Calendar.MONTH)));
		System.out.println((cal.get(Calendar.DAY_OF_MONTH)));
		System.out.println((cal.get(Calendar.HOUR)));
		System.out.println((cal.get(Calendar.MINUTE)));
		System.out.println((cal.get(Calendar.SECOND)));
		System.out.println(cal.get(Calendar.AM_PM)==0?"오전":"오후");
		
		System.out.println("----------------------------------------------");
		
		System.out.println((cal2.get(Calendar.YEAR)));
		System.out.println((cal2.get(Calendar.MONTH)));
		System.out.println((cal2.get(Calendar.DAY_OF_MONTH)));
		System.out.println((cal2.get(Calendar.HOUR)));
		System.out.println((cal2.get(Calendar.MINUTE)));
		System.out.println((cal2.get(Calendar.SECOND)));
		
		
		
	}

	private static void method1() {
		Date d= new Date();
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(d.toLocaleString());
		//System.out.println(d.getYear());
		//System.out.println(d.getMonth());  ->사용하기 불편해서 없어짐.
		System.out.println(d.getTime());
		
		java.sql.Date d2= new java.sql.Date(d.getTime());
		System.out.println(d2);
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy년도 MM월 dd일 hh:mm:ss");
		System.out.println(sdf.format(d));
		
	}

}
