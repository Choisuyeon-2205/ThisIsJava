package com.kosta.day06.lab;
import java.util.Scanner;
/**
 * 
 * @author KOSTA
 * controller: ������� ��û�� �޾Ƽ� service�� �����Ѵ�.
 * service ����b �޾Ƽ� ����ڿ��� �����Ѵ�.
 */
public class AccountController {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean run= true;
		
		while(run) {
			System.out.println("============");
			System.out.println("1.���»���");
			System.out.println("2.���¸��");
			System.out.println("3.���¿���");
			System.out.println("4.�������");
			System.out.println("5.����");
			System.out.println("============");
			System.out.println("�۾�����>>");
			
			int key= sc.nextInt();
			
			switch(key) {
			case 1:
				AccountView.print("���¹�ȣ ������ �ܰ��Է�>>");
				AccountService.createAccount(sc.next(),sc.next(),sc.nextInt());
				break;
			case 2:
				AccountView.print(AccountService.accountList);
				break;
			case 3:{
				System.out.println("�Ա��� ���¹�ȣ�� �ݾ�>>");
				int idx= sc.nextInt();
				int amount= sc.nextInt();
				AccountService.deposit(idx,amount);
				break;
			}
			case 4:
				System.out.println("����� ���¹�ȣ�� �ݾ�>>");
				int idx= sc.nextInt();
				int amount= sc.nextInt();
				AccountService.withdraw(idx,amount);
				break;
			case 5:
				AccountView.print("�۾� ����Ǿ����ϴ�.");
				run= false; break;
				
			default:
				break;
			}
			
		}
		
		sc.close();
	}

}
