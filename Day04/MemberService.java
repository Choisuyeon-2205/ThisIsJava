package com.kosta.day04;

public class MemberService {
	String id="hong";
	String password="12345";
	
	boolean login(String id, String password) {
		if((id==this.id)&&(password==this.password))
			return true;
		return false;
	}
	
	void logout(String id) {
		System.out.println(id+"´Ô ·Î±×¾Æ¿ô µÇ¾ú½À´Ï´Ù.");
	}
	

}
