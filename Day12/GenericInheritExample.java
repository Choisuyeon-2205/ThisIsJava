package com.kosta.day12;

public class GenericInheritExample {

	public static void main(String[] args) {
		ChildProduct<TV, String, String> p =
				new ChildProduct<>(new TV(), "ABC100", 2000, "»ï¼º");
		System.out.println(p.getCompany());
		System.out.println(p.toString());

		System.out.println("--------------------------");
		StorageImp1<String, Integer> st= new StorageImp1<>(3,1000);
		st.add("Hello1", 0);
		st.add("Hello2", 1);
		st.add("Hello3", 2);
		
		System.out.println(st.price);
		System.out.println(st.get(1));
		System.out.println(st.get(2));
		System.out.println(st.get(0));
	}

}
