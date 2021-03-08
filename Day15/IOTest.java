package com.kosta.day15;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) throws IOException{
		method10();

	}

	private static void method10() {
		FileReader fr= null;
		FileWriter fw= null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		String fname= "src/com/kosta/day15/Review.java";
		String fname2= "Review_backup.txt";
		String s= null;
		
		try {
			fr= new FileReader(fname);
			br= new BufferedReader(fr);
			
			fw= new FileWriter(fname2);
			bw= new BufferedWriter(fw);
			
			while((s= br.readLine())!= null) {
				System.out.println(s); //����Ϳ� ���
				bw.write(s+"\n"); //���Ͽ� ���
			
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fr!=null)
				try {
					fr.close();
					br.close();
					bw.close();
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

	}

	private static void method9() throws IOException {
		// File ���� ���
		String name= "src/com/kosta/day15/Student.java";
		File f= new File(name);
		System.out.println(f.exists());
		System.out.println(f.length());
		System.out.println(f.getAbsolutePath());
		System.out.println(new Date(f.lastModified()));
		
		//���丮 �����(����)
		String fname= "src/aa";
		File f2= new File(fname);
		boolean b= f2.mkdir();
		System.out.println(b);
		
		fname= "src/aa/test.txt";
		f2= new File(fname);
		b= f2.createNewFile();
		System.out.println(b);
	}

	private static void method8() {
		Scanner sc= new Scanner(System.in);
		System.out.println("���� �Է�>>"+sc.next());
		System.out.println("���� �Է�>>"+sc.nextInt());
		System.out.println("double �Է�>>"+sc.nextDouble());
		
		sc.nextLine();
		
		System.out.print("���� ��� �б�>> ");
		String s= sc.nextLine();
		System.out.println("�Է� ���� "+s);
		
		sc.close();
		
	}

	private static void method7() throws IOException {
		System.setIn(new FileInputStream("src/com/kosta/day15/Student.java"));
		
		InputStream is= System.in; //ǥ���Է�(�⺻:Ű����)
		int i;
		while((i= is.read())!=-1){
			System.out.print((char)i);
		}
	}

	private static void method6() throws FileNotFoundException {
		System.setOut(new PrintStream("output.txt"));
		PrintStream out= System.out; //ǥ�� ���
		//PrintStream out= System.err;
		out.print("�ڹ�");
		
	}

	private static void method5() {
		InputStream is= System.in;
		InputStreamReader ir= new InputStreamReader(is);
		try {
			int i;
			while((i= ir.read())!=-1){
			System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	private static void method4() {
		FileReader fr= null;
		FileWriter fw= null;
		int data;
		
		String fname= "src/com/kosta/day15/Review.java";
		String fname2= "Review_backup.txt";
		try {
			fr= new FileReader(fname);
			fw= new FileWriter(fname2);
			
			while((data= fr.read())!=-1) {
				System.out.print((char)data); //����Ϳ� ���
				fw.write((char)data); //���Ͽ� ���
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}
	
	private static void method3() {
		FileReader fr= null;
		int data;
		String fname= "src/com/kosta/day15/Review.java";
		try {
			fr= new FileReader(fname);
			while((data= fr.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

	private static void method2()  {
		FileInputStream fi = null;
		InputStreamReader ir = null;

		try {
			fi = new FileInputStream("src/com/kosta/day15/Review.java");
			ir= new InputStreamReader(fi); //1byte-> 2byte ����
			
			int data;
			while((data= ir.read())!=-1) { //ascii code�� �д´�.
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("IO Exception�� �߻�");
		} finally {
			try {
				if(ir != null) fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	

	private static void method1()  {
		FileInputStream fi = null;

		try {
			fi = new FileInputStream("src/com/kosta/day15/Review.java");
			int data;
			while((data= fi.read())!=-1) { //ascii code�� �д´�.
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("IO Exception�� �߻�");
		} finally {
			try {
				if(fi != null) fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
