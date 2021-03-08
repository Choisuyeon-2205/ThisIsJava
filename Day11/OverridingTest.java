package com.kosta.day11;

public class OverridingTest {
    public static void main(String args[]){
        int i = 10;
        int j = 20;
        
        MySum ms1 = new MySum(i, j);
        MySum ms2 = new MySum(i, j);
        String s1= new String("30");

        System.out.println(ms1);
        System.out.println(ms2);

        if(ms1.equals(ms2))
            System.out.println("ms1�� ms2�� �հ�� �����մϴ�.");
        else
        	System.out.println("ms1�� ms2�� �հ�� �������� �ʽ��ϴ�.");
        
        if(ms1.equals(s1))
        	System.out.println("ms1�� s1�� �հ�� �����մϴ�.");
        else
        	System.out.println("ms1�� s1�� ���� �������� �ʽ��ϴ�.");
        	
    }
}

class MySum {
    int first;
    int second;
    
    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }

	@Override
	public String toString() {
		return String.valueOf(first+second);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MySum other = (MySum) obj;
		if (first != other.first)
			return false;
		if (second != other.second)
			return false;
		return true;
		
		//���� �ڵ��ϱ�
		//if(obj==null||!(obj instanceof MySum)) return false;
		//MySum my= (MySum)obj;
		
		//return first+second== my.first+my.second;
	}

}