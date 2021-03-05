package com.kosta.day06.lab;
import java.util.Scanner;
/**
 * 
 * @author KOSTA
 * controller: 사용자의 요청을 받아서 service에 전달한다.
 * service 결과륿 받아서 사용자에게 응답한다.
 */
public class AccountController {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean run= true;
		
		while(run) {
			System.out.println("============");
			System.out.println("1.계좌생성");
			System.out.println("2.계좌목록");
			System.out.println("3.계좌예금");
			System.out.println("4.계좌출금");
			System.out.println("5.종료");
			System.out.println("============");
			System.out.println("작업선택>>");
			
			int key= sc.nextInt();
			
			switch(key) {
			case 1:
				AccountView.print("계좌번호 예금주 잔고입력>>");
				AccountService.createAccount(sc.next(),sc.next(),sc.nextInt());
				break;
			case 2:
				AccountView.print(AccountService.accountList);
				break;
			case 3:{
				System.out.println("입금할 계좌번호와 금액>>");
				int idx= sc.nextInt();
				int amount= sc.nextInt();
				AccountService.deposit(idx,amount);
				break;
			}
			case 4:
				System.out.println("출금할 계좌번호와 금액>>");
				int idx= sc.nextInt();
				int amount= sc.nextInt();
				AccountService.withdraw(idx,amount);
				break;
			case 5:
				AccountView.print("작업 종료되었습니다.");
				run= false; break;
				
			default:
				break;
			}
			
		}
		
		sc.close();
	}

}
