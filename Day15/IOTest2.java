package com.kosta.day15;

import java.io.*;
import java.util.stream.Stream;

public class IOTest2 {
	public static void main(String[] args) {
		method3();
	}

	private static void method3() {
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
			
		    Stream<String> lines= br.lines();
		    lines.forEach(System.out::println);
		    
		    lines= br.lines();
		    lines.forEach(aa-> {
					System.out.println(aa);
		    });
			
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

	private static void method2() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fos= new FileOutputStream("objecttype.data");
			oos= new ObjectOutputStream(fos);
			oos.writeObject(new Student("홍길동",100));
			oos.writeObject(new Student("김길동",200));
			oos.writeObject(new Student("박길동",300));
			oos.close();
			fos.close();
			
			fis= new FileInputStream("objecttype.data");
			ois = new ObjectInputStream(fis);
			
			Object s;
			while((s = ois.readObject())!=null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void method1() {
		// 자바 기본형 파일 저장: byte, short, char, int long, float, double, boolean
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fos= new FileOutputStream("basictype.txt");
			dos= new DataOutputStream(fos);
			dos.writeInt(100);
			dos.writeBoolean(10>20);
			dos.writeDouble(3.14);
			
			dos.close();
			fos.close();
			
			fis = new FileInputStream("basictype.txt");
			dis= new DataInputStream(fis);
			System.out.println(dis.readInt()+200);
			System.out.println(dis.readBoolean()?"참":"거짓");
			System.out.println(dis.readDouble()+100);
			
			dis.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
