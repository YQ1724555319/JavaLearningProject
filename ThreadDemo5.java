/**
@Yq
多线程--同步函数的锁是this
同步代码块和同步函数都具有相同的性质，都具有同步性，也就是都是一个锁。那么同步函数在没有指定对象的时候使用的是哪一个锁？
解析：同步函数需要被线程对象调用。那么函数都有一个所属对象引用this。所以同步函数使用的锁是this。也就是线程或者说run方法所属对象的引用。

那么，在同步代码块中，也可以不用创建第三方对象，而直接在synchronized中填入this，也简化了书写
*/
class Ticket implements Runnable {
	private static int ticket = 100;
	public void run() {
		while (true) {
			show();
		}
	}
	public synchronized void show() { // 有一个对象的引用this，this就是同步函数的锁
		if (ticket > 0) {
			try {
				Thread.sleep(30); // 放大安全问题
			}
			catch(InterruptedException e) {
				e.toString();
			}
			System.out.println(Thread.currentThread().getName()+"----"+ticket--);
			}
		else System.exit(0); // 结束程序
	}
}

public class ThreadDemo5 {
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

