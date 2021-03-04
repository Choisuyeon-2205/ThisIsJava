package com.kosta.day13.controller;

import java.util.*;

import com.kosta.day13.model.*;
import com.kosta.day13.view.CustomerView;

//���� ���α׷����� �ۼ��� ����(servlet, controller)
public class CustomerController {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<CustomerDTO> custlist= null;
		CustomerDTO cust= null;
		int result=0;
		CustomerService service= new CustomerService();
		
		while(true) {
			System.out.println("==================");
			System.out.println("1. ��� ��ȸ");
			System.out.println("2. Ư�� ����ȸ(id)");
			System.out.println("3. Ư�� ����ȸ(phone)");
			System.out.println("4. �Է�");
			System.out.println("5. ����");
			System.out.println("6. ����");
			System.out.println("0. ���α׷� ����");
			System.out.println("==================");
			System.out.print("�۾��� �����ϼ���>> ");
			
			int select= sc.nextInt();
			if(select==0) break;
			switch(select) {
			case 1: 
				custlist= service.selectAll();
				CustomerView.display(custlist);
				break;
			case 2:
				System.out.println("��ȸ�� ID�Է�>>");
				int custId= sc.nextInt();
				cust= service.selectById(custId);
				CustomerView.display(cust);
				break;
			case 3:
				System.out.println("��ȸ�� PHONE�Է�>>");
				String p= sc.next();
				cust= service.selectByPhone(p);
				CustomerView.display(cust);
				break;
			case 4:
				System.out.println("�ű��Է�(1 AA 1234 Seoul)>>");
				cust= new CustomerDTO(sc.nextInt(), sc.next(), sc.next(),sc.next());
				
				result = service.insert(cust);
				CustomerView.display(result==1?"�Է¼���":"�Է½���");
				break;
			case 5:
				System.out.println("��������(1 AA 1234 Seoul)>>");
				cust= new CustomerDTO(sc.nextInt(), sc.next(), sc.next(),sc.next());
				
				result = service.update(cust);
				CustomerView.display(result==1?"��������":"��������");
				break;
			case 6:
				System.out.println("������ ID �Է�>>");
				result= service.delete(sc.nextInt());
				CustomerView.display(result==1?"��������":"��������");
				break;
			}
			
		}
		System.out.println("-----���α׷� ����------");
		sc.close();
	}

}
