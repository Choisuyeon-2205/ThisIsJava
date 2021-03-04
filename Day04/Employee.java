package com.kosta.day04;

/*
 * modifier(����������)
 * 1)public: ��� ��Ű������ ���ٰ���
 * 2)protected
 * 3)����(default): ���� ��Ű�������� ���� ����
 * 4)private
 */

public class Employee {
	//1. Field(member����): ��ü���� ������ ������ ����
	int empNo;
	String empName;
	String dept;
	String phone;
	//2. Constructor(������ �޼���)
	//1) �⺻ ������(default������): ������, �ٸ������� �߰��� ������
	public Employee(){
		this(0,null);
	}
	//2)������ �߰�(overloading)
	public Employee(int empNo, String empName){
		this(empNo,empName,null,null);
	}
	
	 public Employee(int empNo, String empName, String dept) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
	}
	 public Employee(int empNo, String empName, String dept, String phone) {
		
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.phone = phone;
	}
	 
	public void print() {
		 System.out.println("------��������------");
		 System.out.println("������ȣ: "+empNo);
		 System.out.println("�̸�: "+empName);
		 System.out.println("�μ�: "+dept);
		 System.out.println("��ȭ: "+phone);
	 }
	 
	public  String getEmpInfo() {
		 String s="��������ȣ: "+ empNo+
				 "\n���̸�: "+empName+
				 "\n�ںμ�: "+dept+
				 "\n����ȭ: "+phone;
		 return s;
	 }
	 
	public void changePhone(String phone) {
		 this.phone= phone;
		 System.out.println("��ȭ��ȣ�� ����Ǿ����ϴ�.");
	 }
	 
	public String changePhone2(String phone) {
		 String originalNumber= this.phone;
		 this.phone= phone;
		 System.out.println("��ȭ��ȣ�� ����ǰ� ������ȣ�� return");
		 return "originalNumber: "+originalNumber;
	 }
	
	

}
