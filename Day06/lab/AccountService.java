package com.kosta.day06.lab;

//Account Service(���� ����Ͻ� ����)
public class AccountService {
	
	//�迭 ����
	static final int MAX_LENGTH=10;
	static AccountDTO[] accountList= new AccountDTO[MAX_LENGTH];
	static int count=0;
	
	//���� ����
	public static void createAccount(String ano, String owner, int balance) {
		if(count >= MAX_LENGTH) {
			AccountView.print("�� �̻� ���� ���� �Ұ�");
			return;
		}
		accountList[count]= new AccountDTO(ano,owner,balance);
		count++;
	}
	
	//���� ���
	public void accountList() {
		AccountView.print(accountList);
	}
	
	//����
	public static void deposit(int index, int amount) {
		if(accountList[index]==null) {
			AccountView.print("�������� �ʴ� �����̴�. �Ա� �Ұ�");
			return; //�Լ� ����������
		}
		accountList[index].setBalance(accountList[index].getBalance()+amount);
	}
	
	//���
	public static int withdraw(int index, int amount) {
		if(accountList[index]==null) {
			AccountView.print("�������� �ʴ� �����̴�. ��� �Ұ�");
			return 0;
		}
		
		int a= accountList[index].getBalance()-amount;
		
		if(a<0) {
			AccountView.print("�ܰ���� ��ݺҰ�");
			return 0;
		}
		accountList[index].setBalance(a);
		return amount;
	}
	
	//���� ã��
	AccountDTO findAccount(String ano) {
		for(AccountDTO acc:accountList) {
			if(acc.getAno().equals(ano)) {
				return acc;
			}
		}
		return null;
	}
	
}
