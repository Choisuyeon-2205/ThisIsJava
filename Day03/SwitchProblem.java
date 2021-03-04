package com.kosta.day03;

public class SwitchProblem {

	public static void main(String[] args) {
		
		printSeason(Integer.parseInt(args[0]));
		printSeason2(args[0]);
		

	}

	private static void printSeason2(String month) {
		String[] message={"잘못","겨울","겨을","봄","봄","봄","여름","여름","여름","가을","가을","가을","겨울"};
		int mon= Integer.parseInt(month);
		
		if(mon>=message.length)
			System.out.println("1~12 사이의 숫자만 입력하셔야 합니다.");
		else
			System.out.println(message[mon]+"에 태어나셨네요.");
			
	}

	private static void printSeason(int month) {
		String message = null;
		
		switch(month) {
		case 3:
		case 4:
		case 5: message="봄";
				break;
			
		case 6:
		case 7:
		case 8:	message="여름";
				break;
			
		case 9:
		case 10:
		case 11:message="가을";
				break;
			
		case 12:
		case 1:
		case 2:message="겨울";
				break;
				
		default:
			System.out.println("1~12 사이의 숫자만 입력하셔야 합니다.");
			break;
		
		}
		System.out.println(message+"에 태어나셨네요.");
	}

}
