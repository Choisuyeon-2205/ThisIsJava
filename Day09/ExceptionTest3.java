package com.kosta.day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest3 {

	public static void main(String[] args) throws IOException {
		method2();

	}
	
	private static void method2() throws IOException {
		//����ó��
		//1) �����Ѵ�.: try~catch~finally
		//2) ���ѱ��.: throws
		FileReader fr = null;

		fr= new FileReader("src/com/kosta/day09/Button.java");
		System.out.println("���Ͽ��� ����");
		int i;

		while((i= fr.read())!=-1){
			System.out.print((char)i);
		}
		System.out.println("try~catch END");

		fr.close();

	}


	private static void method1() {
		//����ó��
		//1) �����Ѵ�.: try~catch~finally
		//2) ���� ȣ���� ������ ���ѱ��.: throws
		FileReader fr = null;
		try {
			fr= new FileReader("src/com/kosta/day09/Button.java");
			System.out.println("���Ͽ��� ����");
			int i;
			
			while((i= fr.read())!=-1){
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʴ´�.");
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
