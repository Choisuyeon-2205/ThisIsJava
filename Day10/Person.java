package com.kosta.day10;

import java.util.Arrays;

public class Person implements Cloneable {
	String name;
	int age;
	Car car;
	String[] phone;
	
	public Person(String name, int age, Car car, String[] phone) {
		this.name = name;
		this.age = age;
		this.car = car;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String[] getPhone() {
		return phone;
	}
	public void setPhone(String[] phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append(", age=").append(age).append(", car=").append(car)
				.append(", phone=").append(Arrays.toString(phone)).append("]");
		return builder.toString();
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//구현추가 안해도 얕은 복제 가능
		//깊은 복제... car,phone 
		Person p= (Person)super.clone();
		p.car= new Car(car.getModel(),car.getPrice());
		p.phone= Arrays.copyOf(phone, phone.length);
		
		return p;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
//		result = prime * result + ((car == null) ? 0 : car.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + Arrays.hashCode(phone);
		return result;
	}
	
	
	
	

}
