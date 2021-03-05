package com.kosta.day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest3 {

	public static void main(String[] args) throws IOException {
		method2();

	}
	
	private static void method2() throws IOException {
		//예외처리
		//1) 내가한다.: try~catch~finally
		//2) 떠넘긴다.: throws
		FileReader fr = null;

		fr= new FileReader("src/com/kosta/day09/Button.java");
		System.out.println("파일열기 성공");
		int i;

		while((i= fr.read())!=-1){
			System.out.print((char)i);
		}
		System.out.println("try~catch END");

		fr.close();

	}


	private static void method1() {
		//예외처리
		//1) 내가한다.: try~catch~finally
		//2) 나를 호출한 곳으로 떠넘긴다.: throws
		FileReader fr = null;
		try {
			fr= new FileReader("src/com/kosta/day09/Button.java");
			System.out.println("파일열기 성공");
			int i;
			
			while((i= fr.read())!=-1){
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않는다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fr!=null) fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
