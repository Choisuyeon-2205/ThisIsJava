package com.kosta.day13.view;

import java.util.*;
import com.kosta.day13.model.*;

//고객 정보 보여주기
//나중에는 웹으로 전환... HTML, CSS, ...
public class CustomerView {
	
	public static void display(List<CustomerDTO> custlist) {
		System.out.println("****고객정보 여러건****");
		for(CustomerDTO cust: custlist) {
			System.out.println(cust);
		}
	}
	
	public static void display(CustomerDTO cust) {
		System.out.println("****고객정보 1건****");
		System.out.println(cust);
	
	}
	
	public static void display(String message) {
		System.out.println(message);
	}
	
	
}
