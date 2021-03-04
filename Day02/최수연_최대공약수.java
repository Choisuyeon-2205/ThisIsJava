package com.kosta.day02;
import java.util.*;

//최대 공약수는 두 숫자를 공통된 숫자로 나누어도 나머지가  0이 되는 가장 큰 수를의미합니다. 
//예를 들어 2와 5의 최대 공약수는 1입니다. 왜냐하면, 1부터 2까지의 숫자중공통으로 나눌 수 있는 숫자는 1 뿐이기 때문입니다. 
//다른 예로, 5와 15의 최대 공약수는5가 됩니다. 메소드의 이름은 gcd로 하며, 매개변수는 두개의 정수를 받으며, 리턴 하는타입 역시 정수입니다.
//[입력값]2, 55,15250,30
//[실행결과]1510

public class 최수연_최대공약수 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("두 수를 입력하세요 :");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		System.out.println(gcd(num1,num2));
		sc.close();

	}

	private static int gcd(int num1, int num2) {
		// 최대공약수 구하기
		int small, big, gcd = 0;
		
		if(num1==num2) {
			return num1;
		}else if(num1>num2) {
			big=num1;
			small=num2;
		}else {
			big=num2;
			small=num1;
		}
		
		for(int i=small; i>0; i--) {
			if(big%i==0 && small%i==0) {
				gcd=i;
				break;
			}
		}
		
		return gcd;
	}

}
