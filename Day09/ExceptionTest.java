package com.kosta.day09;

public class ExceptionTest {

	public static void main(String[] args) {
		method8();
		System.out.println("main END");

	}

	private static void method8() {
		try {
			int a=10/1;
			int [] arr = new int[5];
			arr[4]= 100;
			String s= "JAVA";
			System.out.println(s.length());
			Object obj= new String("자바");
			String str= (String)obj;
			Integer i= (Integer)obj; //cast 오류
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("index범위 벗어남");
		}catch (NullPointerException e) {
			System.out.println("null 참조 불가");
		}catch (ClassCastException e) {
			System.out.println("형변환 오류");
		}catch (Exception e) {
			System.out.println("기타 예외발생: "+e.getMessage());
		}finally {
			System.out.println("반드시 수행한다.");
		}
		
	}

	private static void method7() {
		// 예외처리
		//1) 내가한다.: try~catch~finally
		//2) 떠넘긴다.
		try {
			System.out.println("예외발생 가능성있는 문장들");
			int a= 10/0;
			System.out.println("이 문장은 수행하지 않는다.");
		} catch (Exception e) {
			System.out.println("예외발생 시 수행한다.");
		} finally {
			System.out.println("항상 수행한다.");
			//자원반납코드를 한다. ex) DB닫기, 파일닫기 등
		}
		
	}

	private static void method6() {
		String s= new String("자바");
		//자동형변환
		Object s2= new String("자바");
		//강제형변환
		try{
			String s3= (String)s2;
			Integer i= (Integer)s2; //실행시 에러 => instance of로 확인후 실행O
		}catch(ClassCastException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void method5() {
		int[] arr= new int[5];
		try {
		System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace(); //오류가 나는 상황을 보여줌
			System.out.println(e.getMessage());
		}
	}

	private static void method4() {
		try {
			String s= "자바";
			System.out.println(s.length()+"글자");
			s= null;
			System.out.println(s.length()+"글자");
		}catch(NullPointerException e) {
			System.out.println("null은 참조불가");
		}

	}

	private static void method3() {
		//Exception의 종류 2가지: 컴파일 시 예외, 실행 시 예외(Runtime Exception)
		
		try {
			Class.forName("com.kosta.day09.Button");  //Button을 메모리에 올려라(컴파일 시 예외)
			System.out.println("load 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("class load 실패");
			e.printStackTrace();
		}
		
		
	}

	private static void method2() {
		int a=10;
		int b=0;
		try {
			//예외발생 가능성이 있는 문장들
			System.out.println(a/b);
		}catch(ArithmeticException aa){
			System.out.println("0으로 나누기 불가");
		}
	}

	//오류가 발생하지 않도록 업무로직 중간에 값을 체크
	//업무로직+ 오류처리로직이 섞인다... 좋은코드 아니다.
	//Exception사용: 업무로직, 오류처리로직을 분리한다.
	//오류발생 시, 프로그램이 비정상적으로 종료되지 않게 하기위해서 사용한다.
	private static void method1() {
		int a=10;
		int b=0;
		
		if(b==0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return; //호출한 곳으로 돌아간다.
		}
		System.out.println(a/b);
	}

}
