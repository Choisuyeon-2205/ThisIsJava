package com.kosta.day06;

//Application, app
public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService service= new MemberService();
		Member member = new Member(null,"hong","12345",0);
		member= service.login(member);
		if(member!=null) {
			System.out.println("�α��ο� ����");
			System.out.println(member.toString());
			System.out.println("��������...");
			service.logout(member.getName());
		}else {
			System.out.println("�α��ο� ����");
		}
	}

}
