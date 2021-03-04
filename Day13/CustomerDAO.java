package com.kosta.day13.model;

import java.util.*;

//사용자요청-> Controller-> Service(업무로직) -> DAO(Data Access Object)-> DB
//  응답               <-                <-                        <- 
//DAO(Data Access Object): 업무 로직중에 DB에 가야하는 업무를 작성한다.

public class CustomerDAO {
	List<CustomerDTO> custlist= new ArrayList<CustomerDTO>();
	
	public CustomerDAO() {
		custlist.add(new CustomerDTO(1,"임상혁","010-1234-5678","서울"));
		custlist.add(new CustomerDTO(2,"고석우","010-5555-5678","울산"));
		custlist.add(new CustomerDTO(3,"김현유","010-6666-5678","광주"));
		custlist.add(new CustomerDTO(4,"장준영","010-7777-5678","경기"));
		custlist.add(new CustomerDTO(5,"김현빈","010-8888-5678","제주"));
	}

	public List<CustomerDTO> selectAll() {
		//모든 고객을 조회한다.

		return custlist;
	}

	public CustomerDTO selectById(int custId) {
		//아이디로 고객 정보를 조회한다
		for(CustomerDTO cust :custlist) {
			if(cust.getCustId()==custId) return cust; //찾을때
		}
		return null; //못찾을때
	}

	public CustomerDTO selectByPhone(String phone) {
		//핸드폰 번호로 고객 정보를 조회한다.
		for(CustomerDTO cust :custlist) {
			if(cust.getPhone().equals(phone)) return cust; //찾을때
		}
		return null; //못찾을때
	}

	public int insert(CustomerDTO cust) {
		//고객 정보를 입력한다.(회원가입)
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
		//고객 정보를 변경한다.
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
		//고객정보를 삭제한다.

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
