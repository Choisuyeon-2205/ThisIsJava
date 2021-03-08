package com.kosta.day12.Ex;

public class Containers<T,M>{
	private T key;
	private M value;
	
	public void set(T key, M value) {
		this.key = key;
		this.value = value;
	}
	
	public T getKey() {
		return key;
	}

	public M getValue() {
		return value;
	}
	
	
	
	

}
