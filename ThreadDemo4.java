/*
 * ThreadDemo4.class
 * 多线程--同步函数
 * Copyright 2016 struggleYang <1724555319@qq.com>
 * 需求：
 * 有一个银行金库，有两个储户分别存300元，存三次
 * 找出线程问题，用同步解决
 */
class Bank {
	private int sum;
	//Object obj = new Object();
	public synchronized void add(int n) {
		//synchronized(obj) {
			sum = sum + n;
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {}
			System.out.println("sum = "+sum);
		//}
	}
}
class Cus implements Runnable {
	Bank b = new Bank();
	public void run() {
		for (int i = 0; i < 3; i++) {
			b.add(100);
		}
	}
}
public class ThreadDemo4 {
	public static void main (String args[]) {
		Cus c = new Cus();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}

