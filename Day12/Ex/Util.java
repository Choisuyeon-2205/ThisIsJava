package com.kosta.day12.Ex;

public class Util {
	public static <K,V> Integer getValue (Pair<K,V> p1, K s){
		if(p1.getKey().equals(s)) 
			return  (Integer)p1.getValue();
		return null;
	}

}
