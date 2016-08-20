/**
 * 多线程-线程的安全问题
 * 如果在编写多线程程序时，特定场合使用多线程，就会出现一些安全问题，会使一些运算结果超出设定。
 *原因：
 *	当多条语句在操作同一线程共享数据时，一个线程对多条语句只执行了一部分，还没有执行完，另一个线程参与进来执行。导致共享数据错误。
 *解决办法：
 *	对多条操作共享数据的语句，只能让一个线程都执行完 。在执行过程中，其他线程不可以参与执行。
 *java对于多线程的安全问题提供了专业的解决方案。
 *就是同步代码块：
 *用法为：
synchronized(对象) {
	需要被同步的代码
}
 */

class Ticket implements Runnable {
	private int ticket = 100;
	Object o = new Object();
	public void run() {
		while (true) {
			synchronized(o) { // 同步在{}内的代码，这样就解决了线程的安全问题
				if (ticket > 0) {
					try {
						Thread.sleep(10); // 会引发安全问题，最后会输出超过预设值，所以要使用同步代码块来操作
					}
					catch(InterruptedException e) {
						e.toString();
					}
					System.out.println(Thread.currentThread().getName()+"----"+ticket--);
				}
				else System.exit(0); // 结束程序
			}
		}
	}
}

public class ThreadDemo3 {
	public static void main(String[] args) {
		Ticket t = new Ticket(); 
		Thread t1 = new Thread(t);  // 建立一个线程，并且这个线程属于对象t
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start(); 
		t2.start();
		t3.start();
		t4.start();
	}
}
