package com.kosta.day06;

//Service: business logic(���� ����)
public class MemberService {
	
	public Member login(Member member){
		if(member.getId().equals("hong") && member.getPassword().equals("12345")) {
			member.setName("ȫ�浿");
			member.setAge(20);
		return member;   //�α��� ����, DB���� return
		}else {
		return null; //�α��� ����
		}
	}
	
	public void logout(String id) {
			System.out.println(id+"�� �α׾ƿ� �Ǿ����ϴ�.");
	}

}
