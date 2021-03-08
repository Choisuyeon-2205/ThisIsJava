package com.kosta.day11;

import java.util.*;

public class WrapperTest {

	public static void main(String[] args) {
		method6();

	}

	private static void method6() {
		// 중복없음 <- set
		Random r= new Random(1);
		Set<Integer> luckNum= new HashSet<>();
		while(luckNum.size()!=6) {
			int su= r.nextInt(45)+1;
			luckNum.add(su);
		}
		System.out.println(luckNum);
	}

	private static void method5() {
		//로또 번호 6개가 무작위 추출, 중복 없기
		int[] total= new int[6];
		int count= 0;
		Random r= new Random(1);
		
		AA: while(true) {
			if(count==total.length) break;
			int num= r.nextInt(45)+1;
			
			for(int i=0;i<count;i++) {
				if(num==total[i]) continue AA;
			}
			
			total[count]=num;
			count++;
		}
		
		System.out.println(Arrays.toString(total));
	}

	private static void method4() {
		Random r= new Random(1);
		System.out.println(r.nextInt(45)+1);
		
	}

	private static void method3() {
		double a= Math.random();
		System.out.println(a); //0<= <1
		System.out.println(a*10); //0<= <10
		System.out.println((int)(a*10)); //0<= <10 정수
		System.out.println((int)(a*10)+1); 
		System.out.println((int)(a*45)+1); //1<= <=45
		
	}

	private static void method2() {
		int a= 10;
		int b= 20;
		
		System.out.println(Math.max(a, b));  //최대값
		System.out.println(Math.round(98.5)); //반올림
		System.out.println(Math.ceil(98.1)); //무조건 올림
		System.out.println(Math.floor(98.9));
	}

	private static void method1() {
		byte b=10;
		short s= 10;
		char c= 'A';
		int i= 10;
		long l= 10L;
		float f= 3.14f;
		double d= 3.14;
		boolean b1= true;
		
		//Autoboxing!! 
		Byte b2=10; //new Byte(10); 과 같음
		Short s2= 10;
		Character c2= 'A';
		Integer i2= 10;
		Long l2= 10L;
		Float f2= 3.14f;
		Double d2= 3.14;
		Boolean bl2= true;
		
		//unboxing
		System.out.println(b2.byteValue()+20);
		System.out.println(b2+20);
		System.out.println(s2+20);
		System.out.println(c2+20);
		System.out.println(i2+20);
		System.out.println(l2+20);
		System.out.println(f2+20);
		System.out.println(d2+20);
		System.out.println(bl2.booleanValue());
		System.out.println(bl2);
		
		String str= "100";
		System.out.println(Integer.parseInt(str));
		System.out.println(Double.parseDouble(str));
		
		String str2="true";
		if(Boolean.parseBoolean(str2)) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
		
	}

}
