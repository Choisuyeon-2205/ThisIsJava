package com.kosta.day12;

public class Pair<K,V> {
	private K key;
	private V val;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getVal() {
		return val;
	}
	public void setVal(V val) {
		this.val = val;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pair [key=").append(key).append(", val=").append(val).append("]");
		return builder.toString();
	}
	
	
	
	
}
