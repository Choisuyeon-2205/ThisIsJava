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
				System.out.println(s); //모니터에 출력
				bw.write(s+"\n"); //파일에 출력
			
				
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
		// File 정보 얻기
		String name= "src/com/kosta/day15/Student.java";
		File f= new File(name);
		System.out.println(f.exists());
		System.out.println(f.length());
		System.out.println(f.getAbsolutePath());
		System.out.println(new Date(f.lastModified()));
		
		//디렉토리 만들기(폴더)
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
		System.out.println("문자 입력>>"+sc.next());
		System.out.println("숫자 입력>>"+sc.nextInt());
		System.out.println("double 입력>>"+sc.nextDouble());
		
		sc.nextLine();
		
		System.out.print("한줄 모두 읽기>> ");
		String s= sc.nextLine();
		System.out.println("입력 값은 "+s);
		
		sc.close();
		
	}

	private static void method7() throws IOException {
		System.setIn(new FileInputStream("src/com/kosta/day15/Student.java"));
		
		InputStream is= System.in; //표준입력(기본:키보드)
		int i;
		while((i= is.read())!=-1){
			System.out.print((char)i);
		}
	}

	private static void method6() throws FileNotFoundException {
		System.setOut(new PrintStream("output.txt"));
		PrintStream out= System.out; //표준 출력
		//PrintStream out= System.err;
		out.print("자바");
		
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
				System.out.print((char)data); //모니터에 출력
				fw.write((char)data); //파일에 출력
				
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
			ir= new InputStreamReader(fi); //1byte-> 2byte 변경
			
			int data;
			while((data= ir.read())!=-1) { //ascii code로 읽는다.
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("IO Exception이 발생");
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
			while((data= fi.read())!=-1) { //ascii code로 읽는다.
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("IO Exception이 발생");
		} finally {
			try {
				if(fi != null) fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
