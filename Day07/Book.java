package com.kosta.day07;

public abstract class Book {
	private String title;
	private int price;
	
//	public Book() {
//		
//	}

	//������ ����Ѵ�.
	public abstract void printList();
	//������ Ǯ���Ѵ�.
	public abstract void answerExample();
	
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
		builder.append("Book [title=").append(title).append(", price=").append(price).append("]");
		return builder.toString();
	}
	
	
	
	

}
