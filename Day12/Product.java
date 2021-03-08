package com.kosta.day12;

//��ƼŸ�� �Ķ����
public class Product<T,M> {
	private T kind;
	private M model;
	private int price;
	
	public Product(T kind, M model, int price) {
		this.kind = kind;
		this.model = model;
		this.price = price;
	}
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [kind=").append(kind).append(", model=").append(model).append(", price=").append(price)
				.append("]");
		return builder.toString();
	}
	
	
}
