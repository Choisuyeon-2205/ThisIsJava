package com.kosta.day12;

public class StorageImp1<T,A> implements Storage<T>{
	A price;
	private T[] array;
	
	@SuppressWarnings("unchecked")
	public StorageImp1(int capacity, A price) {
		this.array= (T[]) new Object[capacity];
		this.price= price;
	}

	@Override
	public void add(T item, int index) {
		array[index]= item;
		
	}

	@Override
	public T get(int index) {
		
		return array[index];
	}
	
	


}
