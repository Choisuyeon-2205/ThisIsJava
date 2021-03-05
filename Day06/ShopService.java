package com.kosta.day06;

//싱글톤..... 한번만 생성하겠다. (일반적으로는 잘 쓰지않음(서버만들 때 사용))
//JSP/Servlet: 서버에서 실행되는 자바 프로그램
//Servlet - 싱글톤으로 사용된다.
public class ShopService {
	
	static ShopService shopService= new ShopService();
	public static ShopService getInstance() {
//		if(shopService == null)
//			shopService= new ShopService();
		return shopService;
	}

}
