package com.kosta.day06;

//�̱���..... �ѹ��� �����ϰڴ�. (�Ϲ������δ� �� ��������(�������� �� ���))
//JSP/Servlet: �������� ����Ǵ� �ڹ� ���α׷�
//Servlet - �̱������� ���ȴ�.
public class ShopService {
	
	static ShopService shopService= new ShopService();
	public static ShopService getInstance() {
//		if(shopService == null)
//			shopService= new ShopService();
		return shopService;
	}

}
