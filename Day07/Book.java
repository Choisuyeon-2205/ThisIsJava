package com.kosta.day07;

public abstract class Book {
	private String title;
	private int price;
	
//	public Book() {
//		
//	}

	//목차를 출력한다.
	public abstract void printList();
	//예제를 풀이한다.
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
