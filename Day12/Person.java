package com.kosta.day12;

//Person <-- Student <-- HighStudent
         //<-- Worker

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append("]");
		return builder.toString();
	}
	
	
	
}
