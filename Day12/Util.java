//package com.kosta.day12;
//
////object <-- Number <-- Integer, Double... 
//public class Util {
//	
//	public static <T extends Machine> int compare2(T a, T b) {
//		int result= a.compareTo(b);
//		
//		return result;
//	}
//	
//	
//	//타입에 제한을 건다.
//	
//	public static <T extends Number> int compare(T a, T b) {
//		double su1= a.doubleValue();
//		double su2= b.doubleValue();
//		int result= Double.compare(su1, su2); 
//		//su1- su2
//		//<(-1) = >(1)
//		
//		return result; //두개의 차이값을 return
//	}
//	
//	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
//		boolean result= p1.getKey().equals(p2.getKey()) &&
//				p1.getVal().equals(p2.getVal());
//		
//		return result;
//	}
//	
//	
//	public static <T> Box<T> boxing(T t) {
//		Box<T> b= new Box<>();
//		b.setObj(t);
//		
//		return b;
//	}
//
//
//}
