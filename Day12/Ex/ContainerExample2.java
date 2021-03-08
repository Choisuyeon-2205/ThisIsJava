package com.kosta.day12.Ex;

public class ContainerExample2 {

	public static void main(String[] args) {
		Containers<String, String> container1= new Containers<String, String>();
		container1.set("È«±æµ¿","µµÀû");
		String name1= container1.getKey();
		String job= container1.getValue();
		
		Containers<String, Integer> container2= new Containers<String, Integer>();
		container2.set("È«±æµ¿",35);
		String name2= container2.getKey();
		int age= container2.getValue();
		
		System.out.println(name1+job);
		System.out.println(name2+age);

	}

}
