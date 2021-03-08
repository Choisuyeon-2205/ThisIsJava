package com.kosta.day15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class FileCompareUtil {

	ArrayList compareFile(String fstFileName, String scdFileName) throws Exception{
		FileReader fr= null;
		FileReader fr2= null;

		String data, data2;

		fr= new FileReader(fstFileName);
		BufferedReader br= new BufferedReader(fr);
		fr2= new FileReader(scdFileName);
		BufferedReader br2= new BufferedReader(fr2);

		String line, line2 = null;
		int i= 1;
		ArrayList<String> alist = new ArrayList<String>();

		while(((line= br.readLine())!=null)) {
			line2= br2.readLine();
			if(!line.equals(line2)) {
				alist.add("Line"+i+": "+line2);
			}
			i++;
		}
		br.close();
		br2.close();
		fr.close();
		fr2.close();

		return alist;
	}

	public static void main(String[] args) throws Exception {
		String f1= "src/com/kosta/day15/first.txt";
		String f2= "src/com/kosta/day15/second.txt";
		
		ArrayList<String> alist= new FileCompareUtil().compareFile(f1, f2);
		Stream<String> stream= alist.stream();
		stream.forEach(System.out::println);
	}

}
