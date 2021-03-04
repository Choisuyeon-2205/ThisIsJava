package com.kosta.day13.model;

import java.util.*;

//����ڿ�û-> Controller-> Service(��������) -> DAO(Data Access Object)-> DB
//  ����               <-                <-                        <- 
//DAO(Data Access Object): ���� �����߿� DB�� �����ϴ� ������ �ۼ��Ѵ�.

public class CustomerDAO {
	List<CustomerDTO> custlist= new ArrayList<CustomerDTO>();
	
	public CustomerDAO() {
		custlist.add(new CustomerDTO(1,"�ӻ���","010-1234-5678","����"));
		custlist.add(new CustomerDTO(2,"����","010-5555-5678","���"));
		custlist.add(new CustomerDTO(3,"������","010-6666-5678","����"));
		custlist.add(new CustomerDTO(4,"���ؿ�","010-7777-5678","���"));
		custlist.add(new CustomerDTO(5,"������","010-8888-5678","����"));
	}

	public List<CustomerDTO> selectAll() {
		//��� ���� ��ȸ�Ѵ�.

		return custlist;
	}

	public CustomerDTO selectById(int custId) {
		//���̵�� �� ������ ��ȸ�Ѵ�
		for(CustomerDTO cust :custlist) {
			if(cust.getCustId()==custId) return cust; //ã����
		}
		return null; //��ã����
	}

	public CustomerDTO selectByPhone(String phone) {
		//�ڵ��� ��ȣ�� �� ������ ��ȸ�Ѵ�.
		for(CustomerDTO cust :custlist) {
			if(cust.getPhone().equals(phone)) return cust; //ã����
		}
		return null; //��ã����
	}

	public int insert(CustomerDTO cust) {
		//�� ������ �Է��Ѵ�.(ȸ������)
		boolean value= false;
		
		for(CustomerDTO c : custlist) {
			if(c.getCustId()==cust.getCustId())
				value=true;
		}
		
		if(value) {
			return 0;
		}else {
			custlist.add(cust);
			return 1;
		}
	}

	public int update(CustomerDTO cust) {
		//�� ������ �����Ѵ�.
							for(CustomerDTO c :custlist) {
								if(c.getCustId()==cust.getCustId()) {
									c.setAddress(cust.getAddress());
									c.setCustName(cust.getCustName());
									c.setPhone(cust.getPhone());
								}
							}

//		for(int i=0; i<custlist.size(); i++) {
//			CustomerDTO cc= custlist.get(i);
//			if(cc.getCustId()==cust.getCustId()) {
//				cc.setAddress(cust.getAddress());
//				cc.setCustName(cust.getCustName());
//				cc.setPhone(cust.getPhone());
//			}
//		}
		return 1;
	}

	public int delete(int custId) {
		//�������� �����Ѵ�.

//		for(CustomerDTO c :custlist) {
//			if(c.getCustId()==custId) {
//				custlist.remove(c);
//			}
//		}

				for(int i=0; i<custlist.size(); i++) {
					if(custlist.get(i).getCustId()==custId) {
						custlist.remove(i);
						break;
			}
		}

		return 1;
	}
}
