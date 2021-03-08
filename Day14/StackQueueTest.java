package com.kosta.day14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {

	public static void main(String[] args) {
		method2();

	}

	private static void method2() {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("��");
		queue.offer("ȭ");
		queue.offer("��");
		queue.offer("��");
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		//System.out.println(queue.poll());
		System.out.println(queue.size());
		
//		int count= queue.size();
//		for(int i=0;i<count;i++) {
//			System.out.println(i+"-->"+queue.poll());
//		}
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		System.out.println(queue.size());
	}

	private static void method1() {
		// Stack (LIFO : Last In First Out)
		Stack<String> st= new Stack<>();
		st.push("��");
		st.push("ȭ");
		st.push("��");
		st.add("��");
		st.add("��");
		
		System.out.println(st.size()+"��");
		System.out.println("������ ��: "+st.get(st.size()-1));
		System.out.println("������ ��: "+st.peek());
		System.out.println(st.size()+"��");
		System.out.println("������ ��: "+st.pop());
		System.out.println(st.size()+"��");
		
	}

}
