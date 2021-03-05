package com.kosta.day06.lab;
/*
 * @author KOSTA
 * Account���� display�Ѵ�.
 */

//DTO(Data Transfer Object)

public class AccountDTO {
	private String ano;
	private String owner;
	private int balance;
	
	public AccountDTO(String ano, String owner, int balance) {
		this.ano= ano;
		this.owner= owner;
		this.balance= balance;
	}

	//@override: �����Ϸ����� ����
	//�����ǰ� �´���?
	
	@Override
	public String toString() {
		return "AccountDTO [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
