package com.kosta.day08.lab3;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle rectangle= new Rectangle(5,6);
		RectTriangle rectTriangle= new RectTriangle(6,2);
		
		ArrayList<Shape> arr= new ArrayList<Shape>();
		arr.add(rectangle);
		arr.add(rectTriangle);
		
		for(Shape s: arr) {
			System.out.println("area: "+s.getArea());
			System.out.println("perimeter: "+s.getPerimeter());
			
			if(s instanceof Resizable) {
				((Rectangle) s).resize(0.5);
				System.out.println("(re) ractangle area: "+s.getArea());
				System.out.println("(re) ractangle perimeter: "+s.getPerimeter());
			}
		}

	}

}
