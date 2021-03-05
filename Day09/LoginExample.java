package com.kosta.day09;

import java.util.Scanner;

public class LoginExample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ID�Է�>>");
		String id= sc.next();
		System.out.println("PASS�Է�>>");
		String pass= sc.next();
		try {
			login(id,pass);
		} catch (NonExistsIDException | WrongPasswordException e) {
			System.out.println(e.getMessage());
			sc.close();
			return ;
		}
		System.out.println("�α��� ����~~");
	}

	private static void login(String id, String pass) throws NonExistsIDException, WrongPasswordException {
		if(!id.equals("blue")) {
			throw new NonExistsIDException("������������ ID");
		}
		if(!pass.equals("12345"))
		{
			throw new WrongPasswordException("pass����");
		}
		System.out.println("ID pass ����");
	}
	
}
