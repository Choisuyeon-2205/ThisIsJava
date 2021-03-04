package com.kosta.day13.model;

import java.util.*;

//����ڿ�û-> Controller-> Service(��������) -> DAO(Data Access Object)-> DB
//  ����               <-                <-                        <-   
public class CustomerService {

	CustomerDAO dao= new CustomerDAO();

	public List<CustomerDTO> selectAll() {
		//��� ���� ��ȸ�Ѵ�.
		return dao.selectAll();
	}

	public CustomerDTO selectById(int custId) {
		//���̵�� �� ������ ��ȸ�Ѵ�
		return dao.selectById(custId);
	}

	public CustomerDTO selectByPhone(String phone) {
		//�ڵ��� ��ȣ�� �� ������ ��ȸ�Ѵ�.
		return dao.selectByPhone(phone);
	}

	public int insert(CustomerDTO cust) {
		//�� ������ �Է��Ѵ�.(ȸ������)
		return dao.insert(cust);
	}	

	public int update(CustomerDTO cust) {
		//�� ������ �����Ѵ�.
		return dao.update(cust);
	}

	public int delete(int custId) {
		//�������� �����Ѵ�.

		return dao.delete(custId);
	}
}

