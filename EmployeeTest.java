package com.kosta.day05;
import com.kosta.day04.Employee;

public class EmployeeTest {
	 public static void main(String[] args) {
		 Employee emp1= new Employee();
		 Employee emp2= new Employee(2,"ȫ�浿");
		 Employee emp3= new Employee(3,"��浿","���ߺ�");
		 Employee emp4= new Employee(4,"�ڱ浿","������","010-8888-9999");
		 
		 emp1.changePhone("010-2222-3333");
		 emp1.print();
		 
		 //�������� ���� �����ϴ� ���� ���ؾ��� => �޼��� ����ϱ�!!
		 emp2.changePhone("010-5555-6666");
		 emp2.print();
		 
		 System.out.println(emp3.getEmpInfo());
		 System.out.println(emp4.getEmpInfo());
		 
		 String aa= emp4.changePhone2("000-0000-0000");
		 System.out.println("���� ���� "+aa);
		 
	 }
}
