//package com.kosta.day09.lab1;
//
//import java.util.Arrays;
//
//public class Car implements Cloneable{
//	String model;
//	int price;
//	String[] �Ǽ��縮;
//
//	public Car(String model, int price) {
//		super();
//		this.model= model;
//		this.price= price;
//	}
//
//	public Car(String model, int price, String[] �Ǽ��縮) {
//		super();
//		this.model = model;
//		this.price = price;
//		this.�Ǽ��縮 = �Ǽ��縮;
//	}
//
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		Car car= (Car)super.clone();
//		car.�Ǽ��縮= Arrays.copyOf(this.�Ǽ��縮, this.�Ǽ��縮.length);
//		
//		return car;
//	}
//
//
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Car [model=").append(model).append(", price=").append(price).append(", �Ǽ��縮=")
//				.append(Arrays.toString(�Ǽ��縮)).append("]");
//		return builder.toString();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		//Car-> Object-> Car
//		if(!(obj instanceof Car)) return false;
//		
//		Car cc= (Car)obj;
//
//		return model.equals(cc.model) && price==cc.price;
//	}
//
//	@Override
//	public int hashCode() {
//		
//		return model.hashCode();
//	}
//	
//	
//	
//}
