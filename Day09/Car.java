//package com.kosta.day09.lab1;
//
//import java.util.Arrays;
//
//public class Car implements Cloneable{
//	String model;
//	int price;
//	String[] 厩技荤府;
//
//	public Car(String model, int price) {
//		super();
//		this.model= model;
//		this.price= price;
//	}
//
//	public Car(String model, int price, String[] 厩技荤府) {
//		super();
//		this.model = model;
//		this.price = price;
//		this.厩技荤府 = 厩技荤府;
//	}
//
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		Car car= (Car)super.clone();
//		car.厩技荤府= Arrays.copyOf(this.厩技荤府, this.厩技荤府.length);
//		
//		return car;
//	}
//
//
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Car [model=").append(model).append(", price=").append(price).append(", 厩技荤府=")
//				.append(Arrays.toString(厩技荤府)).append("]");
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
