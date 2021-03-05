package com.kosta.day09;

import java.util.Scanner;

public class LoginExample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ID입력>>");
		String id= sc.next();
		System.out.println("PASS입력>>");
		String pass= sc.next();
		try {
			login(id,pass);
		} catch (NonExistsIDException | WrongPasswordException e) {
			System.out.println(e.getMessage());
			sc.close();
			return ;
		}
		System.out.println("로그인 성공~~");
	}

	private static void login(String id, String pass) throws NonExistsIDException, WrongPasswordException {
		if(!id.equals("blue")) {
			throw new NonExistsIDException("존재하지않은 ID");
		}
		if(!pass.equals("12345"))
		{
			throw new WrongPasswordException("pass오류");
		}
		System.out.println("ID pass 정상");
	}
	
}
