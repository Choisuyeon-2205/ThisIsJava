package com.kosta.day13.view;

import java.util.*;
import com.kosta.day13.model.*;

//�� ���� �����ֱ�
//���߿��� ������ ��ȯ... HTML, CSS, ...
public class CustomerView {
	
	public static void display(List<CustomerDTO> custlist) {
		System.out.println("****������ ������****");
		for(CustomerDTO cust: custlist) {
			System.out.println(cust);
		}
	}
	
	public static void display(CustomerDTO cust) {
		System.out.println("****������ 1��****");
		System.out.println(cust);
	
	}
	
	public static void display(String message) {
		System.out.println(message);
	}
	
	
}
