package com.kosta.day06.lab;

//Account Service(실제 비즈니스 로직)
public class AccountService {
	
	//배열 생성
	static final int MAX_LENGTH=10;
	static AccountDTO[] accountList= new AccountDTO[MAX_LENGTH];
	static int count=0;
	
	//계좌 생성
	public static void createAccount(String ano, String owner, int balance) {
		if(count >= MAX_LENGTH) {
			AccountView.print("더 이상 계좌 생성 불가");
			return;
		}
		accountList[count]= new AccountDTO(ano,owner,balance);
		count++;
	}
	
	//계좌 목록
	public void accountList() {
		AccountView.print(accountList);
	}
	
	//예금
	public static void deposit(int index, int amount) {
		if(accountList[index]==null) {
			AccountView.print("존재하지 않는 계좌이다. 입금 불가");
			return; //함수 빠져나가기
		}
		accountList[index].setBalance(accountList[index].getBalance()+amount);
	}
	
	//출금
	public static int withdraw(int index, int amount) {
		if(accountList[index]==null) {
			AccountView.print("존재하지 않는 계좌이다. 출금 불가");
			return 0;
		}
		
		int a= accountList[index].getBalance()-amount;
		
		if(a<0) {
			AccountView.print("잔고부족 출금불가");
			return 0;
		}
		accountList[index].setBalance(a);
		return amount;
	}
	
	//계좌 찾기
	AccountDTO findAccount(String ano) {
		for(AccountDTO acc:accountList) {
			if(acc.getAno().equals(ano)) {
				return acc;
			}
		}
		return null;
	}
	
}
