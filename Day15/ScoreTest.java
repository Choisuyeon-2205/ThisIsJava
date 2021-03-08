package com.kosta.day15;

import java.io.*;
import java.util.Arrays;

public class ScoreTest {
	
	public void printScore(String fileName) throws IOException {
		FileReader fr= null;
		BufferedReader br= null;
		fr= new FileReader(fileName);
		br= new BufferedReader(fr);
		String line= br.readLine();
		System.out.println(line.replace("/", "\t")+ "\tÃÑÁ¡");
		
		while((line= br.readLine())!=null) {	
			String[] arr= line.split("/");
			int sum = 0;
			//System.out.print(arr[0]+"\t");
			System.out.print(line.replace("/", "\t"));
			
			sum= Arrays.stream(arr)
			.filter(a-> a.length()<3||a.equals("100"))
			.mapToInt(Integer::parseInt)
			.sum();
			
			
//			for(int i=1; i< arr.length; i++) {
//				sum+= Integer.parseInt(arr[i]);
//				//System.out.print(arr[i]+"\t");
//			}
			System.out.println("\t"+sum);
		}
		
		br.close();
		fr.close();
	}

	public static void main(String[] args) throws IOException {
		String fname="src/com/kosta/day15/data.txt";
		new ScoreTest().printScore(fname);
		

	}

}
