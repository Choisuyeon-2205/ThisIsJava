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
		queue.offer("월");
		queue.offer("화");
		queue.offer("수");
		queue.offer("목");
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
		st.push("월");
		st.push("화");
		st.push("수");
		st.add("토");
		st.add("일");
		
		System.out.println(st.size()+"건");
		System.out.println("마지막 값: "+st.get(st.size()-1));
		System.out.println("마지막 값: "+st.peek());
		System.out.println(st.size()+"건");
		System.out.println("마지막 값: "+st.pop());
		System.out.println(st.size()+"건");
		
	}

}
