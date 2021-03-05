package com.kosta.day09;

public class ButtonExample {
	
	public static void method(Button b, Button.OnClickListener listener) {
		b.setListener(listener);
		b.touch();
	}
	
	
	public static void main(String[] args) {

		Button b= new Button();
		method(b, new MessageListener());		
		method(b, new CallListener());
		method(b, new Button.OnClickListener() {
			//익명클래스
			@Override
			public void onClick() {
				System.out.println("익명");
				
			}
		});
	}

}
