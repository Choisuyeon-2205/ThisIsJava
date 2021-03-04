package com.kosta.day03;

public class SwitchProblem {

	public static void main(String[] args) {
		
		printSeason(Integer.parseInt(args[0]));
		printSeason2(args[0]);
		

	}

	private static void printSeason2(String month) {
		String[] message={"�߸�","�ܿ�","����","��","��","��","����","����","����","����","����","����","�ܿ�"};
		int mon= Integer.parseInt(month);
		
		if(mon>=message.length)
			System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
		else
			System.out.println(message[mon]+"�� �¾�̳׿�.");
			
	}

	private static void printSeason(int month) {
		String message = null;
		
		switch(month) {
		case 3:
		case 4:
		case 5: message="��";
				break;
			
		case 6:
		case 7:
		case 8:	message="����";
				break;
			
		case 9:
		case 10:
		case 11:message="����";
				break;
			
		case 12:
		case 1:
		case 2:message="�ܿ�";
				break;
				
		default:
			System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
			break;
		
		}
		System.out.println(message+"�� �¾�̳׿�.");
	}

}
