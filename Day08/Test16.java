package com.kosta.day08;

class Outer{
	private Inner y;
	public void setY(Inner y) {this.y=y;}
	public Inner getY() {return y;}
	
	class Inner{
		private int x;
		public void setX(int x) {this.x=x;}
		public int getX() {return x;}
	}
}
public class Test16 {

	public static void main(String[] args) {
		Outer o= new Outer();
		Outer.Inner i= o.new Inner();
		int n=10;
		i.setX(n);
		o.setY(i);
		o.getY().setX(100);
		System.out.println(o.getY().getX());

	}

}
