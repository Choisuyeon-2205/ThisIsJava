package com.kosta.day12;

public class ThreadTest {

	public static void main(String[] args) {
		method4();

	}

	private static void method4() {
		AutoSaveThread t = new AutoSaveThread("�ڵ����� ������");
		t.setDaemon(true); //�������� ����.. ���� ����� ���� ����ȴ�.
		t.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("main END");
		
	}

	private static void method3() {
		Thread t1= new PrintThread2();
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.interrupt();
		
	}

	private static void method2() {
		Thread t1= new PrintThread1();
		t1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		((PrintThread1)t1).setStop(true);
		System.out.println("main END");
		
	}

	private static void method1() {
		MailBox box= new MailBox();
		String[] messages= {"����!","����","�߰�~"};
		Thread readerThread= new ReaderThread(box,messages.length);
		WriterThread writer= new WriterThread(box, messages);  //Runnable writer
		Thread writerThread= new Thread(writer);
		
		readerThread.start();
		writerThread.start();
		
		
		
	}

}
