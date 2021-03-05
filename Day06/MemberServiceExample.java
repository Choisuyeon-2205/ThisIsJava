package com.kosta.day06;

//Application, app
public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService service= new MemberService();
		Member member = new Member(null,"hong","12345",0);
		member= service.login(member);
		if(member!=null) {
			System.out.println("로그인에 성공");
			System.out.println(member.toString());
			System.out.println("로직수행...");
			service.logout(member.getName());
		}else {
			System.out.println("로그인에 실패");
		}
	}

}
